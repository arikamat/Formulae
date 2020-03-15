package com.example.formulae;

public class FMA {
    private double  acceleration, mass, force;


    private boolean accelerationB=false;
    private boolean massB = false;
    private boolean forceB = false;


    public void setMass(double mass){
        this.mass =mass;
        massB = true;
    }

    public void setForce(double force){
        this.force =force;
        forceB = true;
    }

    public void setAcceleration(double acceleration){
        this.acceleration=acceleration;
        accelerationB=true;
    }

    public double[] find(String find){
        double[] returnedVal = new double[2];
        if(find.toLowerCase().equals("mass")){
            returnedVal[0]=getMass();
            return returnedVal;
        }

        else if(find.toLowerCase().equals("force")){
            returnedVal[0]= getForce();
            return returnedVal;
        }

        else{
            returnedVal[0]= getAcceleration();
            return returnedVal;
        }
    }


    public double getAcceleration(){
        return (force / mass);
    }

    public double getMass(){
        return (force / acceleration);
    }

    public double getForce(){
        return (acceleration * mass);
    }


}

