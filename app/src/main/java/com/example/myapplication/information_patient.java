package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class information_patient extends AppCompatActivity {
Button save;
EditText patient_num,patient_name,doctor_name,med_date,decs_med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_patient);

save=(Button) findViewById(R.id.save) ;
patient_num =(EditText)findViewById(R.id.patient_num) ;
        patient_name =(EditText)findViewById(R.id.patient_name) ;


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Patient_num = patient_num.getText().toString();
                String Patient_name = patient_name.getText().toString();

                if (patient_num.equals("") ||patient_name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields", Toast.LENGTH_SHORT).show();
                    {
                        Toast.makeText(getApplicationContext(), "Missing Username or Password or email ",
                                Toast.LENGTH_SHORT).show();

                        patient_num .requestFocus();
                        patient_num .setError("Missing your name");
                        patient_name.requestFocus();
                        patient_name.setError("Missing your Password");
                    }
                }


                    }
        });
    }
}