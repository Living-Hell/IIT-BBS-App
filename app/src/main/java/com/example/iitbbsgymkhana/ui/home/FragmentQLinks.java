package com.example.iitbbsgymkhana.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.iitbbsgymkhana.R;

public class FragmentQLinks extends Fragment {

    Button erp, hcenter, clibrary, hportal, forms, ghouse, instseminar, tservices, iitsite, ttable, scenter, endowments;

    @Nullable
    @Override


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qlinks, container, false);

        iitsite = (Button) view.findViewById(R.id.button_iitsite);
        iitsite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent siteIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/"));
                startActivity(siteIntent);
            }
        });

        erp = (Button) view.findViewById(R.id.button_erp);
        erp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent erpIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://erp.iitbbs.ac.in/"));
                startActivity(erpIntent);
            }
        });

        hcenter = (Button) view.findViewById(R.id.button_health_center);
        hcenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent hcenterIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/health-center.php"));
                startActivity(hcenterIntent);
            }
        });

        clibrary = (Button) view.findViewById(R.id.button_central_library);
        clibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clibraryIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://library.iitbbs.ac.in/"));
                startActivity(clibraryIntent);
            }
        });

        hportal = (Button) view.findViewById(R.id.button_hostel_payment);
        hportal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent hportalIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/hostel_payment.php"));
                startActivity(hportalIntent);
            }
        });

        forms = (Button) view.findViewById(R.id.button_forms);
        forms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent formsIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/download-forms.php"));
                startActivity(formsIntent);
            }
        });

        ghouse = (Button) view.findViewById(R.id.button_guesthouse);
        ghouse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ghouseIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/gh/index.php"));
                startActivity(ghouseIntent);
            }
        });

        instseminar = (Button) view.findViewById(R.id.button_inst_seminar);
        instseminar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iseminarIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/institute-seminar-series.php"));
                startActivity(iseminarIntent);
            }
        });

        tservices = (Button) view.findViewById(R.id.button_trans_services);
        tservices.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tservicesIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/transportation.php"));
                startActivity(tservicesIntent);
            }
        });

        scenter = (Button) view.findViewById(R.id.button_startupc);
        scenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startupIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/startup-centre.php"));
                startActivity(startupIntent);
            }
        });



        ttable = (Button) view.findViewById(R.id.button_timetable);
        ttable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ttableIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/time-table.php"));
                startActivity(ttableIntent);
            }
        });



        endowments = (Button) view.findViewById(R.id.button_endowments);
        endowments.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent endowmentsIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.iitbbs.ac.in/endowment-home.php"));
                startActivity(endowmentsIntent);
            }
        });



        return view;

    }
}
