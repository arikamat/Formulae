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
    private FMA fma = new FMA();
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
        boolean forceIsEmpty = force.getText().toString().equals("");
        boolean massIsEmpty = mass.getText().toString().equals("");
        boolean accelerationIsEmpty = acceleration.getText().toString().equals("");
        double forceDouble=1.0;
        double massDouble=1.0;
        double accelerationDouble=1.0;
        if(!forceIsEmpty){
            forceDouble = Double.parseDouble(force.getText().toString());
            fma.setForce(forceDouble);
        }
        if(!massIsEmpty){
            massDouble = Double.parseDouble(mass.getText().toString());
            fma.setMass(massDouble);
        }
        if(!accelerationIsEmpty){
            accelerationDouble = Double.parseDouble(acceleration.getText().toString());
            fma.setAcceleration(accelerationDouble);
        }

        //Start getting answer
        if(forceIsEmpty){
            force.setText(Double.toString(fma.getForce()));
        }
        if(massIsEmpty){
            mass.setText(Double.toString(fma.getMass()));
        }
        if(accelerationIsEmpty){
            acceleration.setText(Double.toString(fma.getAcceleration()));
        }

        againBtn.setVisibility(View.VISIBLE);
        againBtn.setOnClickListener(this);
    }
}
