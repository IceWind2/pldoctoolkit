/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spbu.pldoctoolkit.graph.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.spbu.pldoctoolkit.graph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.spbu.pldoctoolkit.graph.DrlPackage
 * @generated
 */
public class DrlSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "copyleft 2007";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DrlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrlSwitch() {
		if (modelPackage == null) {
			modelPackage = DrlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DrlPackage.INF_ELEMENT: {
				InfElement infElement = (InfElement)theEObject;
				T result = caseInfElement(infElement);
				if (result == null) result = caseGenericDocumentPart(infElement);
				if (result == null) result = caseDrlElement(infElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.INF_PRODUCT: {
				InfProduct infProduct = (InfProduct)theEObject;
				T result = caseInfProduct(infProduct);
				if (result == null) result = caseGenericDocumentPart(infProduct);
				if (result == null) result = caseDrlElement(infProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.FINAL_INF_PRODUCT: {
				FinalInfProduct finalInfProduct = (FinalInfProduct)theEObject;
				T result = caseFinalInfProduct(finalInfProduct);
				if (result == null) result = caseDrlElement(finalInfProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.NEST_POINT: {
				NestPoint nestPoint = (NestPoint)theEObject;
				T result = caseNestPoint(nestPoint);
				if (result == null) result = caseDrlElement(nestPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.GENERIC_DOCUMENT_PART: {
				GenericDocumentPart genericDocumentPart = (GenericDocumentPart)theEObject;
				T result = caseGenericDocumentPart(genericDocumentPart);
				if (result == null) result = caseDrlElement(genericDocumentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.INF_ELEM_REF: {
				InfElemRef infElemRef = (InfElemRef)theEObject;
				T result = caseInfElemRef(infElemRef);
				if (result == null) result = caseDrlElement(infElemRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.INF_ELEM_REF_GROUP: {
				InfElemRefGroup infElemRefGroup = (InfElemRefGroup)theEObject;
				T result = caseInfElemRefGroup(infElemRefGroup);
				if (result == null) result = caseDrlElement(infElemRefGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.PRODUCT_LINE: {
				ProductLine productLine = (ProductLine)theEObject;
				T result = caseProductLine(productLine);
				if (result == null) result = caseDrlElement(productLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseDrlElement(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.DOCUMENTATION_CORE: {
				DocumentationCore documentationCore = (DocumentationCore)theEObject;
				T result = caseDocumentationCore(documentationCore);
				if (result == null) result = caseDrlElement(documentationCore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.PRODUCT_DOCUMENTATION: {
				ProductDocumentation productDocumentation = (ProductDocumentation)theEObject;
				T result = caseProductDocumentation(productDocumentation);
				if (result == null) result = caseDrlElement(productDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.DRL_ELEMENT: {
				DrlElement drlElement = (DrlElement)theEObject;
				T result = caseDrlElement(drlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.ADAPTER: {
				Adapter adapter = (Adapter)theEObject;
				T result = caseAdapter(adapter);
				if (result == null) result = caseDrlElement(adapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrlPackage.NEST: {
				Nest nest = (Nest)theEObject;
				T result = caseNest(nest);
				if (result == null) result = caseDrlElement(nest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inf Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inf Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfElement(InfElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inf Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inf Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfProduct(InfProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Inf Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Inf Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalInfProduct(FinalInfProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nest Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nest Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestPoint(NestPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Document Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Document Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDocumentPart(GenericDocumentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inf Elem Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inf Elem Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfElemRef(InfElemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inf Elem Ref Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inf Elem Ref Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfElemRefGroup(InfElemRefGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductLine(ProductLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationCore(DocumentationCore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDocumentation(ProductDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrlElement(DrlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapter(Adapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNest(Nest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DrlSwitch
