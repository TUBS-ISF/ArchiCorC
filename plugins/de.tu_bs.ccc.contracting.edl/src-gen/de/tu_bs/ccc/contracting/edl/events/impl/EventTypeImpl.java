/**
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.edl.events.impl;

import de.tu_bs.ccc.contracting.edl.events.AnnotationBlock;
import de.tu_bs.ccc.contracting.edl.events.Event;
import de.tu_bs.ccc.contracting.edl.events.EventType;
import de.tu_bs.ccc.contracting.edl.events.EventsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.impl.EventTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.impl.EventTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.ccc.contracting.edl.events.impl.EventTypeImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventTypeImpl extends MinimalEObjectImpl.Container implements EventType
{
  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected AnnotationBlock comment;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventTypeImpl()
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
    return EventsPackage.Literals.EVENT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnnotationBlock getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComment(AnnotationBlock newComment, NotificationChain msgs)
  {
    AnnotationBlock oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_TYPE__COMMENT, oldComment, newComment);
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
  public void setComment(AnnotationBlock newComment)
  {
    if (newComment != comment)
    {
      NotificationChain msgs = null;
      if (comment != null)
        msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_TYPE__COMMENT, null, msgs);
      if (newComment != null)
        msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_TYPE__COMMENT, null, msgs);
      msgs = basicSetComment(newComment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_TYPE__COMMENT, newComment, newComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, EventsPackage.EVENT_TYPE__EVENTS);
    }
    return events;
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
      case EventsPackage.EVENT_TYPE__COMMENT:
        return basicSetComment(null, msgs);
      case EventsPackage.EVENT_TYPE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
      case EventsPackage.EVENT_TYPE__COMMENT:
        return getComment();
      case EventsPackage.EVENT_TYPE__NAME:
        return getName();
      case EventsPackage.EVENT_TYPE__EVENTS:
        return getEvents();
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
      case EventsPackage.EVENT_TYPE__COMMENT:
        setComment((AnnotationBlock)newValue);
        return;
      case EventsPackage.EVENT_TYPE__NAME:
        setName((String)newValue);
        return;
      case EventsPackage.EVENT_TYPE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
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
      case EventsPackage.EVENT_TYPE__COMMENT:
        setComment((AnnotationBlock)null);
        return;
      case EventsPackage.EVENT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EventsPackage.EVENT_TYPE__EVENTS:
        getEvents().clear();
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
      case EventsPackage.EVENT_TYPE__COMMENT:
        return comment != null;
      case EventsPackage.EVENT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EventsPackage.EVENT_TYPE__EVENTS:
        return events != null && !events.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EventTypeImpl
