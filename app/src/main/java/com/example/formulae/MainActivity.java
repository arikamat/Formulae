package com.example.formulae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

import com.example.formulae.physics.ConstantAcceleration;
import com.example.formulae.physics.Displacement;
import com.example.formulae.physics.FMA;

public class MainActivity extends AppCompatActivity {


    private static Displacement displacement;
    private static ConstantAcceleration constAccel;
    private static FMA fma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
