package com.example.formulae.physicsBack;

public class CoulombsLaw {
    private final double k = 8.987E+9;
    private double charge1, charge2, distance, force;

    private boolean charge1B = false;
    private boolean charge2B = false;
    private boolean distanceB = false;
    private boolean forceB = false;

    public void setMass1(double mass1) {
        this.charge1 = mass1;
        charge1B = true;
    }

    public void setMass2(double mass2) {
        this.charge2 = mass2;
        charge2B = true;
    }

    public void setDistance(double distance) {
        this.distance = distance;
        distanceB = true;
    }

    public void setForce(double force) {
        this.force = force;
        forceB = true;
    }

    public CoulombsLaw(){};

    private double getMass1() {
        return (force*distance*distance)/(k*charge2);
    }

    private double getMass2() {
        return (force*distance*distance)/(k*charge1);
    }

    private double getForce() {
        return (k*charge2*charge1)/(distance*distance);
    }

    private double getDistance() {
        return Math.sqrt((k*charge1*charge2)/(force));
    }


    public double find(String find){
        if(find.toLowerCase().equals("charge1")){
            return getMass1();
        } else if(find.toLowerCase().equals("charge2")){
            return getMass2();
        } else if (find.toLowerCase().equals("distance")) {
            return getDistance();
        } else {
            return getForce();
        }
    }
}
