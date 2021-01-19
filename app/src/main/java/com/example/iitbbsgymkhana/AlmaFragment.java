package com.example.iitbbsgymkhana;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AlmaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.alma_fragment,container,false);
        ImageView alma_slideshow = view.findViewById(R.id.SshowAlma);
        AnimationDrawable animationDrawable = (AnimationDrawable) alma_slideshow.getDrawable();
        animationDrawable.start();
        return view;
    }
}
