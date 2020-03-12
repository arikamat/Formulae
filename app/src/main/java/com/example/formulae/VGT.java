package com.example.formulae;

public class VGT {
    //Freefall --> Velocity = gravity *time
    private double velocity;
    private double time;
    private final double gravity=9.81;
    private int cases;
    public VGT(double v, double t, String find){
        if(find.toLowerCase().equals("velocity")){
            cases=1;
        }
        else if(find.toLowerCase().equals("time")){
            cases=2;
        }
        else{
            cases=3;
        }
        velocity=v;
        time=t;
    }
    public double getVelocity(){
        return gravity*time;
    }

    public double getTime() {
        return velocity/gravity;
    }

}
