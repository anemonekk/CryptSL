/**
 * generated by Xtext 2.17.0
 */
package de.darmstadt.tu.crossing.cryptSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Pred#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Pred#getParList <em>Par List</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Pred#getLabelCond <em>Label Cond</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPred()
 * @model
 * @generated
 */
public interface Pred extends Constraint
{
  /**
   * Returns the value of the '<em><b>Pred Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Name</em>' attribute.
   * @see #setPredName(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPred_PredName()
   * @model
   * @generated
   */
  String getPredName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Pred#getPredName <em>Pred Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Name</em>' attribute.
   * @see #getPredName()
   * @generated
   */
  void setPredName(String value);

  /**
   * Returns the value of the '<em><b>Par List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par List</em>' containment reference.
   * @see #setParList(SuParList)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPred_ParList()
   * @model containment="true"
   * @generated
   */
  SuParList getParList();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Pred#getParList <em>Par List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par List</em>' containment reference.
   * @see #getParList()
   * @generated
   */
  void setParList(SuParList value);

  /**
   * Returns the value of the '<em><b>Label Cond</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Cond</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Cond</em>' reference.
   * @see #setLabelCond(SuperType)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPred_LabelCond()
   * @model
   * @generated
   */
  SuperType getLabelCond();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Pred#getLabelCond <em>Label Cond</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Cond</em>' reference.
   * @see #getLabelCond()
   * @generated
   */
  void setLabelCond(SuperType value);

} // Pred
