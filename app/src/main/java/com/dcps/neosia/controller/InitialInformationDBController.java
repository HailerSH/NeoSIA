package com.dcps.neosia.controller;

import android.app.Activity;

import com.dcps.neosia.model.LocalStorage;
import com.dcps.neosia.model.dao.AreaCurricularRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaCursadaRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaEnCursoRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaRoomDAO;
import com.dcps.neosia.model.dao.CalificacionRoomDAO;
import com.dcps.neosia.model.dao.DepartamentoRoomDAO;
import com.dcps.neosia.model.dao.DocenteRoomDAO;
import com.dcps.neosia.model.dao.EstudianteRoomDAO;
import com.dcps.neosia.model.dao.EvaluacionRoomDAO;
import com.dcps.neosia.model.dao.FacultadRoomDAO;
import com.dcps.neosia.model.dao.GrupoRoomDAO;
import com.dcps.neosia.model.dao.HistoriaAcademicaRoomDAO;
import com.dcps.neosia.model.dao.PeriodoAcademicoRoomDAO;
import com.dcps.neosia.model.dao.PlanDeEstudiosRoomDAO;
import com.dcps.neosia.model.dao.ProgramaAcademicoRoomDAO;
import com.dcps.neosia.model.dao.RequisitoDeAsignaturaRoomDAO;
import com.dcps.neosia.model.dao.SedeRoomDAO;
import com.dcps.neosia.model.pojo.AreaCurricular;
import com.dcps.neosia.model.pojo.Asignatura;
import com.dcps.neosia.model.pojo.AsignaturaCursada;
import com.dcps.neosia.model.pojo.AsignaturaEnCurso;
import com.dcps.neosia.model.pojo.Calificacion;
import com.dcps.neosia.model.pojo.Departamento;
import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Estudiante;
import com.dcps.neosia.model.pojo.Evaluacion;
import com.dcps.neosia.model.pojo.Facultad;
import com.dcps.neosia.model.pojo.Grupo;
import com.dcps.neosia.model.pojo.HistoriaAcademica;
import com.dcps.neosia.model.pojo.PeriodoAcademico;
import com.dcps.neosia.model.pojo.PlanDeEstudios;
import com.dcps.neosia.model.pojo.ProgramaAcademico;
import com.dcps.neosia.model.pojo.RequisitoDeAsignatura;
import com.dcps.neosia.model.pojo.Sede;

import java.util.Date;

public class InitialInformationDBController {

    private final AreaCurricularRoomDAO areaCurricularRoomDAO;
    private final AsignaturaRoomDAO asignaturaRoomDAO;
    private final AsignaturaCursadaRoomDAO asignaturaCursadaRoomDAO;
    private final AsignaturaEnCursoRoomDAO asignaturaEnCursoRoomDAO;
    private final CalificacionRoomDAO calificacionRoomDAO;
    private final DepartamentoRoomDAO departamentoRoomDAO;
    private final DocenteRoomDAO docenteRoomDAO;
    private final EstudianteRoomDAO estudianteRoomDAO;
    private final EvaluacionRoomDAO evaluacionRoomDAO;
    private final FacultadRoomDAO facultadRoomDAO;
    private final GrupoRoomDAO grupoRoomDAO;
    private final HistoriaAcademicaRoomDAO historiaAcademicaRoomDAO;
    private final PeriodoAcademicoRoomDAO periodoAcademicoRoomDAO;
    private final PlanDeEstudiosRoomDAO planDeEstudiosRoomDAO;
    private final ProgramaAcademicoRoomDAO programaAcademicoRoomDAO;
    private final RequisitoDeAsignaturaRoomDAO requisitoDeAsignaturaRoomDAO;
    private final SedeRoomDAO sedeRoomDAO;

