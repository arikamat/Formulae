package com.example.formulae.physicsFront;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.formulae.R;
import com.example.formulae.physicsFront.Physics2.ForceAccelerationFront;

public class Physics1 extends AppCompatActivity implements View.OnClickListener{
    private Button forceAccl;
    private Button freeFall;
    private Button momentum;
    private Button workEnergy;
    private Button rotationalMotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_1);
        forceAccl = (Button) findViewById(R.id.forceacceleration);
        forceAccl.setOnClickListener(this);
        freeFall = (Button)findViewById(R.id.freefall);
        freeFall.setOnClickListener(this);
        momentum = (Button)findViewById(R.id.momentum);
        momentum.setOnClickListener(this);
        workEnergy = (Button) findViewById(R.id.workenergy);
        workEnergy.setOnClickListener(this);
        rotationalMotion = (Button) findViewById(R.id.rotationalmotion);
        rotationalMotion.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.forceacceleration:
                Intent intent=new Intent(getApplicationContext(), ForceAccelerationFront.class);
                startActivityForResult(intent,0);
                break;
            case R.id.freefall:
                break;
            case R.id.momentum:
                break;
            case R.id.workenergy:
                break;
            case R.id.rotationalmotion:
                break;
        }
    }
}
