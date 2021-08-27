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

import com.dcps.neosia.R;

public class EstudiantesFragment extends Fragment {

    private EstudiantesViewModel mViewModel;

    public static EstudiantesFragment newInstance() {
        return new EstudiantesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.estudiantes_fragment, container, false);
    }

    private void redirectToEvaluacionesFragment() {
        FragmentManager fragmentManager = getFragmentManager();

        assert fragmentManager != null;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack("xyz");
        fragmentTransaction.hide(EstudiantesFragment.this);

        EvaluacionesFragment evaluacionesFragment = new EvaluacionesFragment();
        fragmentTransaction.add(R.id.nav_host_fragment_content_main, evaluacionesFragment);

        fragmentTransaction.commit();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EstudiantesViewModel.class);
        // TODO: Use the ViewModel
    }

}