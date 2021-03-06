/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FBinary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getOp <em>Op</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFBinaryOperation()
 * @model
 * @generated
 */
public interface FBinaryOperation extends FExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(FExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFBinaryOperation_Left()
   * @model containment="true"
   * @generated
   */
  FExpression getLeft();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(FExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link de.tu_bs.ccc.contracting.behavior.FOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see de.tu_bs.ccc.contracting.behavior.FOperator
   * @see #setOp(FOperator)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFBinaryOperation_Op()
   * @model
   * @generated
   */
  FOperator getOp();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see de.tu_bs.ccc.contracting.behavior.FOperator
   * @see #getOp()
   * @generated
   */
  void setOp(FOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(FExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFBinaryOperation_Right()
   * @model containment="true"
   * @generated
   */
  FExpression getRight();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FBinaryOperation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(FExpression value);

} // FBinaryOperation
