/**
 * generated by Xtext 2.17.0
 */
package de.darmstadt.tu.crossing.cryptSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Pre Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getUnaryPreExpression()
 * @model
 * @generated
 */
public interface UnaryPreExpression extends Constraint
{
  /**
   * Returns the value of the '<em><b>Enclosed Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enclosed Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enclosed Expression</em>' containment reference.
   * @see #setEnclosedExpression(Constraint)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getUnaryPreExpression_EnclosedExpression()
   * @model containment="true"
   * @generated
   */
  Constraint getEnclosedExpression();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression#getEnclosedExpression <em>Enclosed Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enclosed Expression</em>' containment reference.
   * @see #getEnclosedExpression()
   * @generated
   */
  void setEnclosedExpression(Constraint value);

} // UnaryPreExpression
