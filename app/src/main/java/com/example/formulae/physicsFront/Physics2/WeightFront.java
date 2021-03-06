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

public class WeightFront extends AppCompatActivity implements View.OnClickListener {
    private EditText weight;
    private EditText mass;
    private String forceText = "";
    private String massText = "";
    private Button calculateBtn;
    private Button againBtn;
    private double answer;
    private FMA fma = new FMA();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_front);
        weight = (EditText) findViewById(R.id.WeightUser);

        mass = (EditText) findViewById(R.id.MassUser);

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
        boolean forceIsEmpty = weight.getText().toString().equals("");
        boolean massIsEmpty = mass.getText().toString().equals("");
        double forceDouble=1.0;
        double massDouble=1.0;
        double accelerationDouble=9.81;
        fma.setAcceleration(accelerationDouble);
        if(!forceIsEmpty){
            forceDouble = Double.parseDouble(weight.getText().toString());
            fma.setForce(forceDouble);
        }
        if(!massIsEmpty){
            massDouble = Double.parseDouble(mass.getText().toString());
            fma.setMass(massDouble);
        }


        //Start getting answer
        if(forceIsEmpty){
            weight.setText(Double.toString(fma.getForce()));
        }
        if(massIsEmpty){
            mass.setText(Double.toString(fma.getMass()));
        }

        againBtn.setVisibility(View.VISIBLE);
        againBtn.setOnClickListener(this);
    }
}
