/**
 * generated by Xtext 2.12.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getName <em>Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getPred <em>Pred</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getObj <em>Obj</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getType <em>Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getValue <em>Value</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getCons <em>Cons</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getLitsleft <em>Litsleft</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getPart <em>Part</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getInd <em>Ind</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getSplit <em>Split</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getLit <em>Lit</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression()
 * @model
 * @generated
 */
public interface LiteralExpression extends Constraint
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EObject)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Name()
   * @model containment="true"
   * @generated
   */
  EObject getName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EObject value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute.
   * @see #setPred(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Pred()
   * @model
   * @generated
   */
  String getPred();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getPred <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' attribute.
   * @see #getPred()
   * @generated
   */
  void setPred(String value);

  /**
   * Returns the value of the '<em><b>Obj</b></em>' reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Obj()
   * @model
   * @generated
   */
  EList<Event> getObj();

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(JvmType)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Type()
   * @model
   * @generated
   */
  JvmType getType();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(SuperType)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Value()
   * @model
   * @generated
   */
  SuperType getValue();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SuperType value);

  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(LiteralExpression)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Cons()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getCons();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>Litsleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Litsleft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Litsleft</em>' containment reference.
   * @see #setLitsleft(LitList)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Litsleft()
   * @model containment="true"
   * @generated
   */
  LitList getLitsleft();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getLitsleft <em>Litsleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Litsleft</em>' containment reference.
   * @see #getLitsleft()
   * @generated
   */
  void setLitsleft(LitList value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' attribute.
   * @see #setPart(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Part()
   * @model
   * @generated
   */
  String getPart();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getPart <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' attribute.
   * @see #getPart()
   * @generated
   */
  void setPart(String value);

  /**
   * Returns the value of the '<em><b>Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ind</em>' attribute.
   * @see #setInd(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Ind()
   * @model
   * @generated
   */
  String getInd();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getInd <em>Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ind</em>' attribute.
   * @see #getInd()
   * @generated
   */
  void setInd(String value);

  /**
   * Returns the value of the '<em><b>Split</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Split</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Split</em>' attribute.
   * @see #setSplit(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Split()
   * @model
   * @generated
   */
  String getSplit();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getSplit <em>Split</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Split</em>' attribute.
   * @see #getSplit()
   * @generated
   */
  void setSplit(String value);

  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference.
   * @see #setLit(LiteralExpression)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLiteralExpression_Lit()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getLit();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LiteralExpression#getLit <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' containment reference.
   * @see #getLit()
   * @generated
   */
  void setLit(LiteralExpression value);

} // LiteralExpression