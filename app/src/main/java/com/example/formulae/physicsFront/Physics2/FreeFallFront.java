package com.example.formulae.physicsFront.Physics2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.formulae.MainActivity;
import com.example.formulae.R;
import com.example.formulae.physicsBack.FreeFall;

public class FreeFallFront extends AppCompatActivity implements View.OnClickListener {
    private Button calculateBtn;
    private Button againBtn;
    private EditText vFinal;
    private EditText time;
    private EditText vInit;
    private EditText maxH;
    private EditText timeMax;
    private FreeFall freeFall;
    private boolean vFinalIsEmpty, timeIsEmpty, vInitIsEmpty, maxHIsEmpty, timeMaxIsEmpty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fall_front);
        vFinal =(EditText) findViewById(R.id.VFinalUser);
        time = (EditText) findViewById(R.id.TimeUser);
        vInit = (EditText) findViewById(R.id.VInitalUser);
        maxH = (EditText) findViewById(R.id.MaxHUser);
        timeMax = (EditText) findViewById(R.id.TimeMaxHUser);
        calculateBtn = (Button) findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(this);
        againBtn = (Button) findViewById(R.id.Again);
        againBtn.setVisibility(View.GONE);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
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
        setBools();
        setVariables();

    }
    public void setVariables(){
        if(!vFinalIsEmpty){
            freeFall.setFinVel(Double.parseDouble(vFinal.getText().toString()));
        }
        if(!timeIsEmpty){
            freeFall.setTime(Double.parseDouble(vFinal.getText().toString()));
        }
        if(!vInitIsEmpty){
            freeFall.setInitVel(Double.parseDouble(vInit.getText().toString()));
        }
        if(!maxHIsEmpty){
            freeFall.setMaxH(Double.parseDouble(vInit.getText().toString()));
        }
        if(!timeMaxIsEmpty){
            freeFall.setTimeMaxH(Double.parseDouble(vInit.getText().toString()));
        }
    }
    public void setBools(){
        vFinalIsEmpty = vFinal.getText().toString().equals("");
        timeIsEmpty = time.getText().toString().equals("");
        vInitIsEmpty = vInit.getText().toString().equals("");
        maxHIsEmpty = maxH.getText().toString().equals("");
        timeMaxIsEmpty=timeMax.getText().toString().equals("");
    }
}
