/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getComment <em>Comment</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getBroadcastEntry <em>Broadcast Entry</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getBroadcastExit <em>Broadcast Exit</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getBoradcastDo <em>Boradcast Do</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FState#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState()
 * @model
 * @generated
 */
public interface FState extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference.
   * @see #setComment(AnnotationBlock)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_Comment()
   * @model containment="true"
   * @generated
   */
  AnnotationBlock getComment();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(AnnotationBlock value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entry Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Action</em>' attribute.
   * @see #setEntryAction(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_EntryAction()
   * @model
   * @generated
   */
  String getEntryAction();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getEntryAction <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Action</em>' attribute.
   * @see #getEntryAction()
   * @generated
   */
  void setEntryAction(String value);

  /**
   * Returns the value of the '<em><b>Broadcast Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broadcast Entry</em>' containment reference.
   * @see #setBroadcastEntry(Broadcast)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_BroadcastEntry()
   * @model containment="true"
   * @generated
   */
  Broadcast getBroadcastEntry();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getBroadcastEntry <em>Broadcast Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Broadcast Entry</em>' containment reference.
   * @see #getBroadcastEntry()
   * @generated
   */
  void setBroadcastEntry(Broadcast value);

  /**
   * Returns the value of the '<em><b>Exit Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Action</em>' attribute.
   * @see #setExitAction(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_ExitAction()
   * @model
   * @generated
   */
  String getExitAction();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getExitAction <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit Action</em>' attribute.
   * @see #getExitAction()
   * @generated
   */
  void setExitAction(String value);

  /**
   * Returns the value of the '<em><b>Broadcast Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broadcast Exit</em>' containment reference.
   * @see #setBroadcastExit(Broadcast)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_BroadcastExit()
   * @model containment="true"
   * @generated
   */
  Broadcast getBroadcastExit();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getBroadcastExit <em>Broadcast Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Broadcast Exit</em>' containment reference.
   * @see #getBroadcastExit()
   * @generated
   */
  void setBroadcastExit(Broadcast value);

  /**
   * Returns the value of the '<em><b>Do Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Action</em>' attribute.
   * @see #setDoAction(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_DoAction()
   * @model
   * @generated
   */
  String getDoAction();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getDoAction <em>Do Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Action</em>' attribute.
   * @see #getDoAction()
   * @generated
   */
  void setDoAction(String value);

  /**
   * Returns the value of the '<em><b>Boradcast Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boradcast Do</em>' containment reference.
   * @see #setBoradcastDo(Broadcast)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_BoradcastDo()
   * @model containment="true"
   * @generated
   */
  Broadcast getBoradcastDo();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FState#getBoradcastDo <em>Boradcast Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boradcast Do</em>' containment reference.
   * @see #getBoradcastDo()
   * @generated
   */
  void setBoradcastDo(Broadcast value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.behavior.FTransition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<FTransition> getTransitions();

} // FState
