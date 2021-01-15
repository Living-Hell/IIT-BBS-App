package com.example.iitbbsgymkhana;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFests extends Fragment {
    private onAlmaButtonSelection listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fests,container,false);
        Button alma = view.findViewById(R.id.imageButtonalma);
        alma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onButtonSelection();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof onAlmaButtonSelection){

            listener = (onAlmaButtonSelection) context;

        }

    }

    public interface onAlmaButtonSelection{
        public void onButtonSelection();
    }
}