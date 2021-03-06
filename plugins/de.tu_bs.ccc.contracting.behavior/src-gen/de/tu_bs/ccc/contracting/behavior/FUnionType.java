/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FUnion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FUnionType#getBase <em>Base</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FUnionType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFUnionType()
 * @model
 * @generated
 */
public interface FUnionType extends FType
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(FUnionType)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFUnionType_Base()
   * @model
   * @generated
   */
  FUnionType getBase();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FUnionType#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(FUnionType value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.behavior.FField}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFUnionType_Elements()
   * @model containment="true"
   * @generated
   */
  EList<FField> getElements();

} // FUnionType
