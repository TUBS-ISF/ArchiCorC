/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FField Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FFieldInitializer#getElement <em>Element</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FFieldInitializer#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFFieldInitializer()
 * @model
 * @generated
 */
public interface FFieldInitializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(FField)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFFieldInitializer_Element()
   * @model
   * @generated
   */
  FField getElement();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FFieldInitializer#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(FField value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(FInitializerExpression)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFFieldInitializer_Value()
   * @model containment="true"
   * @generated
   */
  FInitializerExpression getValue();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FFieldInitializer#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(FInitializerExpression value);

} // FFieldInitializer