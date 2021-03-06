/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.edl.events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.Model#getEventCollection <em>Event Collection</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.edl.events.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.edl.events.Import}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Event Collection</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.ccc.contracting.edl.events.EventType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Collection</em>' containment reference list.
   * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getModel_EventCollection()
   * @model containment="true"
   * @generated
   */
  EList<EventType> getEventCollection();

} // Model
