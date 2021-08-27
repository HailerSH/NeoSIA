package com.dcps.neosia.controller;

import android.app.Activity;

import com.dcps.neosia.model.LocalStorage;
import com.dcps.neosia.model.dao.AreaCurricularRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaCursadaRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaEnCursoRoomDAO;
import com.dcps.neosia.model.dao.AsignaturaRoomDAO;
import com.dcps.neosia.model.dao.CalificacionRoomDAO;
import com.dcps.neosia.model.dao.DepartamentoRoomDAO;
import com.dcps.neosia.model.dao.DivisionAdministrativaRoomDAO;
import com.dcps.neosia.model.dao.DocenteRoomDAO;
import com.dcps.neosia.model.dao.EstudianteRoomDAO;
import com.dcps.neosia.model.dao.EvaluacionRoomDAO;
import com.dcps.neosia.model.dao.FacultadRoomDAO;
import com.dcps.neosia.model.dao.GrupoRoomDAO;
import com.dcps.neosia.model.dao.HistoriaAcademicaRoomDAO;
import com.dcps.neosia.model.dao.PeriodoAcademicoRoomDAO;
import com.dcps.neosia.model.dao.PeriodoDeTiempoRoomDAO;
import com.dcps.neosia.model.dao.PersonaRoomDAO;
import com.dcps.neosia.model.dao.PlanDeEstudiosRoomDAO;
import com.dcps.neosia.model.dao.ProgramaAcademicoRoomDAO;
import com.dcps.neosia.model.dao.RequisitoDeAsignaturaRoomDAO;
import com.dcps.neosia.model.dao.SedeRoomDAO;
import com.dcps.neosia.model.dao.UserRoomDAO;
import com.dcps.neosia.model.pojo.AreaCurricular;
import com.dcps.neosia.model.pojo.Asignatura;
import com.dcps.neosia.model.pojo.AsignaturaCursada;
import com.dcps.neosia.model.pojo.Departamento;
import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Estudiante;
import com.dcps.neosia.model.pojo.Facultad;
import com.dcps.neosia.model.pojo.Grupo;
import com.dcps.neosia.model.pojo.PeriodoAcademico;
import com.dcps.neosia.model.pojo.PlanDeEstudios;
import com.dcps.neosia.model.pojo.ProgramaAcademico;
import com.dcps.neosia.model.pojo.Sede;

import java.util.Date;

public class InitialInformationDBController {

    private final AreaCurricularRoomDAO areaCurricularRoomDAO;
    private final AsignaturaRoomDAO asignaturaRoomDAO;
    private final AsignaturaCursadaRoomDAO asignaturaCursadaRoomDAO;
    private final AsignaturaEnCursoRoomDAO asignaturaEnCursoRoomDAO;
    private final CalificacionRoomDAO calificacionRoomDAO;
    private final DepartamentoRoomDAO departamentoRoomDAO;
    private final DivisionAdministrativaRoomDAO divisionAdministrativaRoomDAO;
    private final DocenteRoomDAO docenteRoomDAO;
    private final EstudianteRoomDAO estudianteRoomDAO;
    private final EvaluacionRoomDAO evaluacionRoomDAO;
    private final FacultadRoomDAO facultadRoomDAO;
    private final GrupoRoomDAO grupoRoomDAO;
    private final HistoriaAcademicaRoomDAO historiaAcademicaRoomDAO;
    private final PeriodoAcademicoRoomDAO periodoAcademicoRoomDAO;
    private final PeriodoDeTiempoRoomDAO periodoDeTiempoRoomDAO;
    private final PersonaRoomDAO personaRoomDAO;
    private final PlanDeEstudiosRoomDAO planDeEstudiosRoomDAO;
    private final ProgramaAcademicoRoomDAO programaAcademicoRoomDAO;
    private final RequisitoDeAsignaturaRoomDAO requisitoDeAsignaturaRoomDAO;
    private final SedeRoomDAO sedeRoomDAO;
    private final UserRoomDAO userRoomDAO;

