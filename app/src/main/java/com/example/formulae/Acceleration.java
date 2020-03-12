package com.example.formulae;

public class Acceleration {

    private int cases;
    //if try to find a case=3
    // if try find m case =2
    // if try to find case =1
    private double velocity;
    private double time;
    private double acceleration;

    public Acceleration(double v, double t, double a, String find){
        //if(find.equals(s))
        velocity = v;
        time = t;
        acceleration=a;
        if(find.toLowerCase().equals("velocity")){
            cases=1;
        }
        else if(find.toLowerCase().equals("time")){
            cases=2;
        }
        else{
            cases=3;
        }
        /*
----------------------------------------------------------------------------------------
         */
        if(cases==1){
            //User is looking for Velocity
            velocity = time*acceleration;
        }
        else if(cases==2){
            //User is looking for Time
            time = velocity/acceleration;
        }
        else{
            //User is looking for acceleration
            acceleration = velocity/time;
        }
    }

    public double getVelocity(){
        return velocity;
    }
    public double getTime(){
        return time;
    }
    public double getAcceleration(){
        return acceleration;
    }
}


