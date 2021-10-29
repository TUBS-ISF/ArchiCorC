/**
 * generated by Xtext 2.15.0
 */
package tu_bs.cs.isf.mapping.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tu_bs.cs.isf.mapping.mapping.Annotation#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tu_bs.cs.isf.mapping.mapping.Annotation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tu_bs.cs.isf.mapping.mapping.MappingPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Version)
   * @see tu_bs.cs.isf.mapping.mapping.MappingPackage#getAnnotation_Annotation()
   * @model containment="true"
   * @generated
   */
  Version getAnnotation();

  /**
   * Sets the value of the '{@link tu_bs.cs.isf.mapping.mapping.Annotation#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Version value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see tu_bs.cs.isf.mapping.mapping.MappingPackage#getAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tu_bs.cs.isf.mapping.mapping.Annotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Annotation
