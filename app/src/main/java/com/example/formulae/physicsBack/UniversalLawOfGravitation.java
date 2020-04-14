package com.example.formulae.physicsBack;

public class UniversalLawOfGravitation {
    private final double g = 6.67E-11;
    private double mass1, mass2, distance, force, accelerationOfMass1, accelerationOfMass2;

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


}
