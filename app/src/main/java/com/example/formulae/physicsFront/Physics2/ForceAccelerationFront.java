package com.example.formulae.physicsFront.Physics2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.formulae.MainActivity;
import com.example.formulae.R;
import com.example.formulae.physicsBack.FMA;

public class ForceAccelerationFront extends AppCompatActivity implements View.OnClickListener {
    private EditText force;
    private EditText mass;
    private EditText acceleration;
    private String forceText = "";
    private String massText = "";
    private String accelText="";
    private Button calculateBtn;
    private Button againBtn;
    private double answer;
    private FMA fma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_acceleration_front);
        force = (EditText) findViewById(R.id.ForceUser);

        mass = (EditText) findViewById(R.id.MassUser);
        mass.setText("");
        acceleration=(EditText)findViewById(R.id.AccelerationUser);
        calculateBtn = (Button) findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(this);

        againBtn =(Button)findViewById(R.id.Again);
        againBtn.setVisibility(View.GONE);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.calculateBtn:
                calculateAnswer();
                break;
            case R.id.Again:
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(intent,0);
                break;
        }

    }
    public void calculateAnswer(){
        boolean forceIsEmpty = force.getText().toString().isEmpty();
        boolean massIsEmpty = force.getText().toString().isEmpty();
        boolean accelerationIsEmpty = force.getText().toString().isEmpty();
        if(!forceIsEmpty){
            forceText=force.getText().toString();
        }
        if(!massIsEmpty){
            massText = mass.getText().toString();
        }
        if(!accelerationIsEmpty){
            accelText = acceleration.getText().toString();
        }
        //Set stuff in the class
        if(forceIsEmpty){
            fma.setMass(Double.parseDouble(massText));
            fma.setAcceleration(Double.parseDouble(accelText));
        }
        if(massIsEmpty){
            fma.setForce(Double.parseDouble(forceText));
            fma.setAcceleration(Double.parseDouble(accelText));
        }
        if(accelerationIsEmpty){
            fma.setMass(Double.parseDouble(massText));
            fma.setForce(Double.parseDouble(forceText));
        }
        //Start getting answer
        if(forceIsEmpty){
            answer = fma.find("force");
            force.setText(Double.toString(answer));
        }
        if(massIsEmpty){
            answer = fma.find("mass");
            mass.setText(Double.toString(answer));
        }
        if(accelerationIsEmpty){
            answer = fma.find("acceleration");
            acceleration.setText(Double.toString(answer));
        }

        againBtn.setVisibility(View.VISIBLE);
        againBtn.setOnClickListener(this);
    }
}
