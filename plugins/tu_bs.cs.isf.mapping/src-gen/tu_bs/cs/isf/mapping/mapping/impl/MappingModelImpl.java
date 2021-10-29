/**
 * generated by Xtext 2.15.0
 */
package tu_bs.cs.isf.mapping.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tu_bs.cs.isf.mapping.mapping.Annotation;
import tu_bs.cs.isf.mapping.mapping.Import;
import tu_bs.cs.isf.mapping.mapping.Mapping;
import tu_bs.cs.isf.mapping.mapping.MappingModel;
import tu_bs.cs.isf.mapping.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tu_bs.cs.isf.mapping.mapping.impl.MappingModelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tu_bs.cs.isf.mapping.mapping.impl.MappingModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link tu_bs.cs.isf.mapping.mapping.impl.MappingModelImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingModelImpl extends MinimalEObjectImpl.Container implements MappingModel
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<Mapping> mappings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingPackage.Literals.MAPPING_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, MappingPackage.MAPPING_MODEL__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MappingPackage.MAPPING_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Mapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, MappingPackage.MAPPING_MODEL__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingPackage.MAPPING_MODEL__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case MappingPackage.MAPPING_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MappingPackage.MAPPING_MODEL__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingPackage.MAPPING_MODEL__ANNOTATIONS:
        return getAnnotations();
      case MappingPackage.MAPPING_MODEL__IMPORTS:
        return getImports();
      case MappingPackage.MAPPING_MODEL__MAPPINGS:
        return getMappings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingPackage.MAPPING_MODEL__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case MappingPackage.MAPPING_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MappingPackage.MAPPING_MODEL__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends Mapping>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.MAPPING_MODEL__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case MappingPackage.MAPPING_MODEL__IMPORTS:
        getImports().clear();
        return;
      case MappingPackage.MAPPING_MODEL__MAPPINGS:
        getMappings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.MAPPING_MODEL__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case MappingPackage.MAPPING_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MappingPackage.MAPPING_MODEL__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappingModelImpl
