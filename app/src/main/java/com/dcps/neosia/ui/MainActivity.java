package com.dcps.neosia.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dcps.neosia.R;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.dcps.neosia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    private String rol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home,
                                                               R.id.nav_consultar_asignatura,
                                                               R.id.nav_consultar_historia_academica,
                                                               R.id.nav_registrar_calificacion)
                                    .setOpenableLayout(drawer)
                                    .build();

        NavController navController = Navigation.findNavController(
                this,
                R.id.nav_host_fragment_content_main
        );
        NavigationUI.setupActionBarWithNavController(
                this,
                navController,
                mAppBarConfiguration
        );
        NavigationUI.setupWithNavController(navigationView, navController);

        getExtras();
        showItems();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(
                this,
                R.id.nav_host_fragment_content_main
        );

        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void getExtras() {
        Intent intent = getIntent();
        rol = intent.getStringExtra("rol");
    }

    private void showItems() {
        NavigationView navigationView = findViewById(R.id.nav_view);
        Menu menu = navigationView.getMenu();

        if (rol.compareTo("estudiante") == 0) {
            menu.findItem(R.id.nav_consultar_asignatura).setVisible(true);
            menu.findItem(R.id.nav_consultar_historia_academica).setVisible(true);
        } else if (rol.compareTo("docente") == 0) {
            MenuItem registrarCalificacionItem = menu.findItem(R.id.nav_registrar_calificacion);
            if (registrarCalificacionItem != null) {
                registrarCalificacionItem.setVisible(true);
            }
        }
    }



    public void signOff(MenuItem item) {
        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);
        finish();
    }
}