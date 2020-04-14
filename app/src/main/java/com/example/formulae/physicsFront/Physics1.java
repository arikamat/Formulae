package com.example.formulae.physicsFront;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.formulae.R;
import com.example.formulae.physicsBack.Weight;
import com.example.formulae.physicsFront.Physics2.ForceAccelerationFront;
import com.example.formulae.physicsFront.Physics2.FreeFallFront;
import com.example.formulae.physicsFront.Physics2.WeightFront;

public class Physics1 extends AppCompatActivity implements View.OnClickListener{
    private Button forceAccl;
    private Button freeFall;
    private Button momentum;
    private Button workEnergy;
    private Button rotationalMotion;
    private Button weight;
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
        weight = (Button) findViewById(R.id.weight);
        weight.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.forceacceleration:
                Intent intent=new Intent(getApplicationContext(), ForceAccelerationFront.class);
                startActivityForResult(intent,0);
                break;
            case R.id.freefall:
                Intent intent1=new Intent(getApplicationContext(), FreeFallFront.class);
                startActivityForResult(intent1,0);
                break;
            case R.id.momentum:
                break;
            case R.id.workenergy:
                break;
            case R.id.weight:
                Intent intent4=new Intent(getApplicationContext(), WeightFront.class);
                startActivityForResult(intent4,0);
                break;
        }
    }
}
