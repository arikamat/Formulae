package com.example.formulae.physicsFront.Physics2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.formulae.MainActivity;
import com.example.formulae.R;
import com.example.formulae.physicsBack.KineticEnergy;

public class KineticEnergyFront extends AppCompatActivity implements View.OnClickListener {
    private EditText kineticEnergy;
    private EditText mass;
    private EditText velocity;
    private KineticEnergy ke;
    private Button calculateBtn;
    private Button againBtn;
    private boolean keEmpty;
    private boolean massEmpty;
    private boolean velocityEmpty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic_energy_front);
        ke = new KineticEnergy();
        kineticEnergy = (EditText)findViewById(R.id.kineticenergyUser);
        mass = (EditText)findViewById(R.id.MassUser);
        velocity = (EditText)findViewById(R.id.velocityUser);
        calculateBtn = (Button) findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(this);
        againBtn=(Button) findViewById(R.id.Again);
        againBtn.setVisibility(View.GONE);
        againBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
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
        if(keEmpty){
            kineticEnergy.setText(Double.toString(ke.getKinetic()));
        }
        if(massEmpty){
            mass.setText(Double.toString(ke.getMass()));
        }
        if(velocityEmpty){
            velocity.setText(Double.toString(ke.getVelocity()));
        }

    }
    public void setBools(){
        keEmpty = kineticEnergy.getText().toString().equals("");
        massEmpty = mass.getText().toString().equals("");
        velocityEmpty = velocity.getText().toString().equals("");
    }
    public void setVariables(){
        if(!keEmpty){
            ke.setKinetic(Double.parseDouble(kineticEnergy.getText().toString()));
        }
        if(!massEmpty){
            ke.setMass(Double.parseDouble(mass.getText().toString()));
        }
        if(!velocityEmpty){
            ke.setVelocity(Double.parseDouble(velocity.getText().toString()));
        }

    }
}
