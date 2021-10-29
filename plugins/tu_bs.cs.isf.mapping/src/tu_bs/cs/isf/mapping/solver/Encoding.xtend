package tu_bs.cs.isf.mapping.solver

import de.tu_bs.ccc.contracting.idl.cidl.ContractPair
import de.tu_bs.ccc.contracting.idl.cidl.Ensures
import de.tu_bs.ccc.contracting.idl.cidl.Requires
import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelFactory
import de.tu_bs.cs.isf.cbc.cbcmodel.Condition
import java.util.ArrayList
import java.util.List
import tu_bs.cs.isf.mapping.validation.Console

class Encoding {
	
	def static List<Condition> getCondition (List<ContractPair> cp){
		var List<Condition> conditions = new ArrayList<Condition>
		var List<Requires> requires = new ArrayList<Requires>
		var List<Ensures> ensures = new ArrayList<Ensures>
		
		for (i : 0 ..< cp.size){
			for (j : 0 ..< cp.get(i).req.size){
				val Requires req = cp.get(i).req.get(j)
				requires.add(req)
				val Ensures ens = cp.get(i).ens.get(j)
				ensures.add(ens)
			}	
		}

		if(requires.size > 1) {
			val Condition req = CbcmodelFactory.eINSTANCE.createCondition
			req.setName("true")
			conditions.add(req)
			val Condition ens =CbcmodelFactory.eINSTANCE.createCondition
			var String ensString = "(" +encoding(requires.get(0).expr) + "->" + encoding(ensures.get(0).expr) + ")"
			for (j : 1 ..< requires.size) {
				val String reqj = encoding(requires.get(j).expr)
				val String ensj = encoding(ensures.get(j).expr)
				ensString = ensString + "&(" + reqj + "->" + ensj + ")"
			}
			ens.setName(ensString)
			conditions.add(ens)
		} else {
			val Condition req = CbcmodelFactory.eINSTANCE.createCondition
			val String req0 = encoding(requires.get(0).expr)
			req.setName(req0)
			conditions.add(req)
			val Condition ens = CbcmodelFactory.eINSTANCE.createCondition
			val String ens0 = encoding(ensures.get(0).expr)
			ens.setName(ens0)
			conditions.add(ens)
		}
		return conditions
	}
	
	def static String encoding (String s){
		var String t = s
		//Console.println("original: "+t)
		t = t.replace("\";", "")
		t = t.replace("\"", "")
		//\old(...) to old_...
		while(t.contains("\\old")){
			val int i = t.indexOf("\\old")
			val int i2 = t.indexOf(")", i+3)
			val String c = t.subSequence(i+5, i2).toString
			val String changed = "old_"+c
			val StringBuffer buffer = new StringBuffer(t)
			buffer.replace(i,i2+1, changed)
			t = buffer.toString
		}
		var String[] arr = t.split("&&")
		var String t2 = ""
		for(var int i = 0; i < arr.length; i++){
			
			var String v = arr.get(i)
			//Console.println(v)
			if(v.contains("\\forall")||v.contains("\\exists")||v.contains("\\sum")||
				v.contains("\\product")||v.contains("\\max")||v.contains("\\min")){
				v = encodingFunction(v)
			}
			if(i == 0){
				t2 = v
			} else {
				t2 += "&"+v
			}
		}
		
		t = t2	
		t = t.replace("==>", "->")
		t = t.replace("==", "=")
		t = t.replace("||", "|")
		
		//Console.println("changed: "+t)
		return t
	}

