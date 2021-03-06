/*
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.serializer;

import com.google.inject.Inject;
import de.darmstadt.tu.crossing.services.CrySLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CrySLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CrySLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AggregateExpression___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__q;
	protected AbstractElementAlias match_JvmWildcardTypeRef_EKeyword_1_2_or_QuestionMarkKeyword_1_0_or_TKeyword_1_1;
	protected AbstractElementAlias match_LitList___CommaKeyword_1_0_FullStopFullStopFullStopKeyword_1_1_1__a;
	protected AbstractElementAlias match_LitList___FullStopFullStopFullStopKeyword_1_1_1_CommaKeyword_1_0__a;
	protected AbstractElementAlias match_Operand_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Operand_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_SuPar_ThisKeyword_1_2_or__Keyword_1_1;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CrySLGrammarAccess) access;
		match_AggregateExpression___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAggregateExpressionAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAggregateExpressionAccess().getIDTerminalRuleCall_1_1()));
		match_JvmWildcardTypeRef_EKeyword_1_2_or_QuestionMarkKeyword_1_0_or_TKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJvmWildcardTypeRefAccess().getEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getJvmWildcardTypeRefAccess().getQuestionMarkKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getJvmWildcardTypeRefAccess().getTKeyword_1_1()));
		match_LitList___CommaKeyword_1_0_FullStopFullStopFullStopKeyword_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLitListAccess().getCommaKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getLitListAccess().getFullStopFullStopFullStopKeyword_1_1_1()));
		match_LitList___FullStopFullStopFullStopKeyword_1_1_1_CommaKeyword_1_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLitListAccess().getFullStopFullStopFullStopKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getLitListAccess().getCommaKeyword_1_0()));
		match_Operand_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
		match_Operand_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_SuPar_ThisKeyword_1_2_or__Keyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSuParAccess().getThisKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getSuParAccess().get_Keyword_1_1()));
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[ ]";
	}
	
	/**
	 * terminal ID:
	 * 	'^'? ('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'$'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AggregateExpression___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__q.equals(syntax))
				emit_AggregateExpression___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_JvmWildcardTypeRef_EKeyword_1_2_or_QuestionMarkKeyword_1_0_or_TKeyword_1_1.equals(syntax))
				emit_JvmWildcardTypeRef_EKeyword_1_2_or_QuestionMarkKeyword_1_0_or_TKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LitList___CommaKeyword_1_0_FullStopFullStopFullStopKeyword_1_1_1__a.equals(syntax))
				emit_LitList___CommaKeyword_1_0_FullStopFullStopFullStopKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LitList___FullStopFullStopFullStopKeyword_1_1_1_CommaKeyword_1_0__a.equals(syntax))
				emit_LitList___FullStopFullStopFullStopKeyword_1_1_1_CommaKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Operand_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Operand_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Operand_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Operand_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SuPar_ThisKeyword_1_2_or__Keyword_1_1.equals(syntax))
				emit_SuPar_ThisKeyword_1_2_or__Keyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('.' ID)?
	 *
	 * This ambiguous syntax occurs at:
	 *     value=[SuperType|ID] (ambiguity) (rule end)
	 */
	protected void emit_AggregateExpression___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '?' | 'T' | 'E'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_JvmWildcardTypeRef_EKeyword_1_2_or_QuestionMarkKeyword_1_0_or_TKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (',' '...')*
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=Literal (ambiguity) (rule end)
	 */
	protected void emit_LitList___CommaKeyword_1_0_FullStopFullStopFullStopKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('...' ',')*
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=Literal ',' (ambiguity) parameters+=Literal
	 */
	protected void emit_LitList___FullStopFullStopFullStopKeyword_1_1_1_CommaKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) cons=ArrayElements
	 *     (rule start) (ambiguity) cons=LiteralExpression
	 *     (rule start) (ambiguity) operator=UnaryPreOperator
	 *     (rule start) (ambiguity) {ArithmeticExpression.leftExpression=}
	 *     (rule start) (ambiguity) {ComparisonExpression.leftExpression=}
	 *     (rule start) (ambiguity) {Constraint.leftExpression=}
	 */
	protected void emit_Operand_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) operator=UnaryPreOperator
	 *     (rule start) (ambiguity) {ArithmeticExpression.leftExpression=}
	 *     (rule start) (ambiguity) {ComparisonExpression.leftExpression=}
	 *     (rule start) (ambiguity) {Constraint.leftExpression=}
	 */
	protected void emit_Operand_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '*' (rule start)
	 *     (rule start) (ambiguity) orderEv+=[Event|ID]
	 *     (rule start) (ambiguity) {Order.left=}
	 *     (rule start) (ambiguity) {SimpleOrder.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '*' ')' (rule start)
	 *     (rule start) (ambiguity) '*' ')' elementop='*'
	 *     (rule start) (ambiguity) '*' ')' elementop='+'
	 *     (rule start) (ambiguity) '*' ')' elementop='?'
	 *     (rule start) (ambiguity) {Order.left=}
	 *     (rule start) (ambiguity) {SimpleOrder.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '_' | 'this'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_SuPar_ThisKeyword_1_2_or__Keyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=>' returnType=JvmTypeReference
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     importedNamespace=QualifiedNameWithWildcard (ambiguity) (rule end)
	 *     importedType=[JvmDeclaredType|QualifiedName] (ambiguity) (rule end)
	 *     memberName=ValidID (ambiguity) (rule end)
	 *     wildcard?='*' (ambiguity) (rule end)
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
