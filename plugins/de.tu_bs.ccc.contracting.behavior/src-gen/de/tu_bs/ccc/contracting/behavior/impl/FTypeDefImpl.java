/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior.impl;

import de.tu_bs.ccc.contracting.behavior.BehaviorPackage;
import de.tu_bs.ccc.contracting.behavior.FTypeDef;
import de.tu_bs.ccc.contracting.behavior.FTypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FType Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTypeDefImpl#getActualType <em>Actual Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTypeDefImpl extends FTypeImpl implements FTypeDef
{
  /**
   * The cached value of the '{@link #getActualType() <em>Actual Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualType()
   * @generated
   * @ordered
   */
  protected FTypeRef actualType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FTypeDefImpl()
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
    return BehaviorPackage.Literals.FTYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FTypeRef getActualType()
  {
    return actualType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualType(FTypeRef newActualType, NotificationChain msgs)
  {
    FTypeRef oldActualType = actualType;
    actualType = newActualType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE, oldActualType, newActualType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActualType(FTypeRef newActualType)
  {
    if (newActualType != actualType)
    {
      NotificationChain msgs = null;
      if (actualType != null)
        msgs = ((InternalEObject)actualType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE, null, msgs);
      if (newActualType != null)
        msgs = ((InternalEObject)newActualType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE, null, msgs);
      msgs = basicSetActualType(newActualType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE, newActualType, newActualType));
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
      case BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE:
        return basicSetActualType(null, msgs);
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
      case BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE:
        return getActualType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE:
        setActualType((FTypeRef)newValue);
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
      case BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE:
        setActualType((FTypeRef)null);
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
      case BehaviorPackage.FTYPE_DEF__ACTUAL_TYPE:
        return actualType != null;
    }
    return super.eIsSet(featureID);
  }

} //FTypeDefImpl
