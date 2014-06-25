/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDedicacion <em>Dedicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getProfesor()
 * @model
 * @generated
 */
public interface Profesor extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getProfesor_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Dedicacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dedicacion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dedicacion</em>' containment reference.
   * @see #setDedicacion(Dedicacion)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getProfesor_Dedicacion()
   * @model containment="true"
   * @generated
   */
  Dedicacion getDedicacion();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Profesor#getDedicacion <em>Dedicacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dedicacion</em>' containment reference.
   * @see #getDedicacion()
   * @generated
   */
  void setDedicacion(Dedicacion value);

} // Profesor