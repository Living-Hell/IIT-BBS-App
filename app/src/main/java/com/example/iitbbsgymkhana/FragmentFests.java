package com.example.iitbbsgymkhana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class FragmentFests extends Fragment {
    Button alma, ashwa, wiss, esumm;

    public FragmentFests(){

    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fests,container,false);
        alma = view.findViewById(R.id.buttonalma);
        ashwa = view.findViewById(R.id.buttonashwa);
        esumm = view.findViewWithTag(R.id.buttonesum);
        wiss = view.findViewById(R.id.buttonwiss);

        alma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,new AlmaFragment());
                transaction.commit();

            }
        });

        ashwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,new AshwaFragment());
                transaction.commit();

            }
        });

        /*esumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,new ESummFragment());
                transaction.commit();

            }
        });*/

        wiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,new WissFragment());
                transaction.commit();

            }
        });




        return view;
    }
}