package com.example.formulae.physicsBack;

public class UniversalLawOfGravitation {
    private final double g = 6.67E-11;
    private double mass1, mass2, distance, force;

    private boolean mass1B = false;
    private boolean mass2B = false;
    private boolean distanceB = false;
    private boolean forceB = false;

    public void setMass1(double mass1) {
        this.mass1 = mass1;
        mass1B = true;
    }

    public void setMass2(double mass2) {
        this.mass2 = mass2;
        mass2B = true;
    }

    public void setDistance(double distance) {
        this.distance = distance;
        distanceB = true;
    }

    public void setForce(double force) {
        this.force = force;
        forceB = true;
    }

    public UniversalLawOfGravitation(){};

    private double getMass1() {
        return (force*distance*distance)/(g*mass2);
    }

    private double getMass2() {
        return (force*distance*distance)/(g*mass1);
    }

    private double getForce() {
        return (g*mass2*mass1)/(distance*distance);
    }

    private double getDistance() {
        return Math.sqrt((g*mass1*mass2)/(force));
    }

    private double getAccelerationOfMass1() {
        return (g*mass2)/(distance*distance);
    }

    private double getAccelerationOfMass2() {
        return (g*mass1)/(distance*distance);
    }

    public double find(String find){
        if(find.toLowerCase().equals("mass1")){
            return getMass1();
        } else if(find.toLowerCase().equals("mass2")){
            return getMass2();
        } else if (find.toLowerCase().equals("distance")) {
            return getDistance();
        } else if (find.toLowerCase().equals("force")) {
            return getForce();
        } else if (find.toLowerCase().equals("accelerationOfMass1")) {
            return getAccelerationOfMass1();
        } else
            return getAccelerationOfMass2();
    }
}
