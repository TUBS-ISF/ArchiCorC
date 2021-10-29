/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FConstant Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FConstantDef#getComment <em>Comment</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FConstantDef#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFConstantDef()
 * @model
 * @generated
 */
public interface FConstantDef extends FTypedElement
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference.
   * @see #setComment(AnnotationBlock)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFConstantDef_Comment()
   * @model containment="true"
   * @generated
   */
  AnnotationBlock getComment();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FConstantDef#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(AnnotationBlock value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(FInitializerExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFConstantDef_Rhs()
   * @model containment="true"
   * @generated
   */
  FInitializerExpression getRhs();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FConstantDef#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(FInitializerExpression value);

} // FConstantDef
