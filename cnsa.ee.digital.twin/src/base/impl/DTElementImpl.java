/**
 */
package base.impl;

import base.Base_Package;
import base.DTElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.DTElementImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#isIsCitation <em>Is Citation</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#getCitedElement <em>Cited Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DTElementImpl extends ElementImpl implements DTElement {
	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final String GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected String gid = GID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCitation() <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCitation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CITATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCitation() <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCitation()
	 * @generated
	 * @ordered
	 */
	protected boolean isCitation = IS_CITATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCitedElement() <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedElement()
	 * @generated
	 * @ordered
	 */
	protected DTElement citedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Base_Package.Literals.DT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGid(String newGid) {
		String oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCitation() {
		return isCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCitation(boolean newIsCitation) {
		boolean oldIsCitation = isCitation;
		isCitation = newIsCitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__IS_CITATION, oldIsCitation, isCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTElement getCitedElement() {
		if (citedElement != null && citedElement.eIsProxy()) {
			InternalEObject oldCitedElement = (InternalEObject)citedElement;
			citedElement = (DTElement)eResolveProxy(oldCitedElement);
			if (citedElement != oldCitedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Base_Package.DT_ELEMENT__CITED_ELEMENT, oldCitedElement, citedElement));
			}
		}
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTElement basicGetCitedElement() {
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitedElement(DTElement newCitedElement) {
		DTElement oldCitedElement = citedElement;
		citedElement = newCitedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__CITED_ELEMENT, oldCitedElement, citedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Base_Package.DT_ELEMENT__GID:
				return getGid();
			case Base_Package.DT_ELEMENT__IS_CITATION:
				return isIsCitation();
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				return isIsAbstract();
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				if (resolve) return getCitedElement();
				return basicGetCitedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Base_Package.DT_ELEMENT__GID:
				setGid((String)newValue);
				return;
			case Base_Package.DT_ELEMENT__IS_CITATION:
				setIsCitation((Boolean)newValue);
				return;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				setCitedElement((DTElement)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Base_Package.DT_ELEMENT__GID:
				setGid(GID_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__IS_CITATION:
				setIsCitation(IS_CITATION_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				setCitedElement((DTElement)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Base_Package.DT_ELEMENT__GID:
				return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
			case Base_Package.DT_ELEMENT__IS_CITATION:
				return isCitation != IS_CITATION_EDEFAULT;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				return citedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gid: ");
		result.append(gid);
		result.append(", isCitation: ");
		result.append(isCitation);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //DTElementImpl
