/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.behavior.impl;

import de.tu_bs.ccc.contracting.behavior.BehaviorPackage;
import de.tu_bs.ccc.contracting.behavior.Broadcast;
import de.tu_bs.ccc.contracting.behavior.FGuard;
import de.tu_bs.ccc.contracting.behavior.FState;
import de.tu_bs.ccc.contracting.behavior.FTransition;
import de.tu_bs.ccc.contracting.behavior.FTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.behavior.impl.FTransitionImpl#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTransitionImpl extends MinimalEObjectImpl.Container implements FTransition
{
  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected FTrigger trigger;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected FGuard guard;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected FState to;

  /**
   * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected static final String ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected String action = ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBroadcast() <em>Broadcast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBroadcast()
   * @generated
   * @ordered
   */
  protected Broadcast broadcast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FTransitionImpl()
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
    return BehaviorPackage.Literals.FTRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FTrigger getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(FTrigger newTrigger, NotificationChain msgs)
  {
    FTrigger oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__TRIGGER, oldTrigger, newTrigger);
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
  public void setTrigger(FTrigger newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FGuard getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(FGuard newGuard, NotificationChain msgs)
  {
    FGuard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__GUARD, oldGuard, newGuard);
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
  public void setGuard(FGuard newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FState getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (FState)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FTRANSITION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FState basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTo(FState newTo)
  {
    FState oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(String newAction)
  {
    String oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Broadcast getBroadcast()
  {
    return broadcast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBroadcast(Broadcast newBroadcast, NotificationChain msgs)
  {
    Broadcast oldBroadcast = broadcast;
    broadcast = newBroadcast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__BROADCAST, oldBroadcast, newBroadcast);
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
  public void setBroadcast(Broadcast newBroadcast)
  {
    if (newBroadcast != broadcast)
    {
      NotificationChain msgs = null;
      if (broadcast != null)
        msgs = ((InternalEObject)broadcast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__BROADCAST, null, msgs);
      if (newBroadcast != null)
        msgs = ((InternalEObject)newBroadcast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.FTRANSITION__BROADCAST, null, msgs);
      msgs = basicSetBroadcast(newBroadcast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FTRANSITION__BROADCAST, newBroadcast, newBroadcast));
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
      case BehaviorPackage.FTRANSITION__TRIGGER:
        return basicSetTrigger(null, msgs);
      case BehaviorPackage.FTRANSITION__GUARD:
        return basicSetGuard(null, msgs);
      case BehaviorPackage.FTRANSITION__BROADCAST:
        return basicSetBroadcast(null, msgs);
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
      case BehaviorPackage.FTRANSITION__TRIGGER:
        return getTrigger();
      case BehaviorPackage.FTRANSITION__GUARD:
        return getGuard();
      case BehaviorPackage.FTRANSITION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case BehaviorPackage.FTRANSITION__ACTION:
        return getAction();
      case BehaviorPackage.FTRANSITION__BROADCAST:
        return getBroadcast();
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
      case BehaviorPackage.FTRANSITION__TRIGGER:
        setTrigger((FTrigger)newValue);
        return;
      case BehaviorPackage.FTRANSITION__GUARD:
        setGuard((FGuard)newValue);
        return;
      case BehaviorPackage.FTRANSITION__TO:
        setTo((FState)newValue);
        return;
      case BehaviorPackage.FTRANSITION__ACTION:
        setAction((String)newValue);
        return;
      case BehaviorPackage.FTRANSITION__BROADCAST:
        setBroadcast((Broadcast)newValue);
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
      case BehaviorPackage.FTRANSITION__TRIGGER:
        setTrigger((FTrigger)null);
        return;
      case BehaviorPackage.FTRANSITION__GUARD:
        setGuard((FGuard)null);
        return;
      case BehaviorPackage.FTRANSITION__TO:
        setTo((FState)null);
        return;
      case BehaviorPackage.FTRANSITION__ACTION:
        setAction(ACTION_EDEFAULT);
        return;
      case BehaviorPackage.FTRANSITION__BROADCAST:
        setBroadcast((Broadcast)null);
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
      case BehaviorPackage.FTRANSITION__TRIGGER:
        return trigger != null;
      case BehaviorPackage.FTRANSITION__GUARD:
        return guard != null;
      case BehaviorPackage.FTRANSITION__TO:
        return to != null;
      case BehaviorPackage.FTRANSITION__ACTION:
        return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
      case BehaviorPackage.FTRANSITION__BROADCAST:
        return broadcast != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (action: ");
    result.append(action);
    result.append(')');
    return result.toString();
  }

} //FTransitionImpl
