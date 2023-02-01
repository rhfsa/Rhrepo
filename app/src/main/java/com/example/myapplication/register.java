package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
Button login;
EditText pass,un;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login =(Button) findViewById(R.id.login) ;
        pass=(EditText)  findViewById(R.id.pass) ;
        un=(EditText)  findViewById(R.id.un) ;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               startActivity(new Intent(getApplicationContext(),(information_patient.class)));


            }
        });

    }


}