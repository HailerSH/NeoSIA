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

public class EvaluacionesFragment extends Fragment {

    private EvaluacionesViewModel mViewModel;

    public static EvaluacionesFragment newInstance() {
        return new EvaluacionesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_evaluaciones, container, false);
    }

    private void redirectToRegistrarCalificacionFragment() {
        FragmentManager fragmentManager = getFragmentManager();

        assert fragmentManager != null;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack("xyz");
        fragmentTransaction.hide(EvaluacionesFragment.this);

        RegistrarCalificacionFragment registrarCalificacionFragment = new RegistrarCalificacionFragment();
        fragmentTransaction.add(R.id.nav_host_fragment_content_main, registrarCalificacionFragment);

        fragmentTransaction.commit();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EvaluacionesViewModel.class);
        // TODO: Use the ViewModel
    }
}