    public InitialInformationDBController(Activity activity) {

        LocalStorage localStorage = LocalStorage.getLocalStorage(activity.getApplicationContext());

        this.areaCurricularRoomDAO = localStorage.areaCurricularRoomDAO();
        this.asignaturaRoomDAO = localStorage.asignaturaRoomDAO();
        this.asignaturaCursadaRoomDAO = localStorage.asignaturaCursadaRoomDAO();
        this.asignaturaEnCursoRoomDAO = localStorage.asignaturaEnCursoRoomDAO();
        this.calificacionRoomDAO = localStorage.calificacionRoomDAO();
        this.departamentoRoomDAO = localStorage.departamentoRoomDAO();
        this.docenteRoomDAO = localStorage.docenteRoomDAO();
        this.estudianteRoomDAO = localStorage.estudianteRoomDAO();
        this.evaluacionRoomDAO = localStorage.evaluacionRoomDAO();
        this.facultadRoomDAO = localStorage.facultadRoomDAO();
        this.grupoRoomDAO = localStorage.grupoRoomDAO();
        this.historiaAcademicaRoomDAO = localStorage.historiaAcademicaRoomDAO();
        this.periodoAcademicoRoomDAO = localStorage.periodoAcademicoRoomDAO();
        this.planDeEstudiosRoomDAO = localStorage.planDeEstudiosRoomDAO();
        this.programaAcademicoRoomDAO = localStorage.programaAcademicoRoomDAO();
        this.requisitoDeAsignaturaRoomDAO = localStorage.requisitoDeAsignaturaRoomDAO();
        this.sedeRoomDAO = localStorage.sedeRoomDAO();
    }


    private void createEstudiantes() {
        Estudiante estudiante = new Estudiante();

        estudiante.setUsername("ncapdetm");
        estudiante.setPassword("Nicolas123");
        estudiante.setRol("estudiante");

        estudiante.setTipoDeIdentidad("CC");
        estudiante.setIdentidad("123456789");
        estudiante.setPrimerNombre("Nicolás");
        estudiante.setSegundoNombre("");
        estudiante.setPrimerApellido("Capdet");
        estudiante.setSegundoApellido("Martinez");
        estudiante.setCorreoElectronicoPersonal("ncapdetm@gmail.com");
        estudiante.setCorreoElectronicoUniversitario("ncapdetm@unal.edu.co");
        estudiante.setFechaDeNacimiento(new Date(1998, 11, 9));
        estudiante.setTipoDeSangre("O+");
        estudiante.setDireccion("Conjunto Nebraska, Robledo");

        this.estudianteRoomDAO.insertOne(estudiante);
    }

    private void createDocentes() {
        Docente docente = new Docente();

        docente.setUsername("amorenos");
        docente.setPassword("Antonio123");
        docente.setRol("docente");

        docente.setTipoDeIdentidad("CC");
        docente.setIdentidad("987654321");
        docente.setPrimerNombre("Antonio");
        docente.setSegundoNombre("José");
        docente.setPrimerApellido("Moreno");
        docente.setSegundoApellido("Saavedra");
        docente.setCorreoElectronicoPersonal("amorenos@gmail.com");
        docente.setCorreoElectronicoUniversitario("amorenos@unal.edu.co");
        docente.setFechaDeNacimiento(new Date(1998, 10, 3));
        docente.setTipoDeSangre("B+");
        docente.setDireccion("Los Colores, Robledo");

        this.docenteRoomDAO.insertOne(docente);
    }

