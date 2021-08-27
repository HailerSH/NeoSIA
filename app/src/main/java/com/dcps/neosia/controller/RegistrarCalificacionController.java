package com.dcps.neosia.controller;

import androidx.fragment.app.Fragment;

import com.dcps.neosia.model.LocalStorage;
import com.dcps.neosia.model.dao.GrupoRoomDAO;
import com.dcps.neosia.model.pojo.Grupo;
import com.dcps.neosia.ui.registrar_calificacion.GruposFragment;

import java.util.List;

public class RegistrarCalificacionController {

    private GruposFragment gruposFragment;

    private final GrupoRoomDAO grupoRoomDAO;

    public RegistrarCalificacionController(GruposFragment gruposFragment) {
        this.gruposFragment = gruposFragment;

        LocalStorage localStorage = LocalStorage.getLocalStorage(gruposFragment.getActivity().getApplicationContext());
        this.grupoRoomDAO = localStorage.grupoRoomDAO();
    }

    public List<Grupo> getGrupos() {
        return this.grupoRoomDAO.getAll();
    }
}