    public InitialInformationDBController(Activity activity) {

        LocalStorage localStorage = LocalStorage.getLocalStorage(activity.getApplicationContext());

        this.areaCurricularRoomDAO = localStorage.areaCurricularRoomDAO();
        this.asignaturaRoomDAO = localStorage.asignaturaRoomDAO();
        this.asignaturaCursadaRoomDAO = localStorage.asignaturaCursadaRoomDAO();
        this.asignaturaEnCursoRoomDAO = localStorage.asignaturaEnCursoRoomDAO();
        this.calificacionRoomDAO = localStorage.calificacionRoomDAO();
        this.departamentoRoomDAO = localStorage.departamentoRoomDAO();
        this.divisionAdministrativaRoomDAO = localStorage.divisionAdministrativaRoomDAO();
        this.docenteRoomDAO = localStorage.docenteRoomDAO();
        this.estudianteRoomDAO = localStorage.estudianteRoomDAO();
        this.evaluacionRoomDAO = localStorage.evaluacionRoomDAO();
        this.facultadRoomDAO = localStorage.facultadRoomDAO();
        this.grupoRoomDAO = localStorage.grupoRoomDAO();
        this.historiaAcademicaRoomDAO = localStorage.historiaAcademicaRoomDAO();
        this.periodoAcademicoRoomDAO = localStorage.periodoAcademicoRoomDAO();
        this.periodoDeTiempoRoomDAO = localStorage.periodoDeTiempoRoomDAO();
        this.personaRoomDAO = localStorage.personaRoomDAO();
        this.planDeEstudiosRoomDAO = localStorage.planDeEstudiosRoomDAO();
        this.programaAcademicoRoomDAO = localStorage.programaAcademicoRoomDAO();
        this.requisitoDeAsignaturaRoomDAO = localStorage.requisitoDeAsignaturaRoomDAO();
        this.sedeRoomDAO = localStorage.sedeRoomDAO();
        this.userRoomDAO = localStorage.userRoomDAO();
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

        PeriodoAcademico periodoAcademico2021_1s = new PeriodoAcademico();
        periodoAcademico2021_1s.setSedeId(sede.getId());
        periodoAcademico2021_1s.setCodigo("2021-1s");
        periodoAcademico2021_1s.setFechaDeInicio(new Date(2021, 1, 1));
        periodoAcademico2021_1s.setFechaDeFinalizacion(new Date(2021, 6, 30));

        this.periodoAcademicoRoomDAO.insertMany(periodoAcademico2020_1s,
                                                periodoAcademico2020_2s,
                                                periodoAcademico2021_1s);

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

    private void createHistoriaAcademica20201s() {
        PeriodoAcademico periodoAcademico2020_1s = this.periodoAcademicoRoomDAO.getByCodigo("2020-1s").get(0);
        AreaCurricular areaCurricular = this.areaCurricularRoomDAO.getByNombre("Ingenieria de Sistemas e Informatica").get(0);

        Asignatura asignaturaCalculoDiferencial = new Asignatura();
        asignaturaCalculoDiferencial.setPeriodoAcademicoId(periodoAcademico2020_1s.getId());
        asignaturaCalculoDiferencial.setAreaCurricularId(areaCurricular.getId());
        asignaturaCalculoDiferencial.setCodigo("10040");
        asignaturaCalculoDiferencial.setNombre("Cálculo Diferencial");
        asignaturaCalculoDiferencial.setDescripcion("Se estudian las funciones, sus límites y derivadas");
        asignaturaCalculoDiferencial.setRequisitoDeCreditos(4);

        Asignatura asignaturaGeometriaVectorial = new Asignatura();
        asignaturaGeometriaVectorial.setPeriodoAcademicoId(periodoAcademico2020_1s.getId());
        asignaturaGeometriaVectorial.setAreaCurricularId(areaCurricular.getId());
        asignaturaGeometriaVectorial.setCodigo("10045");
        asignaturaGeometriaVectorial.setNombre("Geometria Vectorial");
        asignaturaGeometriaVectorial.setDescripcion("Se estudia el plano cartesiano");
        asignaturaGeometriaVectorial.setRequisitoDeCreditos(4);

        this.asignaturaRoomDAO.insertMany(asignaturaCalculoDiferencial, asignaturaGeometriaVectorial);

        Docente docente = this.docenteRoomDAO.getByIdentidad("987654321").get(0);

        Grupo grupo = new Grupo();
        grupo.setAsignaturaId(asignaturaCalculoDiferencial.getId());
        grupo.setDocenteId(docente.getId());
        grupo.setIdentificador("01");

        AsignaturaCursada asignaturaCursada = new AsignaturaCursada();
        asignaturaCursada.setEstado("aprobada");
        asignaturaCursada.setNotaFinal(5.0);

        this.asignaturaCursadaRoomDAO.insertOne(asignaturaCursada);
    }

    public void addInformation() {
        if (this.estudianteRoomDAO.getAll().size() == 0) {
            createEstudiantes();
            createDocentes();
            createAdministrativeInformation();
            createHistoriaAcademica20201s();
        }
    }
}
