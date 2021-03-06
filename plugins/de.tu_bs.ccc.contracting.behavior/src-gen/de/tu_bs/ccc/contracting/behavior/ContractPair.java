/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.ContractPair#getReq <em>Req</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.ContractPair#getEns <em>Ens</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getContractPair()
 * @model
 * @generated
 */
public interface ContractPair extends EObject
{
  /**
   * Returns the value of the '<em><b>Req</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.behavior.Requires}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getContractPair_Req()
   * @model containment="true"
   * @generated
   */
  EList<Requires> getReq();

  /**
   * Returns the value of the '<em><b>Ens</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.behavior.Ensures}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ens</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getContractPair_Ens()
   * @model containment="true"
   * @generated
   */
  EList<Ensures> getEns();

} // ContractPair