    private void createAdministrativeInformation() {
        Sede sede = new Sede();
        sede.setCodigo("01");
        sede.setNombre("Medellin");

        this.sedeRoomDAO.insertOne(sede);

        PeriodoAcademico periodoAcademico2020_1s = new PeriodoAcademico();
        periodoAcademico2020_1s.setSedeId(sede.getId());
        periodoAcademico2020_1s.setCodigo("2020-1s");
        periodoAcademico2020_1s.setFechaDeInicio(new Date(2020, 1, 1));
        periodoAcademico2020_1s.setFechaDeFinalizacion(new Date(2020, 6, 30));

        PeriodoAcademico periodoAcademico2020_2s = new PeriodoAcademico();
        periodoAcademico2020_2s.setSedeId(sede.getId());
        periodoAcademico2020_2s.setCodigo("2020-2s");
        periodoAcademico2020_2s.setFechaDeInicio(new Date(2020, 7, 1));
        periodoAcademico2020_2s.setFechaDeFinalizacion(new Date(2020, 12, 31));

        this.periodoAcademicoRoomDAO.insertMany(periodoAcademico2020_1s,
                                                periodoAcademico2020_2s);

        Facultad facultad = new Facultad();
        facultad.setCodigo("01");
        facultad.setNombre("Minas");
        facultad.setSedeId(sede.getId());

        this.facultadRoomDAO.insertOne(facultad);

        Departamento departamento = new Departamento();
        departamento.setCodigo("01");
        departamento.setNombre("Ciencias de la computación");
        departamento.setFacultadId(facultad.getId());

        this.departamentoRoomDAO.insertOne(departamento);

        AreaCurricular areaCurricular = new AreaCurricular();
        areaCurricular.setCodigo("01");
        areaCurricular.setNombre("Ingenieria de Sistemas e Informatica");
        areaCurricular.setDepartamentoId(departamento.getId());

        this.areaCurricularRoomDAO.insertOne(areaCurricular);

        ProgramaAcademico programaAcademico = new ProgramaAcademico();
        programaAcademico.setCodigo("01");
        programaAcademico.setNombre("Ingenieria de Sistemas e Informatica");
        programaAcademico.setTipo("pregrado");
        programaAcademico.setAreaCurricularId(areaCurricular.getId());

        this.programaAcademicoRoomDAO.insertOne(programaAcademico);

        PlanDeEstudios planDeEstudios = new PlanDeEstudios();
        planDeEstudios.setCodigo("01");
        planDeEstudios.setProgramaAcademicoId(programaAcademico.getId());

        this.planDeEstudiosRoomDAO.insertOne(planDeEstudios);
    }

    private void createHistoriaAcademicaEstudiante() {

        Estudiante estudiante = this.estudianteRoomDAO.getByIdentidad("123456789").get(0);

        PlanDeEstudios planDeEstudios = this.planDeEstudiosRoomDAO.getByCodigo("01").get(0);

        HistoriaAcademica historiaAcademica = new HistoriaAcademica();
        historiaAcademica.setEstudianteId(estudiante.getId());
        historiaAcademica.setPlanDeEstudiosId(planDeEstudios.getId());
        historiaAcademica.setEstado("activa");

        this.historiaAcademicaRoomDAO.insertOne(historiaAcademica);
    }

