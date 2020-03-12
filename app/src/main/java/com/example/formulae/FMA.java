package com.example.formulae;

public class FMA {
    private int cases;
    //if try to find a case=3
    // if try find m case =2
    // if try to find case =1
    private double force;
    private double mass;
    private double acceleration;

    public FMA(double f, double m, double a, String find){
        //if(find.equals(s))
        force = f;
        mass=m;
        acceleration=a;
        if(find.toLowerCase().equals("force")){
            cases=1;
        }
        else if(find.toLowerCase().equals("force")){
            cases=2;
        }
        else{
            cases=3;
        }
        /*
----------------------------------------------------------------------------------------
         */
        if(cases==1){
            //User is looking for Force
            force = mass*acceleration;
        }
        else if(cases==2){
            //User is looking for Mass
            mass = acceleration/force;
        }
        else{
            //User is looking for acceleration
            acceleration = force/mass;
        }
    }

    public double getForce(){
        return force;
    }
    public double getMass(){
        return mass;
    }
    public double getAcceleration(){
        return acceleration;
    }
}
