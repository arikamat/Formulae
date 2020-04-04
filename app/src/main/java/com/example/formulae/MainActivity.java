package com.example.formulae;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.formulae.physics.ConstantAcceleration;
import com.example.formulae.physics.Displacement;
import com.example.formulae.physics.FMA;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button physicsBtn;
    private Button chemistryBtn;
    private Button engBtn;
    private static Displacement displacement;
    private static ConstantAcceleration constAccel;
    private static FMA fma;
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
                Intent intent=new Intent(getApplicationContext(),Physics1.class);
                startActivityForResult(intent,0);
                break;
            case R.id.chembtn:
                break;
            case R.id.engbtn:
                break;
        }
    }
}
