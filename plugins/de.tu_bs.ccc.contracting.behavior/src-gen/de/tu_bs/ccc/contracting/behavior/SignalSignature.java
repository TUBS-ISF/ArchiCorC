/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.SignalSignature#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.SignalSignature#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getSignalSignature()
 * @model
 * @generated
 */
public interface SignalSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getSignalSignature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.SignalSignature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.behavior.VarDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getSignalSignature_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getArguments();

} // SignalSignature
