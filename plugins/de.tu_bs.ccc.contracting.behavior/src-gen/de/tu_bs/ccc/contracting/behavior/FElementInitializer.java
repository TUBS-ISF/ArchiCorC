/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FElement Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FElementInitializer#getFirst <em>First</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FElementInitializer#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFElementInitializer()
 * @model
 * @generated
 */
public interface FElementInitializer extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(FInitializerExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFElementInitializer_First()
   * @model containment="true"
   * @generated
   */
  FInitializerExpression getFirst();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FElementInitializer#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(FInitializerExpression value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' containment reference.
   * @see #setSecond(FInitializerExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFElementInitializer_Second()
   * @model containment="true"
   * @generated
   */
  FInitializerExpression getSecond();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FElementInitializer#getSecond <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' containment reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(FInitializerExpression value);

} // FElementInitializer
