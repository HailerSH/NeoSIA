
package com.dcps.neosia.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

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
import com.dcps.neosia.model.pojo.AsignaturaEnCurso;
import com.dcps.neosia.model.pojo.Calificacion;
import com.dcps.neosia.model.pojo.Departamento;
import com.dcps.neosia.model.pojo.DivisionAdministrativa;
import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Estudiante;
import com.dcps.neosia.model.pojo.Evaluacion;
import com.dcps.neosia.model.pojo.Facultad;
import com.dcps.neosia.model.pojo.Grupo;
import com.dcps.neosia.model.pojo.HistoriaAcademica;
import com.dcps.neosia.model.pojo.PeriodoAcademico;
import com.dcps.neosia.model.pojo.PeriodoDeTiempo;
import com.dcps.neosia.model.pojo.Persona;
import com.dcps.neosia.model.pojo.PlanDeEstudios;
import com.dcps.neosia.model.pojo.ProgramaAcademico;
import com.dcps.neosia.model.pojo.RequisitoDeAsignatura;
import com.dcps.neosia.model.pojo.Sede;
import com.dcps.neosia.model.pojo.User;

@Database(entities = {AreaCurricular.class,
                      Asignatura.class,
                      AsignaturaCursada.class,
                      AsignaturaEnCurso.class,
                      Calificacion.class,
                      Departamento.class,
                      DivisionAdministrativa.class,
                      Docente.class,
                      Estudiante.class,
                      Evaluacion.class,
                      Facultad.class,
                      Grupo.class,
                      HistoriaAcademica.class,
                      PeriodoAcademico.class,
                      PeriodoDeTiempo.class,
                      Persona.class,
                      PlanDeEstudios.class,
                      ProgramaAcademico.class,
                      RequisitoDeAsignatura.class,
                      Sede.class,
                      User.class},
          version = 3)
@TypeConverters({DateConverter.class})
public abstract class LocalStorage extends RoomDatabase {

    public abstract AreaCurricularRoomDAO areaCurricularRoomDAO();
    public abstract AsignaturaRoomDAO asignaturaRoomDAO();
    public abstract AsignaturaCursadaRoomDAO asignaturaCursadaRoomDAO();
    public abstract AsignaturaEnCursoRoomDAO asignaturaEnCursoRoomDAO();
    public abstract CalificacionRoomDAO calificacionRoomDAO();
    public abstract DepartamentoRoomDAO departamentoRoomDAO();
    public abstract DivisionAdministrativaRoomDAO divisionAdministrativaRoomDAO();
    public abstract DocenteRoomDAO docenteRoomDAO();
    public abstract EstudianteRoomDAO estudianteRoomDAO();
    public abstract EvaluacionRoomDAO evaluacionRoomDAO();
    public abstract FacultadRoomDAO facultadRoomDAO();
    public abstract GrupoRoomDAO grupoRoomDAO();
    public abstract HistoriaAcademicaRoomDAO historiaAcademicaRoomDAO();
    public abstract PeriodoAcademicoRoomDAO periodoAcademicoRoomDAO();
    public abstract PeriodoDeTiempoRoomDAO periodoDeTiempoRoomDAO();
    public abstract PersonaRoomDAO personaRoomDAO();
    public abstract PlanDeEstudiosRoomDAO planDeEstudiosRoomDAO();
    public abstract ProgramaAcademicoRoomDAO programaAcademicoRoomDAO();
    public abstract RequisitoDeAsignaturaRoomDAO requisitoDeAsignaturaRoomDAO();
    public abstract SedeRoomDAO sedeRoomDAO();
    public abstract UserRoomDAO userRoomDAO();

    private static LocalStorage localStorage;

    public static LocalStorage getLocalStorage(final Context context) {
        if (localStorage == null) {
            localStorage = Room.databaseBuilder(context, LocalStorage.class,"NeoSIA_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return localStorage;
    }
}
