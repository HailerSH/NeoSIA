package com.dcps.neosia.controller;

import com.dcps.neosia.model.LocalStorage;
import com.dcps.neosia.model.dao.DocenteRoomDAO;
import com.dcps.neosia.model.dao.EstudianteRoomDAO;
import com.dcps.neosia.model.pojo.Docente;
import com.dcps.neosia.model.pojo.Estudiante;
import com.dcps.neosia.model.pojo.User;
import com.dcps.neosia.ui.LoginActivity;

import java.util.List;

public class LoginActivityController {

    private final LoginActivity loginActivity;

    private final EstudianteRoomDAO estudianteRoomDAO;
    private final DocenteRoomDAO docenteRoomDAO;

    public LoginActivityController(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;

        LocalStorage localStorage = LocalStorage.getLocalStorage(loginActivity.getApplicationContext());

        this.estudianteRoomDAO = localStorage.estudianteRoomDAO();
        this.docenteRoomDAO = localStorage.docenteRoomDAO();
    }

    public void login(String username, String password) {
        if (username == null || username.compareTo("") == 0) {
            this.loginActivity.messageError("El nombre de usuario es requerido");
        } else if (password == null || password.compareTo("") == 0) {
            this.loginActivity.messageError("La contraseña es requerida");
        } else {
            List<Estudiante> estudianteList = this.estudianteRoomDAO.getByUsername(username);
            List<Docente> docenteList = this.docenteRoomDAO.getByUsername(username);

            User user;

            if (estudianteList.size() > 0) {
                user = estudianteList.get(0);
            } else if (docenteList.size() > 0) {
                user = docenteList.get(0);
            } else {
                this.loginActivity.messageError("El usuario no esta registrado");
                return;
            }

            if (user.getPassword().compareTo(password) == 0) {
                this.loginActivity.loginSucced(username, user.getRol());
            } else {
                this.loginActivity.messageError("Contraseña incorrecta");
            }
        }
    }
}
