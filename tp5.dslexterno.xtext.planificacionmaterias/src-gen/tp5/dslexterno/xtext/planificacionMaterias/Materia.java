/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getRequerimientos <em>Requerimientos</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends Elementos
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
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Requerimientos</b></em>' containment reference list.
   * The list contents are of type {@link tp5.dslexterno.xtext.planificacionMaterias.Recurso}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requerimientos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requerimientos</em>' containment reference list.
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Requerimientos()
   * @model containment="true"
   * @generated
   */
  EList<Recurso> getRequerimientos();

  /**
   * Returns the value of the '<em><b>Profesor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profesor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profesor</em>' reference.
   * @see #setProfesor(Profesor)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Profesor()
   * @model
   * @generated
   */
  Profesor getProfesor();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getProfesor <em>Profesor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profesor</em>' reference.
   * @see #getProfesor()
   * @generated
   */
  void setProfesor(Profesor value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' reference.
   * @see #setAula(Aula)
   * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getMateria_Aula()
   * @model
   * @generated
   */
  Aula getAula();

  /**
   * Sets the value of the '{@link tp5.dslexterno.xtext.planificacionMaterias.Materia#getAula <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' reference.
   * @see #getAula()
   * @generated
   */
  void setAula(Aula value);

} // Materia