	def static String encodingFunction(String function) {
		var String f = function
		val int b = f.indexOf("\\")
		val String a = f.charAt(b+1).toString
		
		if(a.equals("f")){
			val StringBuffer buffer = new StringBuffer(f)
			val int first = buffer.indexOf(";")
			buffer.insert(first+1, "(")
			val int intType = buffer.indexOf("int")
			val String intName = buffer.substring(intType+4, first)
			val int second = buffer.indexOf(";", first+2)
			buffer.replace(second, second+1, "<")
			buffer.insert(second+1, "="+intName+"&"+intName+"<")
			val int third = buffer.indexOf(";", second+2)
			buffer.replace(third, third+1, "-")
			buffer.insert(third+1,">")
			val String subString = buffer.substring(third+2, buffer.length-2)
			if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
				subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(third+2, buffer.length-2, newSubString)
			}
			buffer.append(")")
			f = buffer.toString
			
		} else if(a.equals("e")){
			val StringBuffer buffer = new StringBuffer(f)
			val int first = buffer.indexOf(";")
			buffer.insert(first+1, "(")
			val int intType = buffer.indexOf("int")
			val String intName = buffer.substring(intType+4, first)
			val int second = buffer.indexOf(";", first+2)
			buffer.replace(second, second+1, "<")
			buffer.insert(second+1, "="+intName+"&"+intName+"<")
			val int third = buffer.indexOf(";", second+2)
			buffer.replace(third, third+1, "&")
			val String subString = buffer.substring(third+2, buffer.length-2)
			if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
				subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(third+2, buffer.length-2, newSubString)
			}
			buffer.append(")")
			f = buffer.toString
						
		} else if(a.equals("s")){
			val StringBuffer buffer = new StringBuffer(f)
			val int sum = buffer.indexOf("\\sum")
			buffer.replace(sum, sum+5, "bsum {")
			val int first = buffer.indexOf(";", sum)
			buffer.insert(first+1, "}(")
			val int second = buffer.indexOf(";", first+2)
			buffer.replace(second, second+1, ",")
			val int third = buffer.indexOf(";", second+1)
			buffer.replace(third, third+1, ",")
			val String subString = buffer.substring(third+2, buffer.length-2)
			if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
				subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(third+2, buffer.length-2, newSubString)
			}
			buffer.append(")")
			f = buffer.toString
			
		}else if(a.equals("p")){
			val StringBuffer buffer = new StringBuffer(f)
			val int prod = buffer.indexOf("\\product")
			buffer.replace(prod, prod+9, "bprod {")
			val int first = buffer.indexOf(";", prod)
			buffer.insert(first+1, "}(")
			val int second = buffer.indexOf(";", first+2)
			buffer.replace(second, second+1, ",")
			val int third = buffer.indexOf(";", second+1)
			buffer.replace(third, third+1, ",")
			val String subString = buffer.substring(third+2, buffer.length-2)
			if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
				subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(third+2, buffer.length-2, newSubString)
			}
			buffer.append(")")
			f = buffer.toString
			
		}else if(a.equals("m")){
			val String c = f.charAt(b+2).toString
			if(c.equals("a")){
				f = f.replace("\\max", "max {")
				val StringBuffer buffer = new StringBuffer(f)
				val int first = buffer.indexOf(";")
				buffer.insert(first+1, "}(\\if(")
				val int intType = buffer.indexOf("int")
				val String intName = buffer.substring(intType+4, first)
				val int second = buffer.indexOf(";", first+2)
				buffer.replace(second, second+1, "<")
				buffer.insert(second+1, "="+intName+"&"+intName+"<")
				val int third = buffer.indexOf(";", second+1)
				buffer.replace(third, third+1, ")\\then (TRUE)\\else (FALSE),")
				val int fourth = buffer.indexOf(",", third)
				val String subString = buffer.substring(fourth+1, buffer.length-2)
				if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
					subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(fourth+1, buffer.length-2, newSubString)
				}
				buffer.append(")")
				f = buffer.toString
				
			} else if(c.equals("i")){
				f = f.replace("\\min", "min {")
				val StringBuffer buffer = new StringBuffer(f)
				val int first = buffer.indexOf(";")
				buffer.insert(first+1, "}(\\if(")
				val int intType = buffer.indexOf("int")
				val String intName = buffer.substring(intType+4, first)
				val int second = buffer.indexOf(";", first+2)
				buffer.replace(second, second+1, "<")
				buffer.insert(second+1, "="+intName+"&"+intName+"<")
				val int third = buffer.indexOf(";", second+1)
				buffer.replace(third, third+1, ")\\then (TRUE)\\else (FALSE),")
				val int fourth = buffer.indexOf(",", third)
				val String subString = buffer.substring(fourth+1, buffer.length-2)
				if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
					subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
					val String newSubString = encodingFunction(subString)
					buffer.replace(fourth+1, buffer.length-2, newSubString)
				}
				buffer.append(")")
				f = buffer.toString
			}
			
		}
		
		return f
	}
	
}