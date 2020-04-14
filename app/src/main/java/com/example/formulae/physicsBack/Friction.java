package com.example.formulae.physicsBack;

public class Friction {
    private double  friction, mu, normalforce;


    private boolean frictionB=false;
    private boolean muB = false;
    private boolean normalforceB = false;

    public void setMu(double mu){
        this.mu =mu;
        muB = true;
    }

    public void setNormalforce(double normalforce){
        this.normalforce =normalforce;
        normalforceB = true;
    }

    public void setFriction(double friction){
        this.friction=friction;
        frictionB=true;
    }



    public double getNormalforce(){
        return (-1 *friction) / (mu);
    }

    public double getMu(){
        return (-1 *friction) / (normalforce);
    }

    public double getFriction(){
        return (-1 * mu * normalforce);
    }
}
