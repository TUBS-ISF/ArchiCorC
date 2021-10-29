/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FQualified Element Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getElement <em>Element</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFQualifiedElementRef()
 * @model
 * @generated
 */
public interface FQualifiedElementRef extends FExpression
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFQualifiedElementRef_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' containment reference.
   * @see #setQualifier(FQualifiedElementRef)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFQualifiedElementRef_Qualifier()
   * @model containment="true"
   * @generated
   */
  FQualifiedElementRef getQualifier();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getQualifier <em>Qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' containment reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(FQualifiedElementRef value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(FField)
   * @see de.tu_bs.ccc.contracting.behavior.BehaviorPackage#getFQualifiedElementRef_Field()
   * @model
   * @generated
   */
  FField getField();

  /**
   * Sets the value of the '{@link de.tu_bs.ccc.contracting.behavior.FQualifiedElementRef#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(FField value);

} // FQualifiedElementRef
