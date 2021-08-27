package com.dcps.neosia.ui.consultar_asignatura;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcps.neosia.R;

public class ConsultarAsignaturaFragment extends Fragment {

    private ConsultarAsignaturaViewModel mViewModel;

    public static ConsultarAsignaturaFragment newInstance() {
        return new ConsultarAsignaturaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_consultar_asignatura, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ConsultarAsignaturaViewModel.class);
        // TODO: Use the ViewModel
    }

}