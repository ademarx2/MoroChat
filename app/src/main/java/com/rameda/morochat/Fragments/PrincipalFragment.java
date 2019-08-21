package com.rameda.morochat.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rameda.morochat.Activity.Classes.CEP;
import com.rameda.morochat.Activity.Classes.HttpService;
import com.rameda.morochat.R;

import java.util.concurrent.ExecutionException;

import static androidx.constraintlayout.widget.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {
    Button btnMainbuscarCep;
    private TextView resposta = null;


    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                View view = inflater.inflate(R.layout.fragment_principal, container, false);

         resposta = view.findViewById(R.id.etMain_resposta);
        final EditText cep = view.findViewById(R.id.etMain_cep);


        btnMainbuscarCep = view.findViewById(R.id.btnMainbuscarCep);
        btnMainbuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CEP retorno = null;
                try {
                    retorno = new HttpService(cep.getText().toString()).execute().get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    resposta.setText(retorno.toString());
                }catch (Exception e){
                    Toast.makeText(getActivity(),""+e,Toast.LENGTH_LONG).show();
                }


            }
        });




    return view;
    }

    private void buscaCep() {


    }

}
