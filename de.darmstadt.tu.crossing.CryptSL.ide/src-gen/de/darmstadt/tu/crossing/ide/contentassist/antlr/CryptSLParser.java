/*
 * generated by Xtext 2.17.0
 */
package de.darmstadt.tu.crossing.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.darmstadt.tu.crossing.ide.contentassist.antlr.internal.InternalCryptSLParser;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CryptSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CryptSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CryptSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDomainmodelAccess().getAlternatives_2(), "rule__Domainmodel__Alternatives_2");
			builder.put(grammarAccess.getObjectDeclAccess().getAlternatives_1(), "rule__ObjectDecl__Alternatives_1");
			builder.put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
			builder.put(grammarAccess.getParAccess().getAlternatives_1(), "rule__Par__Alternatives_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getElementopAlternatives_0_1_0(), "rule__Primary__ElementopAlternatives_0_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getElementopAlternatives_1_3_0(), "rule__Primary__ElementopAlternatives_1_3_0");
			builder.put(grammarAccess.getComparingRelOperatorAccess().getAlternatives(), "rule__ComparingRelOperator__Alternatives");
			builder.put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getAlternatives(), "rule__MultiplicationExpression__Alternatives");
			builder.put(grammarAccess.getMultiplicationOperatorAccess().getAlternatives(), "rule__MultiplicationOperator__Alternatives");
			builder.put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getAlternatives(), "rule__PreDefinedPredicates__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getValAlternatives_1_0(), "rule__Literal__ValAlternatives_1_0");
			builder.put(grammarAccess.getIntegerLiteralAccess().getAlternatives(), "rule__IntegerLiteral__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives(), "rule__BooleanLiteral__Alternatives");
			builder.put(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives(), "rule__ComparingEQNEQOperator__Alternatives");
			builder.put(grammarAccess.getConsAccess().getAlternatives(), "rule__Cons__Alternatives");
			builder.put(grammarAccess.getArrayElementsAccess().getAlternatives(), "rule__ArrayElements__Alternatives");
			builder.put(grammarAccess.getConsPredAccess().getAlternatives(), "rule__ConsPred__Alternatives");
			builder.put(grammarAccess.getLitListAccess().getAlternatives_1_1(), "rule__LitList__Alternatives_1_1");
			builder.put(grammarAccess.getPredAccess().getAlternatives_1(), "rule__Pred__Alternatives_1");
			builder.put(grammarAccess.getSuParAccess().getAlternatives_1(), "rule__SuPar__Alternatives_1");
			builder.put(grammarAccess.getJvmTypeReferenceAccess().getAlternatives(), "rule__JvmTypeReference__Alternatives");
			builder.put(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives(), "rule__JvmArgumentTypeReference__Alternatives");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2(), "rule__JvmWildcardTypeReference__Alternatives_2");
			builder.put(grammarAccess.getXImportDeclarationAccess().getAlternatives_1(), "rule__XImportDeclaration__Alternatives_1");
			builder.put(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3(), "rule__XImportDeclaration__Alternatives_1_0_3");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup(), "rule__Domainmodel__Group__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_2_1(), "rule__Domainmodel__Group_2_1__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_5(), "rule__Domainmodel__Group_5__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_10(), "rule__Domainmodel__Group_10__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_11(), "rule__Domainmodel__Group_11__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_12(), "rule__Domainmodel__Group_12__0");
			builder.put(grammarAccess.getDomainmodelAccess().getGroup_13(), "rule__Domainmodel__Group_13__0");
			builder.put(grammarAccess.getEnforceConsBlockAccess().getGroup(), "rule__EnforceConsBlock__Group__0");
			builder.put(grammarAccess.getRequiresBlockAccess().getGroup(), "rule__RequiresBlock__Group__0");
			builder.put(grammarAccess.getEnsuresBlockAccess().getGroup(), "rule__EnsuresBlock__Group__0");
			builder.put(grammarAccess.getDestroysBlockAccess().getGroup(), "rule__DestroysBlock__Group__0");
			builder.put(grammarAccess.getObjectDeclAccess().getGroup(), "rule__ObjectDecl__Group__0");
			builder.put(grammarAccess.getObjectDeclAccess().getGroup_1_1(), "rule__ObjectDecl__Group_1_1__0");
			builder.put(grammarAccess.getForbMethodAccess().getGroup(), "rule__ForbMethod__Group__0");
			builder.put(grammarAccess.getForbMethodAccess().getGroup_0(), "rule__ForbMethod__Group_0__0");
			builder.put(grammarAccess.getForbMethodAccess().getGroup_0_1(), "rule__ForbMethod__Group_0_1__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_2(), "rule__FQN__Group_2__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_2_1(), "rule__FQN__Group_2_1__0");
			builder.put(grammarAccess.getQNAccess().getGroup(), "rule__QN__Group__0");
			builder.put(grammarAccess.getQNAccess().getGroup_1(), "rule__QN__Group_1__0");
			builder.put(grammarAccess.getLabelMethodCallAccess().getGroup(), "rule__LabelMethodCall__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_0(), "rule__Method__Group_0__0");
			builder.put(grammarAccess.getParListAccess().getGroup(), "rule__ParList__Group__0");
			builder.put(grammarAccess.getParListAccess().getGroup_1(), "rule__ParList__Group_1__0");
			builder.put(grammarAccess.getParAccess().getGroup(), "rule__Par__Group__0");
			builder.put(grammarAccess.getAggregateAccess().getGroup(), "rule__Aggregate__Group__0");
			builder.put(grammarAccess.getAggregateAccess().getGroup_1(), "rule__Aggregate__Group_1__0");
			builder.put(grammarAccess.getAggregateAccess().getGroup_1_2(), "rule__Aggregate__Group_1_2__0");
			builder.put(grammarAccess.getAggregateAccess().getGroup_1_2_1(), "rule__Aggregate__Group_1_2_1__0");
			builder.put(grammarAccess.getOrderAccess().getGroup(), "rule__Order__Group__0");
			builder.put(grammarAccess.getOrderAccess().getGroup_1(), "rule__Order__Group_1__0");
			builder.put(grammarAccess.getSimpleOrderAccess().getGroup(), "rule__SimpleOrder__Group__0");
			builder.put(grammarAccess.getSimpleOrderAccess().getGroup_1(), "rule__SimpleOrder__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getLogicalImplyExpressionAccess().getGroup(), "rule__LogicalImplyExpression__Group__0");
			builder.put(grammarAccess.getLogicalImplyExpressionAccess().getGroup_1(), "rule__LogicalImplyExpression__Group_1__0");
			builder.put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
			builder.put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
			builder.put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
			builder.put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
			builder.put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup(), "rule__ComparisonHigherOpExpression__Group__0");
			builder.put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1(), "rule__ComparisonHigherOpExpression__Group_1__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup(), "rule__AdditionExpression__Group__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup_1(), "rule__AdditionExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1(), "rule__MultiplicationExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1(), "rule__MultiplicationExpression__Group_1_1__0");
			builder.put(grammarAccess.getUnaryPreExpressionAccess().getGroup(), "rule__UnaryPreExpression__Group__0");
			builder.put(grammarAccess.getUnaryPreExpressionAccess().getGroup_1(), "rule__UnaryPreExpression__Group_1__0");
			builder.put(grammarAccess.getOperandAccess().getGroup_0(), "rule__Operand__Group_0__0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getGroup_0(), "rule__PreDefinedPredicates__Group_0__0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getGroup_1(), "rule__PreDefinedPredicates__Group_1__0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getGroup_2(), "rule__PreDefinedPredicates__Group_2__0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getGroup_3(), "rule__PreDefinedPredicates__Group_3__0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getGroup_4(), "rule__PreDefinedPredicates__Group_4__0");
			builder.put(grammarAccess.getAggregateExpressionAccess().getGroup(), "rule__AggregateExpression__Group__0");
			builder.put(grammarAccess.getAggregateExpressionAccess().getGroup_1(), "rule__AggregateExpression__Group_1__0");
			builder.put(grammarAccess.getLiteralAccess().getGroup(), "rule__Literal__Group__0");
			builder.put(grammarAccess.getIntegerLiteralAccess().getGroup_1(), "rule__IntegerLiteral__Group_1__0");
			builder.put(grammarAccess.getConsAccess().getGroup_0(), "rule__Cons__Group_0__0");
			builder.put(grammarAccess.getArrayElementsAccess().getGroup_0(), "rule__ArrayElements__Group_0__0");
			builder.put(grammarAccess.getConsPredAccess().getGroup_0(), "rule__ConsPred__Group_0__0");
			builder.put(grammarAccess.getLitListAccess().getGroup(), "rule__LitList__Group__0");
			builder.put(grammarAccess.getLitListAccess().getGroup_1(), "rule__LitList__Group_1__0");
			builder.put(grammarAccess.getPredAccess().getGroup(), "rule__Pred__Group__0");
			builder.put(grammarAccess.getPredAccess().getGroup_1_0(), "rule__Pred__Group_1_0__0");
			builder.put(grammarAccess.getReqPredAccess().getGroup(), "rule__ReqPred__Group__0");
			builder.put(grammarAccess.getReqPredAccess().getGroup_0(), "rule__ReqPred__Group_0__0");
			builder.put(grammarAccess.getEnsPredAccess().getGroup(), "rule__EnsPred__Group__0");
			builder.put(grammarAccess.getEnsPredAccess().getGroup_1(), "rule__EnsPred__Group_1__0");
			builder.put(grammarAccess.getSuParListAccess().getGroup(), "rule__SuParList__Group__0");
			builder.put(grammarAccess.getSuParListAccess().getGroup_1(), "rule__SuParList__Group_1__0");
			builder.put(grammarAccess.getSuParAccess().getGroup(), "rule__SuPar__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0(), "rule__JvmTypeReference__Group_0__0");
			builder.put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1(), "rule__JvmTypeReference__Group_0_1__0");
			builder.put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0(), "rule__JvmTypeReference__Group_0_1_0__0");
			builder.put(grammarAccess.getArrayBracketsAccess().getGroup(), "rule__ArrayBrackets__Group__0");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getGroup(), "rule__XFunctionTypeRef__Group__0");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0(), "rule__XFunctionTypeRef__Group_0__0");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1(), "rule__XFunctionTypeRef__Group_0_1__0");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1(), "rule__XFunctionTypeRef__Group_0_1_1__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup(), "rule__JvmParameterizedTypeReference__Group__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1(), "rule__JvmParameterizedTypeReference__Group_1__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2(), "rule__JvmParameterizedTypeReference__Group_1_2__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4(), "rule__JvmParameterizedTypeReference__Group_1_4__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0(), "rule__JvmParameterizedTypeReference__Group_1_4_0__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0(), "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2(), "rule__JvmParameterizedTypeReference__Group_1_4_2__0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2(), "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup(), "rule__JvmWildcardTypeReference__Group__0");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0(), "rule__JvmWildcardTypeReference__Group_2_0__0");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1(), "rule__JvmWildcardTypeReference__Group_2_1__0");
			builder.put(grammarAccess.getJvmUpperBoundAccess().getGroup(), "rule__JvmUpperBound__Group__0");
			builder.put(grammarAccess.getJvmUpperBoundAndedAccess().getGroup(), "rule__JvmUpperBoundAnded__Group__0");
			builder.put(grammarAccess.getJvmLowerBoundAccess().getGroup(), "rule__JvmLowerBound__Group__0");
			builder.put(grammarAccess.getJvmLowerBoundAndedAccess().getGroup(), "rule__JvmLowerBoundAnded__Group__0");
			builder.put(grammarAccess.getJvmTypeParameterAccess().getGroup(), "rule__JvmTypeParameter__Group__0");
			builder.put(grammarAccess.getJvmTypeParameterAccess().getGroup_1(), "rule__JvmTypeParameter__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getXImportDeclarationAccess().getGroup(), "rule__XImportDeclaration__Group__0");
			builder.put(grammarAccess.getXImportDeclarationAccess().getGroup_1_0(), "rule__XImportDeclaration__Group_1_0__0");
			builder.put(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup(), "rule__QualifiedNameInStaticImport__Group__0");
			builder.put(grammarAccess.getDomainmodelAccess().getJavaTypeAssignment_1(), "rule__Domainmodel__JavaTypeAssignment_1");
			builder.put(grammarAccess.getDomainmodelAccess().getArrayAssignment_2_0(), "rule__Domainmodel__ArrayAssignment_2_0");
			builder.put(grammarAccess.getDomainmodelAccess().getCollectionAssignment_2_1_1(), "rule__Domainmodel__CollectionAssignment_2_1_1");
			builder.put(grammarAccess.getDomainmodelAccess().getUsageAssignment_4(), "rule__Domainmodel__UsageAssignment_4");
			builder.put(grammarAccess.getDomainmodelAccess().getForbEventAssignment_5_1(), "rule__Domainmodel__ForbEventAssignment_5_1");
			builder.put(grammarAccess.getDomainmodelAccess().getReq_eventsAssignment_7(), "rule__Domainmodel__Req_eventsAssignment_7");
			builder.put(grammarAccess.getDomainmodelAccess().getOrderAssignment_9(), "rule__Domainmodel__OrderAssignment_9");
			builder.put(grammarAccess.getDomainmodelAccess().getReqConstraintsAssignment_10_1(), "rule__Domainmodel__ReqConstraintsAssignment_10_1");
			builder.put(grammarAccess.getDomainmodelAccess().getRequireAssignment_11_1(), "rule__Domainmodel__RequireAssignment_11_1");
			builder.put(grammarAccess.getDomainmodelAccess().getEnsureAssignment_12_1(), "rule__Domainmodel__EnsureAssignment_12_1");
			builder.put(grammarAccess.getDomainmodelAccess().getDestroyAssignment_13_1(), "rule__Domainmodel__DestroyAssignment_13_1");
			builder.put(grammarAccess.getUseBlockAccess().getObjectsAssignment(), "rule__UseBlock__ObjectsAssignment");
			builder.put(grammarAccess.getForbiddenBlockAccess().getForb_methodsAssignment(), "rule__ForbiddenBlock__Forb_methodsAssignment");
			builder.put(grammarAccess.getRequiredBlockAccess().getReq_eventAssignment(), "rule__RequiredBlock__Req_eventAssignment");
			builder.put(grammarAccess.getEnforceConsBlockAccess().getReqAssignment_0(), "rule__EnforceConsBlock__ReqAssignment_0");
			builder.put(grammarAccess.getRequiresBlockAccess().getPredAssignment_0(), "rule__RequiresBlock__PredAssignment_0");
			builder.put(grammarAccess.getEnsuresBlockAccess().getPredAssignment_0(), "rule__EnsuresBlock__PredAssignment_0");
			builder.put(grammarAccess.getDestroysBlockAccess().getPredAssignment_0(), "rule__DestroysBlock__PredAssignment_0");
			builder.put(grammarAccess.getObjectDeclAccess().getObjectTypeAssignment_0(), "rule__ObjectDecl__ObjectTypeAssignment_0");
			builder.put(grammarAccess.getObjectDeclAccess().getArrayAssignment_1_0(), "rule__ObjectDecl__ArrayAssignment_1_0");
			builder.put(grammarAccess.getObjectDeclAccess().getCollectionAssignment_1_1_1(), "rule__ObjectDecl__CollectionAssignment_1_1_1");
			builder.put(grammarAccess.getObjectDeclAccess().getObjectNameAssignment_2(), "rule__ObjectDecl__ObjectNameAssignment_2");
			builder.put(grammarAccess.getForbMethodAccess().getJavaMethAssignment_0_0(), "rule__ForbMethod__JavaMethAssignment_0_0");
			builder.put(grammarAccess.getForbMethodAccess().getRepAssignment_0_1_1(), "rule__ForbMethod__RepAssignment_0_1_1");
			builder.put(grammarAccess.getLabelMethodCallAccess().getNameAssignment_0(), "rule__LabelMethodCall__NameAssignment_0");
			builder.put(grammarAccess.getLabelMethodCallAccess().getMethAssignment_2(), "rule__LabelMethodCall__MethAssignment_2");
			builder.put(grammarAccess.getMethodAccess().getLeftSideAssignment_0_0(), "rule__Method__LeftSideAssignment_0_0");
			builder.put(grammarAccess.getMethodAccess().getMethNameAssignment_1(), "rule__Method__MethNameAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getParListAssignment_3(), "rule__Method__ParListAssignment_3");
			builder.put(grammarAccess.getParListAccess().getParametersAssignment_0(), "rule__ParList__ParametersAssignment_0");
			builder.put(grammarAccess.getParListAccess().getParametersAssignment_1_1(), "rule__ParList__ParametersAssignment_1_1");
			builder.put(grammarAccess.getParAccess().getValAssignment_1_0(), "rule__Par__ValAssignment_1_0");
			builder.put(grammarAccess.getAggregateAccess().getNameAssignment_1_0(), "rule__Aggregate__NameAssignment_1_0");
			builder.put(grammarAccess.getAggregateAccess().getLabAssignment_1_2_0(), "rule__Aggregate__LabAssignment_1_2_0");
			builder.put(grammarAccess.getAggregateAccess().getLabAssignment_1_2_1_1(), "rule__Aggregate__LabAssignment_1_2_1_1");
			builder.put(grammarAccess.getOrderAccess().getOrderopAssignment_1_1(), "rule__Order__OrderopAssignment_1_1");
			builder.put(grammarAccess.getOrderAccess().getRightAssignment_1_2(), "rule__Order__RightAssignment_1_2");
			builder.put(grammarAccess.getSimpleOrderAccess().getOrderopAssignment_1_1(), "rule__SimpleOrder__OrderopAssignment_1_1");
			builder.put(grammarAccess.getSimpleOrderAccess().getRightAssignment_1_2(), "rule__SimpleOrder__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getOrderEvAssignment_0_0(), "rule__Primary__OrderEvAssignment_0_0");
			builder.put(grammarAccess.getPrimaryAccess().getElementopAssignment_0_1(), "rule__Primary__ElementopAssignment_0_1");
			builder.put(grammarAccess.getPrimaryAccess().getElementopAssignment_1_3(), "rule__Primary__ElementopAssignment_1_3");
			builder.put(grammarAccess.getLogicalImplyExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalImplyExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getLogicalImplyExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalImplyExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getLogicalImplyAccess().getIMPLIESAssignment(), "rule__LogicalImply__IMPLIESAssignment");
			builder.put(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalOrExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalOrExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getLogicalOrAccess().getORAssignment(), "rule__LogicalOr__ORAssignment");
			builder.put(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalAndExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalAndExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getLogicalAndAccess().getANDAssignment(), "rule__LogicalAnd__ANDAssignment");
			builder.put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getComparingRelOperatorAccess().getLESSAssignment_0(), "rule__ComparingRelOperator__LESSAssignment_0");
			builder.put(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALAssignment_1(), "rule__ComparingRelOperator__LESS_OR_EQUALAssignment_1");
			builder.put(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALAssignment_2(), "rule__ComparingRelOperator__GREATER_OR_EQUALAssignment_2");
			builder.put(grammarAccess.getComparingRelOperatorAccess().getGREATERAssignment_3(), "rule__ComparingRelOperator__GREATERAssignment_3");
			builder.put(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditionExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AdditionExpression__RightExpressionAssignment_1_2");
			builder.put(grammarAccess.getAdditionOperatorAccess().getPLUSAssignment_0(), "rule__AdditionOperator__PLUSAssignment_0");
			builder.put(grammarAccess.getAdditionOperatorAccess().getMINUSAssignment_1(), "rule__AdditionOperator__MINUSAssignment_1");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1(), "rule__MultiplicationExpression__OperatorAssignment_1_1_1");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2(), "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2");
			builder.put(grammarAccess.getMultiplicationOperatorAccess().getTIMESAssignment_0(), "rule__MultiplicationOperator__TIMESAssignment_0");
			builder.put(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEAssignment_1(), "rule__MultiplicationOperator__DIVIDEAssignment_1");
			builder.put(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1_0(), "rule__UnaryPreExpression__OperatorAssignment_1_0");
			builder.put(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_1_1(), "rule__UnaryPreExpression__EnclosedExpressionAssignment_1_1");
			builder.put(grammarAccess.getLiteralExpressionAccess().getNameAssignment_0(), "rule__LiteralExpression__NameAssignment_0");
			builder.put(grammarAccess.getLiteralExpressionAccess().getNameAssignment_1(), "rule__LiteralExpression__NameAssignment_1");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getPredNameAssignment_0_0(), "rule__PreDefinedPredicates__PredNameAssignment_0_0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getObjAssignment_0_2(), "rule__PreDefinedPredicates__ObjAssignment_0_2");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getTypeAssignment_0_4(), "rule__PreDefinedPredicates__TypeAssignment_0_4");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getPredNameAssignment_1_0(), "rule__PreDefinedPredicates__PredNameAssignment_1_0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getObjAssignment_1_2(), "rule__PreDefinedPredicates__ObjAssignment_1_2");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getPredNameAssignment_2_0(), "rule__PreDefinedPredicates__PredNameAssignment_2_0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getObjAssignment_2_2(), "rule__PreDefinedPredicates__ObjAssignment_2_2");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getPredNameAssignment_3_0(), "rule__PreDefinedPredicates__PredNameAssignment_3_0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getObjAssignment_3_2(), "rule__PreDefinedPredicates__ObjAssignment_3_2");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getPredNameAssignment_4_0(), "rule__PreDefinedPredicates__PredNameAssignment_4_0");
			builder.put(grammarAccess.getPreDefinedPredicatesAccess().getObjAssignment_4_2(), "rule__PreDefinedPredicates__ObjAssignment_4_2");
			builder.put(grammarAccess.getAggregateExpressionAccess().getValueAssignment_0(), "rule__AggregateExpression__ValueAssignment_0");
			builder.put(grammarAccess.getLiteralAccess().getValAssignment_1(), "rule__Literal__ValAssignment_1");
			builder.put(grammarAccess.getUnaryPreOperatorAccess().getNOTAssignment(), "rule__UnaryPreOperator__NOTAssignment");
			builder.put(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALAssignment_0(), "rule__ComparingEQNEQOperator__EQUALAssignment_0");
			builder.put(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALAssignment_1(), "rule__ComparingEQNEQOperator__UNEQUALAssignment_1");
			builder.put(grammarAccess.getConsAccess().getConsAssignment_0_0(), "rule__Cons__ConsAssignment_0_0");
			builder.put(grammarAccess.getConsAccess().getLitsleftAssignment_0_3(), "rule__Cons__LitsleftAssignment_0_3");
			builder.put(grammarAccess.getConsAccess().getConsAssignment_1(), "rule__Cons__ConsAssignment_1");
			builder.put(grammarAccess.getArrayElementsAccess().getElAssignment_0_0(), "rule__ArrayElements__ElAssignment_0_0");
			builder.put(grammarAccess.getArrayElementsAccess().getConsAssignment_0_1(), "rule__ArrayElements__ConsAssignment_0_1");
			builder.put(grammarAccess.getArrayElementsAccess().getConsAssignment_1(), "rule__ArrayElements__ConsAssignment_1");
			builder.put(grammarAccess.getConsPredAccess().getPartAssignment_0_0(), "rule__ConsPred__PartAssignment_0_0");
			builder.put(grammarAccess.getConsPredAccess().getIndAssignment_0_1(), "rule__ConsPred__IndAssignment_0_1");
			builder.put(grammarAccess.getConsPredAccess().getSplitAssignment_0_3(), "rule__ConsPred__SplitAssignment_0_3");
			builder.put(grammarAccess.getConsPredAccess().getLitAssignment_0_5(), "rule__ConsPred__LitAssignment_0_5");
			builder.put(grammarAccess.getConsPredAccess().getLitAssignment_1(), "rule__ConsPred__LitAssignment_1");
			builder.put(grammarAccess.getLitListAccess().getParametersAssignment_0(), "rule__LitList__ParametersAssignment_0");
			builder.put(grammarAccess.getLitListAccess().getParametersAssignment_1_1_0(), "rule__LitList__ParametersAssignment_1_1_0");
			builder.put(grammarAccess.getPredAccess().getPredNameAssignment_0(), "rule__Pred__PredNameAssignment_0");
			builder.put(grammarAccess.getPredAccess().getParListAssignment_1_0_1(), "rule__Pred__ParListAssignment_1_0_1");
			builder.put(grammarAccess.getReqPredAccess().getConsAssignment_0_0(), "rule__ReqPred__ConsAssignment_0_0");
			builder.put(grammarAccess.getReqPredAccess().getNotAssignment_1(), "rule__ReqPred__NotAssignment_1");
			builder.put(grammarAccess.getReqPredAccess().getPredAssignment_2(), "rule__ReqPred__PredAssignment_2");
			builder.put(grammarAccess.getEnsPredAccess().getLabelCondAssignment_1_1(), "rule__EnsPred__LabelCondAssignment_1_1");
			builder.put(grammarAccess.getSuParListAccess().getParametersAssignment_0(), "rule__SuParList__ParametersAssignment_0");
			builder.put(grammarAccess.getSuParListAccess().getParametersAssignment_1_1(), "rule__SuParList__ParametersAssignment_1_1");
			builder.put(grammarAccess.getSuParAccess().getValAssignment_1_0(), "rule__SuPar__ValAssignment_1_0");
			builder.put(grammarAccess.getObjectAccess().getNameAssignment_1(), "rule__Object__NameAssignment_1");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1");
			builder.put(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2(), "rule__XFunctionTypeRef__ReturnTypeAssignment_2");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0(), "rule__JvmParameterizedTypeReference__TypeAssignment_0");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1(), "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1");
			builder.put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0");
			builder.put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1");
			builder.put(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBound__TypeReferenceAssignment_1");
			builder.put(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1");
			builder.put(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmLowerBound__TypeReferenceAssignment_1");
			builder.put(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1(), "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1");
			builder.put(grammarAccess.getJvmTypeParameterAccess().getNameAssignment_0(), "rule__JvmTypeParameter__NameAssignment_0");
			builder.put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_0(), "rule__JvmTypeParameter__ConstraintsAssignment_1_0");
			builder.put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_1(), "rule__JvmTypeParameter__ConstraintsAssignment_1_1");
			builder.put(grammarAccess.getXImportSectionAccess().getImportDeclarationsAssignment(), "rule__XImportSection__ImportDeclarationsAssignment");
			builder.put(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0(), "rule__XImportDeclaration__StaticAssignment_1_0_0");
			builder.put(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1(), "rule__XImportDeclaration__ExtensionAssignment_1_0_1");
			builder.put(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2(), "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2");
			builder.put(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0(), "rule__XImportDeclaration__WildcardAssignment_1_0_3_0");
			builder.put(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1(), "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1");
			builder.put(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1(), "rule__XImportDeclaration__ImportedTypeAssignment_1_1");
			builder.put(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2(), "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CryptSLGrammarAccess grammarAccess;

	@Override
	protected InternalCryptSLParser createParser() {
		InternalCryptSLParser result = new InternalCryptSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CryptSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CryptSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
