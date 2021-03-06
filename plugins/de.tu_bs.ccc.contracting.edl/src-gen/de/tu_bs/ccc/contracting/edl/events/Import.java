/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.edl.events;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.Import#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getImport_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.edl.events.Import#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see de.tu_bs.ccc.contracting.edl.events.EventsPackage#getImport_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.edl.events.Import#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

} // Import
