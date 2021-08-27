package com.dcps.neosia.ui.consultar_historia_academica;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcps.neosia.R;

public class ConsultarHistoriaAcademicaFragment extends Fragment {

    private ConsultarHistoriaAcademicaViewModel mViewModel;

    public static ConsultarHistoriaAcademicaFragment newInstance() {
        return new ConsultarHistoriaAcademicaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_consultar_historia_academica, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ConsultarHistoriaAcademicaViewModel.class);
        // TODO: Use the ViewModel
    }

}