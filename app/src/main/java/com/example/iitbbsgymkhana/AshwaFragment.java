package com.example.iitbbsgymkhana;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AshwaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ashwa,container,false);
        ImageView alma_slideshow = view.findViewById(R.id.SshowAshwa);
        AnimationDrawable animationDrawable = (AnimationDrawable) alma_slideshow.getDrawable();
        animationDrawable.start();
        return view;
    }
}