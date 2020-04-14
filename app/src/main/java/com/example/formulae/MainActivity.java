package com.example.formulae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.formulae.physicsBack.ConstantAcceleration;
import com.example.formulae.physicsBack.Kinematics;
import com.example.formulae.physicsBack.FMA;
import com.example.formulae.physicsFront.Physics1;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button physicsBtn;
    private Button chemistryBtn;
    private Button engBtn;
    private static Kinematics displacement;
    private static ConstantAcceleration constAccel;
    private FMA fma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        physicsBtn = (Button)findViewById(R.id.physicsbtn);
        physicsBtn.setOnClickListener(this);
        chemistryBtn = (Button) findViewById(R.id.chembtn);
        engBtn=(Button)findViewById(R.id.engbtn);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.physicsbtn:
                Intent intent=new Intent(getApplicationContext(), Physics1.class);
                startActivityForResult(intent,0);
                break;
            case R.id.chembtn:
                break;
            case R.id.engbtn:
                break;
        }
    }
}
