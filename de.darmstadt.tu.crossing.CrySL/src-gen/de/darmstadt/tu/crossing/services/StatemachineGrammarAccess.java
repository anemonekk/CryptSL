/*
 * generated by Xtext 2.23.0
 */
package de.darmstadt.tu.crossing.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class StatemachineGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class StatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.darmstadt.tu.crossing.Statemachine.Statemachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatemachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEventsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEventsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEventsEventParserRuleCall_1_1_0 = (RuleCall)cEventsAssignment_1_1.eContents().get(0);
		private final Keyword cEndKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cStatesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatesStateParserRuleCall_2_0 = (RuleCall)cStatesAssignment_2.eContents().get(0);
		
		//// is this the definition of the file ending for the generated dsl? Nope
		//Statemachine:
		//	{Statemachine} ('events'
		//	events+=Event+
		//	'end')?
		//	states+=State*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Statemachine} ('events' events+=Event+ 'end')? states+=State*
		public Group getGroup() { return cGroup; }
		
		//{Statemachine}
		public Action getStatemachineAction_0() { return cStatemachineAction_0; }
		
		//('events' events+=Event+ 'end')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'events'
		public Keyword getEventsKeyword_1_0() { return cEventsKeyword_1_0; }
		
		//events+=Event+
		public Assignment getEventsAssignment_1_1() { return cEventsAssignment_1_1; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_1_1_0() { return cEventsEventParserRuleCall_1_1_0; }
		
		//'end'
		public Keyword getEndKeyword_1_2() { return cEndKeyword_1_2; }
		
		//states+=State*
		public Assignment getStatesAssignment_2() { return cStatesAssignment_2; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_2_0() { return cStatesStateParserRuleCall_2_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.darmstadt.tu.crossing.Statemachine.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cCodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodeIDTerminalRuleCall_1_0 = (RuleCall)cCodeAssignment_1.eContents().get(0);
		
		//Event:
		//	name=ID code=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID code=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//code=ID
		public Assignment getCodeAssignment_1() { return cCodeAssignment_1; }
		
		//ID
		public RuleCall getCodeIDTerminalRuleCall_1_0() { return cCodeIDTerminalRuleCall_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.darmstadt.tu.crossing.Statemachine.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTransitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionsTransitionParserRuleCall_2_0 = (RuleCall)cTransitionsAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//State:
		//	'state' name=ID
		//	transitions+=Transition*
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'state' name=ID transitions+=Transition* 'end'
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_2() { return cTransitionsAssignment_2; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_2_0() { return cTransitionsTransitionParserRuleCall_2_0; }
		
		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.darmstadt.tu.crossing.Statemachine.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStateStateCrossReference_2_0 = (CrossReference)cStateAssignment_2.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_2_0_1 = (RuleCall)cStateStateCrossReference_2_0.eContents().get(1);
		
		//Transition:
		//	event=[Event] '=>' state=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//event=[Event] '=>' state=[State]
		public Group getGroup() { return cGroup; }
		
		//event=[Event]
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//state=[State]
		public Assignment getStateAssignment_2() { return cStateAssignment_2; }
		
		//[State]
		public CrossReference getStateStateCrossReference_2_0() { return cStateStateCrossReference_2_0; }
		
		//ID
		public RuleCall getStateStateIDTerminalRuleCall_2_0_1() { return cStateStateIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final StatemachineElements pStatemachine;
	private final EventElements pEvent;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;
	
	private final XtypeGrammarAccess gaXtype;

	@Inject
	public StatemachineGrammarAccess(GrammarProvider grammarProvider,
			XtypeGrammarAccess gaXtype) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXtype = gaXtype;
		this.pStatemachine = new StatemachineElements();
		this.pEvent = new EventElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.darmstadt.tu.crossing.Statemachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public XtypeGrammarAccess getXtypeGrammarAccess() {
		return gaXtype;
	}

	
	//// is this the definition of the file ending for the generated dsl? Nope
	//Statemachine:
	//	{Statemachine} ('events'
	//	events+=Event+
	//	'end')?
	//	states+=State*;
	public StatemachineElements getStatemachineAccess() {
		return pStatemachine;
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}
	
	//Event:
	//	name=ID code=ID;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//State:
	//	'state' name=ID
	//	transitions+=Transition*
	//	'end';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	event=[Event] '=>' state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)*
	//	| XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXtype.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}
	
	//ArrayBrackets:
	//	'[' ']';
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXtype.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}
	
	//XFunctionTypeRef:
	//	('(' (paramTypes+=JvmTypeReference (',' paramTypes+=JvmTypeReference)*)? ')')? '=>' returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXtype.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}
	
	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] (=> '<' arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)*
	//	'>' (=> ({JvmInnerTypeReference.outer=current} '.') type=[JvmType|ValidID] (=> '<'
	//	arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)* '>')?)*)?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXtype.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}
	
	//JvmArgumentTypeReference JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXtype.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}
	
	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} '?' (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*
	//	| constraints+=JvmLowerBound constraints+=JvmLowerBoundAnded*)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXtype.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}
	
	//JvmUpperBound:
	//	'extends' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXtype.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}
	
	//JvmUpperBoundAnded JvmUpperBound:
	//	'&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXtype.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}
	
	//JvmLowerBound:
	//	'super' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXtype.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}
	
	//JvmLowerBoundAnded JvmLowerBound:
	//	'&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundAndedElements getJvmLowerBoundAndedAccess() {
		return gaXtype.getJvmLowerBoundAndedAccess();
	}
	
	public ParserRule getJvmLowerBoundAndedRule() {
		return getJvmLowerBoundAndedAccess().getRule();
	}
	
	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXtype.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}
	
	//QualifiedName:
	//	ValidID ('.' ValidID)*;
	public XtypeGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXtype.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.' '*';
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXtype.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXtype.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//XImportSection:
	//	importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXtype.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}
	
	//XImportDeclaration:
	//	'import' (static?='static' extension?='extension'? importedType=[JvmDeclaredType|QualifiedNameInStaticImport]
	//	(wildcard?='*' | memberName=ValidID) | importedType=[JvmDeclaredType|QualifiedName] |
	//	importedNamespace=QualifiedNameWithWildcard) ';'?;
	public XtypeGrammarAccess.XImportDeclarationElements getXImportDeclarationAccess() {
		return gaXtype.getXImportDeclarationAccess();
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}
	
	//QualifiedNameInStaticImport:
	//	(ValidID '.')+;
	public XtypeGrammarAccess.QualifiedNameInStaticImportElements getQualifiedNameInStaticImportAccess() {
		return gaXtype.getQualifiedNameInStaticImportAccess();
	}
	
	public ParserRule getQualifiedNameInStaticImportRule() {
		return getQualifiedNameInStaticImportAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '$' | '_') ('a'..'z' | 'A'..'Z' | '$' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaXtype.getIDRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"'? |
	//	"'" ('\\' . | !('\\' | "'"))* "'"?;
	public TerminalRule getSTRINGRule() {
		return gaXtype.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaXtype.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXtype.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaXtype.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXtype.getANY_OTHERRule();
	}
}