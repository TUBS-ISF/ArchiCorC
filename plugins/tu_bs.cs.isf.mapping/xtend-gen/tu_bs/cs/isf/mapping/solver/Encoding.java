package tu_bs.cs.isf.mapping.solver;

import de.tu_bs.ccc.contracting.idl.cidl.ContractPair;
import de.tu_bs.ccc.contracting.idl.cidl.Ensures;
import de.tu_bs.ccc.contracting.idl.cidl.Requires;
import de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelFactory;
import de.tu_bs.cs.isf.cbc.cbcmodel.Condition;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class Encoding {
  public static List<Condition> getCondition(final List<ContractPair> cp) {
    List<Condition> conditions = new ArrayList<Condition>();
    List<Requires> requires = new ArrayList<Requires>();
    List<Ensures> ensures = new ArrayList<Ensures>();
    int _size = cp.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      int _size_1 = cp.get((i).intValue()).getReq().size();
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
      for (final Integer j : _doubleDotLessThan_1) {
        {
          final Requires req = cp.get((i).intValue()).getReq().get((j).intValue());
          requires.add(req);
          final Ensures ens = cp.get((i).intValue()).getEns().get((j).intValue());
          ensures.add(ens);
        }
      }
    }
    int _size_2 = requires.size();
    boolean _greaterThan = (_size_2 > 1);
    if (_greaterThan) {
      final Condition req = CbcmodelFactory.eINSTANCE.createCondition();
      req.setName("true");
      conditions.add(req);
      final Condition ens = CbcmodelFactory.eINSTANCE.createCondition();
      String _encoding = Encoding.encoding(requires.get(0).getExpr());
      String _plus = ("(" + _encoding);
      String _plus_1 = (_plus + "->");
      String _encoding_1 = Encoding.encoding(ensures.get(0).getExpr());
      String _plus_2 = (_plus_1 + _encoding_1);
      String ensString = (_plus_2 + ")");
      int _size_3 = requires.size();
      ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(1, _size_3, true);
      for (final Integer j_1 : _doubleDotLessThan_2) {
        {
          final String reqj = Encoding.encoding(requires.get((j_1).intValue()).getExpr());
          final String ensj = Encoding.encoding(ensures.get((j_1).intValue()).getExpr());
          ensString = (((((ensString + "&(") + reqj) + "->") + ensj) + ")");
        }
      }
      ens.setName(ensString);
      conditions.add(ens);
    } else {
      final Condition req_1 = CbcmodelFactory.eINSTANCE.createCondition();
      final String req0 = Encoding.encoding(requires.get(0).getExpr());
      req_1.setName(req0);
      conditions.add(req_1);
      final Condition ens_1 = CbcmodelFactory.eINSTANCE.createCondition();
      final String ens0 = Encoding.encoding(ensures.get(0).getExpr());
      ens_1.setName(ens0);
      conditions.add(ens_1);
    }
    return conditions;
  }
  
  public static String encoding(final String s) {
    String t = s;
    boolean _contains = t.contains("\\forall");
    if (_contains) {
      final StringBuffer buffer = new StringBuffer(t);
      final int forall = buffer.indexOf("\\forall");
      final int first = buffer.indexOf(";", forall);
      buffer.insert((first + 1), "(");
      final int second = buffer.indexOf(";", (first + 2));
      buffer.replace(second, (second + 1), "-");
      buffer.insert((second + 1), ">");
      final int third = buffer.indexOf(";", second);
      buffer.replace(third, (third + 1), ")");
      t = buffer.toString();
    }
    boolean _contains_1 = t.contains("\\exists");
    if (_contains_1) {
      final StringBuffer buffer_1 = new StringBuffer(t);
      final int exists = buffer_1.indexOf("\\exists");
      final int first_1 = buffer_1.indexOf(";", exists);
      buffer_1.insert((first_1 + 1), "(");
      final int second_1 = buffer_1.indexOf(";", (first_1 + 2));
      buffer_1.replace(second_1, (second_1 + 1), "&");
      final int third_1 = buffer_1.indexOf(";", second_1);
      buffer_1.replace(third_1, (third_1 + 1), ")");
      t = buffer_1.toString();
    }
    boolean _contains_2 = t.contains("\\sum");
    if (_contains_2) {
      final StringBuffer buffer_2 = new StringBuffer(t);
      final int sum = buffer_2.indexOf("\\sum");
      buffer_2.replace(sum, (sum + 5), "bsum {");
      final int first_2 = buffer_2.indexOf(";", sum);
      buffer_2.insert((first_2 + 1), "}(");
      final int smaller = buffer_2.indexOf("<", first_2);
      final int smaller2 = buffer_2.indexOf("<", (smaller + 1));
      buffer_2.replace(smaller, (smaller2 + 1), ",");
      final int second_2 = buffer_2.indexOf(";", (first_2 + 2));
      buffer_2.replace(second_2, (second_2 + 1), ",");
      final int third_2 = buffer_2.indexOf(";", second_2);
      buffer_2.replace(third_2, (third_2 + 1), ")");
      t = buffer_2.toString();
    }
    boolean _contains_3 = t.contains("\\product");
    if (_contains_3) {
      final StringBuffer buffer_3 = new StringBuffer(t);
      final int product = buffer_3.indexOf("\\product");
      buffer_3.replace(product, (product + 9), "bprod {");
      final int first_3 = buffer_3.indexOf(";", product);
      buffer_3.insert((first_3 + 1), "}(");
      final int smaller_1 = buffer_3.indexOf("<", first_3);
      final int smaller2_1 = buffer_3.indexOf("<", (smaller_1 + 1));
      final int smallerEqual2 = buffer_3.indexOf("<=", (smaller_1 + 1));
      if ((smaller2_1 == smallerEqual2)) {
        buffer_3.replace(smaller_1, (smaller2_1 + 2), ",");
      } else {
        buffer_3.replace(smaller_1, (smaller2_1 + 1), ",");
      }
      final int second_3 = buffer_3.indexOf(";", (first_3 + 2));
      buffer_3.replace(second_3, (second_3 + 1), ",");
      final int third_3 = buffer_3.indexOf(";", second_3);
      buffer_3.replace(third_3, (third_3 + 1), ")");
      t = buffer_3.toString();
    }
    boolean _contains_4 = t.contains("\\max");
    if (_contains_4) {
      t = t.replace("\\max", "max {");
      final StringBuffer buffer_4 = new StringBuffer(t);
      final int first_4 = buffer_4.indexOf(";");
      buffer_4.replace(first_4, (first_4 + 1), ";}(\\if(");
      final int second_4 = buffer_4.indexOf(";", (first_4 + 2));
      buffer_4.replace(second_4, (second_4 + 1), ")\\then (TRUE)\\else (FALSE),");
      t = buffer_4.toString();
    }
    boolean _contains_5 = t.contains("\\min");
    if (_contains_5) {
      t = t.replace("\\min", "min {");
      final StringBuffer buffer_5 = new StringBuffer(t);
      final int first_5 = buffer_5.indexOf(";");
      buffer_5.replace(first_5, (first_5 + 1), ";}(\\if(");
      final int second_5 = buffer_5.indexOf(";", (first_5 + 2));
      buffer_5.replace(second_5, (second_5 + 1), ")\\then (TRUE)\\else (FALSE),");
      t = buffer_5.toString();
    }
    t = t.replace("==>", "->");
    t = t.replace("==", "=");
    t = t.replace("&&", "&");
    t = t.replace("||", "|");
    t = t.replace("\"", "");
    return t;
  }
}