    private void createHistoriaAcademica20201s() {
        PeriodoAcademico periodoAcademico2020_1s = this.periodoAcademicoRoomDAO.getByCodigo("2020-1s").get(0);
        AreaCurricular areaCurricular = this.areaCurricularRoomDAO.getByNombre("Ingenieria de Sistemas e Informatica").get(0);
        PlanDeEstudios planDeEstudios = this.planDeEstudiosRoomDAO.getByCodigo("01").get(0);

        Asignatura asignaturaCalculoDiferencial = new Asignatura();
        asignaturaCalculoDiferencial.setPeriodoAcademicoId(periodoAcademico2020_1s.getId());
        asignaturaCalculoDiferencial.setAreaCurricularId(areaCurricular.getId());
        asignaturaCalculoDiferencial.setCodigo("10040");
        asignaturaCalculoDiferencial.setNombre("Cálculo Diferencial");
        asignaturaCalculoDiferencial.setDescripcion("Se estudian las funciones, sus límites y derivadas");
        asignaturaCalculoDiferencial.setRequisitoDeCreditos(4);

        RequisitoDeAsignatura requisitoDeAsignaturaCalculoDiferencial = new RequisitoDeAsignatura();
        requisitoDeAsignaturaCalculoDiferencial.setPlanDeEstudiosId(planDeEstudios.getId());
        requisitoDeAsignaturaCalculoDiferencial.setAsignaturaId(asignaturaCalculoDiferencial.getId());

        Asignatura asignaturaGeometriaVectorial = new Asignatura();
        asignaturaGeometriaVectorial.setPeriodoAcademicoId(periodoAcademico2020_1s.getId());
        asignaturaGeometriaVectorial.setAreaCurricularId(areaCurricular.getId());
        asignaturaGeometriaVectorial.setCodigo("10045");
        asignaturaGeometriaVectorial.setNombre("Geometria Vectorial");
        asignaturaGeometriaVectorial.setDescripcion("Se estudia el plano cartesiano");
        asignaturaGeometriaVectorial.setRequisitoDeCreditos(4);

        RequisitoDeAsignatura requisitoDeAsignaturaGeometriaVectorial = new RequisitoDeAsignatura();
        requisitoDeAsignaturaGeometriaVectorial.setPlanDeEstudiosId(planDeEstudios.getId());
        requisitoDeAsignaturaGeometriaVectorial.setAsignaturaId(asignaturaGeometriaVectorial.getId());

        this.asignaturaRoomDAO.insertMany(asignaturaCalculoDiferencial, asignaturaGeometriaVectorial);

        this.requisitoDeAsignaturaRoomDAO.insertMany(requisitoDeAsignaturaCalculoDiferencial,
                                                     requisitoDeAsignaturaGeometriaVectorial);

        Docente docente = this.docenteRoomDAO.getByIdentidad("987654321").get(0);

        Grupo grupoCalculoDiferencial = new Grupo();
        grupoCalculoDiferencial.setAsignaturaId(asignaturaCalculoDiferencial.getId());
        grupoCalculoDiferencial.setDocenteId(docente.getId());
        grupoCalculoDiferencial.setIdentificador("01");

        this.grupoRoomDAO.insertOne(grupoCalculoDiferencial);

        Evaluacion evaluacion1CalculoDiferencial = new Evaluacion();
        evaluacion1CalculoDiferencial.setGrupoId(grupoCalculoDiferencial.getId());
        evaluacion1CalculoDiferencial.setNombre("Parcial 1");
        evaluacion1CalculoDiferencial.setPorcentaje(33.4);

        Evaluacion evaluacion2CalculoDiferencial = new Evaluacion();
        evaluacion2CalculoDiferencial.setGrupoId(grupoCalculoDiferencial.getId());
        evaluacion2CalculoDiferencial.setNombre("Parcial 2");
        evaluacion2CalculoDiferencial.setPorcentaje(33.3);

        Evaluacion evaluacion3CalculoDiferencial = new Evaluacion();
        evaluacion3CalculoDiferencial.setGrupoId(grupoCalculoDiferencial.getId());
        evaluacion3CalculoDiferencial.setNombre("Parcial 3");
        evaluacion3CalculoDiferencial.setPorcentaje(33.3);

        this.evaluacionRoomDAO.insertMany(evaluacion1CalculoDiferencial,
                                          evaluacion2CalculoDiferencial,
                                          evaluacion3CalculoDiferencial);

        Calificacion calificacion1CalculoDiferencial = new Calificacion();
        calificacion1CalculoDiferencial.setEvaluacionId(evaluacion1CalculoDiferencial.getId());
        calificacion1CalculoDiferencial.setValor(4.0);

        Calificacion calificacion2CalculoDiferencial = new Calificacion();
        calificacion2CalculoDiferencial.setEvaluacionId(evaluacion2CalculoDiferencial.getId());
        calificacion2CalculoDiferencial.setValor(4.5);

        Calificacion calificacion3CalculoDiferencial = new Calificacion();
        calificacion3CalculoDiferencial.setEvaluacionId(evaluacion3CalculoDiferencial.getId());
        calificacion3CalculoDiferencial.setValor(4.2);

        this.calificacionRoomDAO.insertMany(calificacion1CalculoDiferencial,
                                            calificacion2CalculoDiferencial,
                                            calificacion3CalculoDiferencial);

        AsignaturaCursada asignaturaCursadaCalculoDiferencial = new AsignaturaCursada();
        asignaturaCursadaCalculoDiferencial.setGrupoId(grupoCalculoDiferencial.getId());
        asignaturaCursadaCalculoDiferencial.setEstado("aprobada");
        asignaturaCursadaCalculoDiferencial.setNotaFinal(4.2);

        this.asignaturaCursadaRoomDAO.insertOne(asignaturaCursadaCalculoDiferencial);

        Grupo grupoGeometriaVectorial = new Grupo();
        grupoGeometriaVectorial.setAsignaturaId(asignaturaGeometriaVectorial.getId());
        grupoGeometriaVectorial.setDocenteId(docente.getId());
        grupoGeometriaVectorial.setIdentificador("01");

        this.grupoRoomDAO.insertOne(grupoGeometriaVectorial);

        Evaluacion evaluacion1GeometriaVectorial = new Evaluacion();
        evaluacion1GeometriaVectorial.setGrupoId(grupoGeometriaVectorial.getId());
        evaluacion1GeometriaVectorial.setNombre("Parcial 1");
        evaluacion1GeometriaVectorial.setPorcentaje(33.4);

        Evaluacion evaluacion2GeometriaVectorial = new Evaluacion();
        evaluacion2GeometriaVectorial.setGrupoId(grupoGeometriaVectorial.getId());
        evaluacion2GeometriaVectorial.setNombre("Parcial 2");
        evaluacion2GeometriaVectorial.setPorcentaje(33.3);

        Evaluacion evaluacion3GeometriaVectorial = new Evaluacion();
        evaluacion3GeometriaVectorial.setGrupoId(grupoGeometriaVectorial.getId());
        evaluacion3GeometriaVectorial.setNombre("Parcial 3");
        evaluacion3GeometriaVectorial.setPorcentaje(33.3);

        this.evaluacionRoomDAO.insertMany(evaluacion1GeometriaVectorial,
                                          evaluacion2GeometriaVectorial,
                                          evaluacion3GeometriaVectorial);

        Calificacion calificacion1GeometriaVectorial = new Calificacion();
        calificacion1GeometriaVectorial.setEvaluacionId(evaluacion1GeometriaVectorial.getId());
        calificacion1GeometriaVectorial.setValor(4.0);

        Calificacion calificacion2GeometriaVectorial = new Calificacion();
        calificacion2GeometriaVectorial.setEvaluacionId(evaluacion2GeometriaVectorial.getId());
        calificacion2GeometriaVectorial.setValor(4.5);

        Calificacion calificacion3GeometriaVectorial = new Calificacion();
        calificacion3GeometriaVectorial.setEvaluacionId(evaluacion3GeometriaVectorial.getId());
        calificacion3GeometriaVectorial.setValor(4.2);

        this.calificacionRoomDAO.insertMany(calificacion1GeometriaVectorial,
                                            calificacion2GeometriaVectorial,
                                            calificacion3GeometriaVectorial);

        AsignaturaCursada asignaturaCursadaGeometriaVectorial = new AsignaturaCursada();
        asignaturaCursadaGeometriaVectorial.setGrupoId(grupoCalculoDiferencial.getId());
        asignaturaCursadaGeometriaVectorial.setEstado("aprobada");
        asignaturaCursadaGeometriaVectorial.setNotaFinal(4.2);

        this.asignaturaCursadaRoomDAO.insertOne(asignaturaCursadaGeometriaVectorial);
    }

