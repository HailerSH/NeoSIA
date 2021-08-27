package com.dcps.neosia.ui.registrar_calificacion;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.dcps.neosia.R;
import com.dcps.neosia.controller.RegistrarCalificacionController;
import com.dcps.neosia.model.pojo.Grupo;

import java.util.List;

public class GruposFragment extends Fragment {

    private GruposViewModel mViewModel;

    public static GruposFragment newInstance() {
        return new GruposFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_grupos, container, false);

        LinearLayout listadoGrupos = (LinearLayout) rootView.findViewById(R.id.listado_grupos);

        RegistrarCalificacionController registrarCalificacionController = new RegistrarCalificacionController(this);

        List<Grupo> grupos = registrarCalificacionController.getGrupos();

        for (Grupo grupo: grupos) {

            Button buttonGrupo = new Button(getActivity());

            buttonGrupo.setText(grupo.getId());
            // buttonGrupo.setId(grupo.getId());

            buttonGrupo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    redirectToEstudiantesFragment();
                }
            });
            listadoGrupos.addView(buttonGrupo);
        }

        return rootView;
    }


    private void redirectToEstudiantesFragment() {
        FragmentManager fragmentManager = getFragmentManager();

        assert fragmentManager != null;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack("xyz");
        fragmentTransaction.hide(GruposFragment.this);

        EstudiantesFragment estudiantesFragment = new EstudiantesFragment();
        fragmentTransaction.add(R.id.nav_host_fragment_content_main, estudiantesFragment);

        fragmentTransaction.commit();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GruposViewModel.class);
        // TODO: Use the ViewModel
    }
}