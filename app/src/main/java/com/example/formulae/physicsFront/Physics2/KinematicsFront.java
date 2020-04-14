package com.example.formulae.physicsFront.Physics2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.formulae.MainActivity;
import com.example.formulae.R;
import com.example.formulae.physicsBack.Kinematics;

public class KinematicsFront extends AppCompatActivity implements View.OnClickListener{
    private EditText vFinal;
    private EditText vInitial;
    private EditText time;
    private EditText displacement;
    private EditText acceleration;
    private Button calculateBtn;
    private Button againBtn;
    private boolean vFinalEmpty, vInitialEmpty, timeEmpty, displacementEmpty, accelerationEmpty;
    private Kinematics kinematics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinematics);
        vFinal = (EditText) findViewById(R.id.VFinalUser);
        vInitial = (EditText) findViewById(R.id.VInitalUser);
        time = (EditText) findViewById(R.id.TimeUser);
        displacement = (EditText) findViewById(R.id.DisplacmentUser);
        acceleration = (EditText) findViewById(R.id.AccelerationUser);
        calculateBtn = (Button) findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(this);
        againBtn = (Button) findViewById(R.id.Again);
        againBtn.setVisibility(View.GONE);
        againBtn.setOnClickListener(this);
        kinematics = new Kinematics();
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.calculateBtn:
                calculateAnswer();
                againBtn.setVisibility(View.VISIBLE);
                break;
            case R.id.Again:
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(intent,0);
                break;

        }
    }
    public void calculateAnswer(){
        setBools();
        setVariables();
        if(vFinalEmpty){
            vFinal.setText(Double.toString(kinematics.getVelFinal()));
        }
        if(vInitialEmpty){
            vFinal.setText(Double.toString(kinematics.getVelInit()));
        }
        if(timeEmpty){
            String s;
            if(kinematics.getTime()[0]!= kinematics.getTime()[1]) {
                s = kinematics.getTime()[0] + ", " + kinematics.getTime()[1];
            }
            else{
                s = kinematics.getTime()[0]+"";
            }
            vFinal.setText(s);
        }
        if(displacementEmpty){
            displacement.setText(Double.toString(kinematics.getDisplacement()));
        }
        if(accelerationEmpty){
            acceleration.setText(Double.toString(kinematics.getAcceleration()));
        }
    }
    public void setBools(){
        vFinalEmpty = vFinal.getText().toString().equals("");
        vInitialEmpty = vInitial.getText().toString().equals("");
        timeEmpty = time.getText().toString().equals("");
        displacementEmpty = displacement.getText().toString().equals("");
        accelerationEmpty = acceleration.getText().toString().equals("");
    }
    public void setVariables(){
        if(!vFinalEmpty){
            kinematics.setVelFinal(Double.parseDouble(vFinal.getText().toString()));
        }
        if(!vInitialEmpty){
            kinematics.setVelInit(Double.parseDouble(vInitial.getText().toString()));
        }
        if(!timeEmpty){
            kinematics.setTime(Double.parseDouble(time.getText().toString()));
        }
        if(!displacementEmpty){
            kinematics.setDisplacement(Double.parseDouble(displacement.getText().toString()));
        }
        if(!accelerationEmpty){
            kinematics.setAcceleration(Double.parseDouble(acceleration.getText().toString()));
        }

    }
}
