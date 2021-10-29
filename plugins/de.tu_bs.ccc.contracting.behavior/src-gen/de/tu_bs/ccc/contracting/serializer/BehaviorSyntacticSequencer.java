/*
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.serializer;

import com.google.inject.Inject;
import de.tu_bs.ccc.contracting.services.BehaviorGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BehaviorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BehaviorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Behavior_SemicolonKeyword_6_2_1_q;
	protected AbstractElementAlias match_Behavior_SemicolonKeyword_7_2_1_q;
	protected AbstractElementAlias match_Behavior_SemicolonKeyword_8_2_1_q;
	protected AbstractElementAlias match_Behavior___EventsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_Behavior___SignalsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_Behavior___VarsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_FIntegerInterval___LeftParenthesisKeyword_2_0_MinIntKeyword_2_1_1_CommaKeyword_2_2_MaxIntKeyword_2_3_1_RightParenthesisKeyword_2_4__q;
	protected AbstractElementAlias match_MethodSignature___ColonKeyword_4_0_VoidKeyword_4_1_0__q;
	protected AbstractElementAlias match_SignalSignature___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_StandardOperation___ColonKeyword_7_0_VoidKeyword_7_1_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BehaviorGrammarAccess) access;
		match_Behavior_SemicolonKeyword_6_2_1_q = new TokenAlias(false, true, grammarAccess.getBehaviorAccess().getSemicolonKeyword_6_2_1());
		match_Behavior_SemicolonKeyword_7_2_1_q = new TokenAlias(false, true, grammarAccess.getBehaviorAccess().getSemicolonKeyword_7_2_1());
		match_Behavior_SemicolonKeyword_8_2_1_q = new TokenAlias(false, true, grammarAccess.getBehaviorAccess().getSemicolonKeyword_8_2_1());
		match_Behavior___EventsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getEventsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7_3()));
		match_Behavior___SignalsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getSignalsKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8_3()));
		match_Behavior___VarsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getVarsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_6_3()));
		match_FIntegerInterval___LeftParenthesisKeyword_2_0_MinIntKeyword_2_1_1_CommaKeyword_2_2_MaxIntKeyword_2_3_1_RightParenthesisKeyword_2_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFIntegerIntervalAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getFIntegerIntervalAccess().getMinIntKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getFIntegerIntervalAccess().getCommaKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getFIntegerIntervalAccess().getMaxIntKeyword_2_3_1()), new TokenAlias(false, false, grammarAccess.getFIntegerIntervalAccess().getRightParenthesisKeyword_2_4()));
		match_MethodSignature___ColonKeyword_4_0_VoidKeyword_4_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMethodSignatureAccess().getColonKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getMethodSignatureAccess().getVoidKeyword_4_1_0()));
		match_SignalSignature___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSignalSignatureAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSignalSignatureAccess().getRightParenthesisKeyword_1_2()));
		match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getSimplePrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getSimplePrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_StandardOperation___ColonKeyword_7_0_VoidKeyword_7_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStandardOperationAccess().getColonKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getStandardOperationAccess().getVoidKeyword_7_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Behavior_SemicolonKeyword_6_2_1_q.equals(syntax))
				emit_Behavior_SemicolonKeyword_6_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Behavior_SemicolonKeyword_7_2_1_q.equals(syntax))
				emit_Behavior_SemicolonKeyword_7_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Behavior_SemicolonKeyword_8_2_1_q.equals(syntax))
				emit_Behavior_SemicolonKeyword_8_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Behavior___EventsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_Behavior___EventsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Behavior___SignalsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_Behavior___SignalsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Behavior___VarsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Behavior___VarsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FIntegerInterval___LeftParenthesisKeyword_2_0_MinIntKeyword_2_1_1_CommaKeyword_2_2_MaxIntKeyword_2_3_1_RightParenthesisKeyword_2_4__q.equals(syntax))
				emit_FIntegerInterval___LeftParenthesisKeyword_2_0_MinIntKeyword_2_1_1_CommaKeyword_2_2_MaxIntKeyword_2_3_1_RightParenthesisKeyword_2_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MethodSignature___ColonKeyword_4_0_VoidKeyword_4_1_0__q.equals(syntax))
				emit_MethodSignature___ColonKeyword_4_0_VoidKeyword_4_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SignalSignature___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_SignalSignature___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StandardOperation___ColonKeyword_7_0_VoidKeyword_7_1_0__q.equals(syntax))
				emit_StandardOperation___ColonKeyword_7_0_VoidKeyword_7_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     variables+=FDeclaration (ambiguity) '}' 'events' '{' events+=EventBinding
	 *     variables+=FDeclaration (ambiguity) '}' ('events' '{' '}')? 'signals' '{' signals+=Signal
	 *     variables+=FDeclaration (ambiguity) '}' ('events' '{' '}')? ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     variables+=FDeclaration (ambiguity) '}' ('events' '{' '}')? ('signals' '{' '}')? 'FSM' name=ID
	 *     variables+=FDeclaration (ambiguity) '}' ('events' '{' '}')? ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     variables+=FDeclaration (ambiguity) '}' ('events' '{' '}')? ('signals' '{' '}')? operations+=StandardOperation
	 *     variables+=FDeclaration (ambiguity) variables+=FDeclaration
	 */
	protected void emit_Behavior_SemicolonKeyword_6_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     events+=EventBinding (ambiguity) '}' 'signals' '{' signals+=Signal
	 *     events+=EventBinding (ambiguity) '}' ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     events+=EventBinding (ambiguity) '}' ('signals' '{' '}')? 'FSM' name=ID
	 *     events+=EventBinding (ambiguity) '}' ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     events+=EventBinding (ambiguity) '}' ('signals' '{' '}')? operations+=StandardOperation
	 *     events+=EventBinding (ambiguity) events+=EventBinding
	 */
	protected void emit_Behavior_SemicolonKeyword_7_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     signals+=Signal (ambiguity) '}' 'FSM' '}' (rule end)
	 *     signals+=Signal (ambiguity) '}' 'FSM' name=ID
	 *     signals+=Signal (ambiguity) '}' 'FSM' stateGraphs+=FStateGraph
	 *     signals+=Signal (ambiguity) '}' operations+=StandardOperation
	 *     signals+=Signal (ambiguity) signals+=Signal
	 */
	protected void emit_Behavior_SemicolonKeyword_8_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('events' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? (ambiguity) 'signals' '{' signals+=Signal
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' '}' (rule start)
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' name=ID
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? operations+=StandardOperation
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? (ambiguity) 'signals' '{' signals+=Signal
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' name=ID
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? operations+=StandardOperation
	 *     componentName=ID '{' ('vars' '{' '}')? (ambiguity) 'signals' '{' signals+=Signal
	 *     componentName=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     componentName=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' name=ID
	 *     componentName=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     componentName=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? operations+=StandardOperation
	 *     name=ID '{' ('vars' '{' '}')? (ambiguity) 'signals' '{' signals+=Signal
	 *     name=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     name=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' name=ID
	 *     name=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     name=ID '{' ('vars' '{' '}')? (ambiguity) ('signals' '{' '}')? operations+=StandardOperation
	 *     variables+=FDeclaration ';'? '}' (ambiguity) 'signals' '{' signals+=Signal
	 *     variables+=FDeclaration ';'? '}' (ambiguity) ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     variables+=FDeclaration ';'? '}' (ambiguity) ('signals' '{' '}')? 'FSM' name=ID
	 *     variables+=FDeclaration ';'? '}' (ambiguity) ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     variables+=FDeclaration ';'? '}' (ambiguity) ('signals' '{' '}')? operations+=StandardOperation
	 */
	protected void emit_Behavior___EventsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('signals' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' '}' (rule start)
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' name=ID
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     (rule start) 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) operations+=StandardOperation
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' '}' (rule end)
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' name=ID
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     comment=AnnotationBlock 'Behavior' '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) operations+=StandardOperation
	 *     componentName=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' '}' (rule end)
	 *     componentName=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' name=ID
	 *     componentName=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     componentName=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) operations+=StandardOperation
	 *     events+=EventBinding ';'? '}' (ambiguity) 'FSM' '}' (rule end)
	 *     events+=EventBinding ';'? '}' (ambiguity) 'FSM' name=ID
	 *     events+=EventBinding ';'? '}' (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     events+=EventBinding ';'? '}' (ambiguity) operations+=StandardOperation
	 *     name=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' '}' (rule end)
	 *     name=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' name=ID
	 *     name=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     name=ID '{' ('vars' '{' '}')? ('events' '{' '}')? (ambiguity) operations+=StandardOperation
	 *     variables+=FDeclaration ';'? '}' ('events' '{' '}')? (ambiguity) 'FSM' '}' (rule end)
	 *     variables+=FDeclaration ';'? '}' ('events' '{' '}')? (ambiguity) 'FSM' name=ID
	 *     variables+=FDeclaration ';'? '}' ('events' '{' '}')? (ambiguity) 'FSM' stateGraphs+=FStateGraph
	 *     variables+=FDeclaration ';'? '}' ('events' '{' '}')? (ambiguity) operations+=StandardOperation
	 */
	protected void emit_Behavior___SignalsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('vars' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Behavior' '{' (ambiguity) 'events' '{' events+=EventBinding
	 *     (rule start) 'Behavior' '{' (ambiguity) ('events' '{' '}')? 'signals' '{' signals+=Signal
	 *     (rule start) 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' '}' (rule start)
	 *     (rule start) 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' name=ID
	 *     (rule start) 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     (rule start) 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? operations+=StandardOperation
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) 'events' '{' events+=EventBinding
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) ('events' '{' '}')? 'signals' '{' signals+=Signal
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' name=ID
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     comment=AnnotationBlock 'Behavior' '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? operations+=StandardOperation
	 *     componentName=ID '{' (ambiguity) 'events' '{' events+=EventBinding
	 *     componentName=ID '{' (ambiguity) ('events' '{' '}')? 'signals' '{' signals+=Signal
	 *     componentName=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     componentName=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' name=ID
	 *     componentName=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     componentName=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? operations+=StandardOperation
	 *     name=ID '{' (ambiguity) 'events' '{' events+=EventBinding
	 *     name=ID '{' (ambiguity) ('events' '{' '}')? 'signals' '{' signals+=Signal
	 *     name=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' '}' (rule end)
	 *     name=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' name=ID
	 *     name=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? 'FSM' stateGraphs+=FStateGraph
	 *     name=ID '{' (ambiguity) ('events' '{' '}')? ('signals' '{' '}')? operations+=StandardOperation
	 */
	protected void emit_Behavior___VarsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' 'minInt' ',' 'maxInt' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Integer' (ambiguity) (rule start)
	 */
	protected void emit_FIntegerInterval___LeftParenthesisKeyword_2_0_MinIntKeyword_2_1_1_CommaKeyword_2_2_MaxIntKeyword_2_3_1_RightParenthesisKeyword_2_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (':' 'void')?
	 *
	 * This ambiguous syntax occurs at:
	 *     arguments+=VarDecl ')' (ambiguity) (rule end)
	 *     name=FQN '(' ')' (ambiguity) (rule end)
	 */
	protected void emit_MethodSignature___ColonKeyword_4_0_VoidKeyword_4_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_SignalSignature___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) element=FQN
	 *     (rule start) (ambiguity) op=OperatorUnary
	 *     (rule start) (ambiguity) val=EBoolean
	 *     (rule start) (ambiguity) val=E_BigInteger
	 *     (rule start) (ambiguity) val=E_DOUBLE_OBJECT
	 *     (rule start) (ambiguity) val=E_FLOAT_OBJECT
	 *     (rule start) (ambiguity) val=STRING
	 *     (rule start) (ambiguity) {FBinaryOperation.left=}
	 *     (rule start) (ambiguity) {FQualifiedElementRef.qualifier=}
	 */
	protected void emit_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) op=OperatorUnary
	 *     (rule start) (ambiguity) {FBinaryOperation.left=}
	 */
	protected void emit_SimplePrimaryExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (':' 'void')?
	 *
	 * This ambiguous syntax occurs at:
	 *     arguments+=VarDecl ')' (ambiguity) '{' contract=SpecificationBlock
	 *     name=ID '(' ')' (ambiguity) '{' contract=SpecificationBlock
	 */
	protected void emit_StandardOperation___ColonKeyword_7_0_VoidKeyword_7_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}