    private void createHistoriaAcademicaActual20202s() {
        PeriodoAcademico periodoAcademico2020_2s = this.periodoAcademicoRoomDAO.getByCodigo("2020-2s").get(0);
        AreaCurricular areaCurricular = this.areaCurricularRoomDAO.getByNombre("Ingenieria de Sistemas e Informatica").get(0);
        PlanDeEstudios planDeEstudios = this.planDeEstudiosRoomDAO.getByCodigo("01").get(0);

        Asignatura asignaturaCalculoIntegral = new Asignatura();
        asignaturaCalculoIntegral.setPeriodoAcademicoId(periodoAcademico2020_2s.getId());
        asignaturaCalculoIntegral.setAreaCurricularId(areaCurricular.getId());
        asignaturaCalculoIntegral.setCodigo("10050");
        asignaturaCalculoIntegral.setNombre("Cálculo Integral");
        asignaturaCalculoIntegral.setDescripcion("Se estudian las integrales");
        asignaturaCalculoIntegral.setRequisitoDeCreditos(4);

        RequisitoDeAsignatura requisitoDeAsignaturaCalculoIntegral = new RequisitoDeAsignatura();
        requisitoDeAsignaturaCalculoIntegral.setPlanDeEstudiosId(planDeEstudios.getId());
        requisitoDeAsignaturaCalculoIntegral.setAsignaturaId(asignaturaCalculoIntegral.getId());

        Asignatura asignaturaAlgebraLineal = new Asignatura();
        asignaturaAlgebraLineal.setPeriodoAcademicoId(periodoAcademico2020_2s.getId());
        asignaturaAlgebraLineal.setAreaCurricularId(areaCurricular.getId());
        asignaturaAlgebraLineal.setCodigo("10055");
        asignaturaAlgebraLineal.setNombre("Algebra Lineal");
        asignaturaAlgebraLineal.setDescripcion("Se estudia el plano cartesiano desde las matrices");
        asignaturaAlgebraLineal.setRequisitoDeCreditos(4);

        RequisitoDeAsignatura requisitoDeAsignaturaAlgebraLineal = new RequisitoDeAsignatura();
        requisitoDeAsignaturaAlgebraLineal.setPlanDeEstudiosId(planDeEstudios.getId());
        requisitoDeAsignaturaAlgebraLineal.setAsignaturaId(asignaturaAlgebraLineal.getId());

        this.asignaturaRoomDAO.insertMany(asignaturaCalculoIntegral, asignaturaAlgebraLineal);

        this.requisitoDeAsignaturaRoomDAO.insertMany(requisitoDeAsignaturaCalculoIntegral,
                                                     requisitoDeAsignaturaAlgebraLineal);

        Docente docente = this.docenteRoomDAO.getByIdentidad("987654321").get(0);

        Grupo grupoCalculoIntegral = new Grupo();
        grupoCalculoIntegral.setAsignaturaId(asignaturaCalculoIntegral.getId());
        grupoCalculoIntegral.setDocenteId(docente.getId());
        grupoCalculoIntegral.setIdentificador("01");

        this.grupoRoomDAO.insertOne(grupoCalculoIntegral);

        Evaluacion evaluacion1CalculoIntegral = new Evaluacion();
        evaluacion1CalculoIntegral.setGrupoId(grupoCalculoIntegral.getId());
        evaluacion1CalculoIntegral.setNombre("Parcial 1");
        evaluacion1CalculoIntegral.setPorcentaje(33.4);

        Evaluacion evaluacion2CalculoIntegral = new Evaluacion();
        evaluacion2CalculoIntegral.setGrupoId(grupoCalculoIntegral.getId());
        evaluacion2CalculoIntegral.setNombre("Parcial 2");
        evaluacion2CalculoIntegral.setPorcentaje(33.3);

        Evaluacion evaluacion3CalculoIntegral = new Evaluacion();
        evaluacion3CalculoIntegral.setGrupoId(grupoCalculoIntegral.getId());
        evaluacion3CalculoIntegral.setNombre("Parcial 3");
        evaluacion3CalculoIntegral.setPorcentaje(33.3);

        this.evaluacionRoomDAO.insertMany(evaluacion1CalculoIntegral,
                                          evaluacion2CalculoIntegral,
                                          evaluacion3CalculoIntegral);

        Calificacion calificacion1CalculoIntegral = new Calificacion();
        calificacion1CalculoIntegral.setEvaluacionId(evaluacion1CalculoIntegral.getId());
        calificacion1CalculoIntegral.setValor(4.0);

        this.calificacionRoomDAO.insertOne(calificacion1CalculoIntegral);

        AsignaturaEnCurso asignaturaEnCursoCalculoIntegral = new AsignaturaEnCurso();
        asignaturaEnCursoCalculoIntegral.setGrupoId(grupoCalculoIntegral.getId());

        this.asignaturaEnCursoRoomDAO.insertOne(asignaturaEnCursoCalculoIntegral);

        Grupo grupoAlgebraLineal = new Grupo();
        grupoAlgebraLineal.setAsignaturaId(asignaturaAlgebraLineal.getId());
        grupoAlgebraLineal.setDocenteId(docente.getId());
        grupoAlgebraLineal.setIdentificador("01");

        this.grupoRoomDAO.insertOne(grupoAlgebraLineal);

        Evaluacion evaluacion1AlgebraLineal= new Evaluacion();
        evaluacion1AlgebraLineal.setGrupoId(grupoAlgebraLineal.getId());
        evaluacion1AlgebraLineal.setNombre("Parcial 1");
        evaluacion1AlgebraLineal.setPorcentaje(33.4);

        Evaluacion evaluacion2AlgebraLineal = new Evaluacion();
        evaluacion2AlgebraLineal.setGrupoId(grupoAlgebraLineal.getId());
        evaluacion2AlgebraLineal.setNombre("Parcial 2");
        evaluacion2AlgebraLineal.setPorcentaje(33.3);

        Evaluacion evaluacion3AlgebraLineal = new Evaluacion();
        evaluacion3AlgebraLineal.setGrupoId(grupoAlgebraLineal.getId());
        evaluacion3AlgebraLineal.setNombre("Parcial 3");
        evaluacion3AlgebraLineal.setPorcentaje(33.3);

        this.evaluacionRoomDAO.insertMany(evaluacion1AlgebraLineal,
                                          evaluacion2AlgebraLineal,
                                          evaluacion3AlgebraLineal);

        Calificacion calificacion1AlgebraLineal = new Calificacion();
        calificacion1AlgebraLineal.setEvaluacionId(evaluacion1AlgebraLineal.getId());
        calificacion1AlgebraLineal.setValor(4.0);

        Calificacion calificacion2AlgebraLineal = new Calificacion();
        calificacion2AlgebraLineal.setEvaluacionId(evaluacion2AlgebraLineal.getId());
        calificacion2AlgebraLineal.setValor(4.5);

        this.calificacionRoomDAO.insertMany(calificacion1AlgebraLineal,
                                            calificacion2AlgebraLineal);

        AsignaturaEnCurso asignaturaEnCursoAlgebraLineal = new AsignaturaEnCurso();
        asignaturaEnCursoAlgebraLineal.setGrupoId(grupoAlgebraLineal.getId());

        this.asignaturaEnCursoRoomDAO.insertOne(asignaturaEnCursoAlgebraLineal);
    }

    public void addInformation() {
        if (this.estudianteRoomDAO.getAll().size() == 0) {
            createEstudiantes();
            createDocentes();
            createAdministrativeInformation();
            createHistoriaAcademicaEstudiante();
            createHistoriaAcademica20201s();
            createHistoriaAcademicaActual20202s();
        }
    }
}
