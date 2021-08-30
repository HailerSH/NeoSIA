package com.dcps.neosia.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dcps.neosia.R;
import com.dcps.neosia.controller.InitialInformationDBController;
import com.dcps.neosia.controller.LoginActivityController;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;

    private LoginActivityController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        Button loginButton = findViewById(R.id.login_button);

        loginController = new LoginActivityController(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginController.login(usernameInput.getText().toString(),
                                      passwordInput.getText().toString());
            }
        });

        Objects.requireNonNull(getSupportActionBar()).hide();

        InitialInformationDBController initialInformationDB = new InitialInformationDBController(this);
        initialInformationDB.addInformation();
    }

    public void messageError(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Error en inicio de sesión")
                .setMessage(message)
                .setPositiveButton("Vale", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void loginSucced(String username, String rol) {
        Intent mainActivity = new Intent(this, MainActivity.class);

        mainActivity.putExtra("rol", rol);

        startActivity(mainActivity);
        finish();
    }
}