/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior.impl;

import de.tu_bs.ccc.contracting.behavior.BehaviorPackage;
import de.tu_bs.ccc.contracting.behavior.ContractPair;
import de.tu_bs.ccc.contracting.behavior.Ensures;
import de.tu_bs.ccc.contracting.behavior.Requires;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.ContractPairImpl#getReq <em>Req</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.ContractPairImpl#getEns <em>Ens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractPairImpl extends MinimalEObjectImpl.Container implements ContractPair
{
  /**
   * The cached value of the '{@link #getReq() <em>Req</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq()
   * @generated
   * @ordered
   */
  protected EList<Requires> req;

  /**
   * The cached value of the '{@link #getEns() <em>Ens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEns()
   * @generated
   * @ordered
   */
  protected EList<Ensures> ens;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractPairImpl()
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
    return BehaviorPackage.Literals.CONTRACT_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Requires> getReq()
  {
    if (req == null)
    {
      req = new EObjectContainmentEList<Requires>(Requires.class, this, BehaviorPackage.CONTRACT_PAIR__REQ);
    }
    return req;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Ensures> getEns()
  {
    if (ens == null)
    {
      ens = new EObjectContainmentEList<Ensures>(Ensures.class, this, BehaviorPackage.CONTRACT_PAIR__ENS);
    }
    return ens;
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
      case BehaviorPackage.CONTRACT_PAIR__REQ:
        return ((InternalEList<?>)getReq()).basicRemove(otherEnd, msgs);
      case BehaviorPackage.CONTRACT_PAIR__ENS:
        return ((InternalEList<?>)getEns()).basicRemove(otherEnd, msgs);
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
      case BehaviorPackage.CONTRACT_PAIR__REQ:
        return getReq();
      case BehaviorPackage.CONTRACT_PAIR__ENS:
        return getEns();
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
      case BehaviorPackage.CONTRACT_PAIR__REQ:
        getReq().clear();
        getReq().addAll((Collection<? extends Requires>)newValue);
        return;
      case BehaviorPackage.CONTRACT_PAIR__ENS:
        getEns().clear();
        getEns().addAll((Collection<? extends Ensures>)newValue);
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
      case BehaviorPackage.CONTRACT_PAIR__REQ:
        getReq().clear();
        return;
      case BehaviorPackage.CONTRACT_PAIR__ENS:
        getEns().clear();
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
      case BehaviorPackage.CONTRACT_PAIR__REQ:
        return req != null && !req.isEmpty();
      case BehaviorPackage.CONTRACT_PAIR__ENS:
        return ens != null && !ens.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContractPairImpl
