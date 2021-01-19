package com.example.iitbbsgymkhana;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WissFragment extends Fragment {

    TextView textView;
    String para = "Wissenaire, the annual techno-management fest of IIT Bhubaneswar is one of the biggest of its kind in East India. Encompassing various sectors of technology, science and management this three-day extravaganza is maneuvers it's participants through the world of futuristic technologies. Every year Wissenaire comes up with a theme and in 2019 Wissenaire has got some unique ideas in store for you with the theme Cosmic Expeditions: Astounding Odysseys Ensuring Humanity's Existence.\n" +
            "\n" +
            "\n" +
            "And here we are in the 21st century!Today, humanity has the potential to seek answers to the most fundamental questions posed about the existence of life beyond Earth. Telescopes have found planets around other stars. Robotic probes have identifiedpotential resources on the Moon, and evidence of water -- a key ingredient for life -- has been found on Marsand the moons of Jupiter. Going to the past, July 20th, 2019 was the 50th anniversary of Apollo 11’s historic flight to the moon, where astronauts Neil Armstrong and Buzz Aldrin became the first human beings to walk on the moon. 50 years ago, space flight inspired such awe that astronauts were hailed as heroes and celebrities by men, women, and children alike. 50 years later, the exploration still going on strong and with a full swing, there's no looking back. Because in the end, \"Somewhere, something incredible is waiting to be known.\"";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wiss, container, false);
        ImageView alma_slideshow = view.findViewById(R.id.SshowWiss);
        AnimationDrawable animationDrawable = (AnimationDrawable) alma_slideshow.getDrawable();
        animationDrawable.start();
        textView = view.findViewById(R.id.textView37);
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());

        return view;
    }
}
