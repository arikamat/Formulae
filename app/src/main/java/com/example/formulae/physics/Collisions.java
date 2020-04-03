package com.example.formulae.physics;

public class Collisions {
    private double velOb1Init, velOb1Final;
    private double velOb2Init, velOb2Final;
    private double massOb1, massOb2;


    private boolean velOb1InitB = false;
    private boolean velOb1FinalB = false;
    private boolean velOb2InitB = false;
    private boolean velOb2FinalB = false;
    private boolean massOb1B = false;
    private boolean massOb2B=false;
    private boolean elastic;
    public Collisions(){}
    public void setElastic(boolean a){
        //true for elastic
        //false for
        elastic=a;
    }
    public void setVelOb1Init(double velOb1Init) {
        this.velOb1Init = velOb1Init;
        velOb1InitB = true;
    }

    public void setVelOb1Final(double velOb1Final) {
        this.velOb1Final = velOb1Final;
        velOb1FinalB=true;
    }

    public void setVelOb2Init(double velOb2Init) {
        this.velOb2Init = velOb2Init;
        velOb2FinalB=true;
    }

    public void setVelOb2Final(double velOb2Final) {
        this.velOb2Final = velOb2Final;
        velOb2FinalB = true;
    }

    public void setMassOb1(double massOb1) {
        this.massOb1 = massOb1;
        massOb1B = true;
    }

    public void setMassOb2(double massOb2) {
        this.massOb2 = massOb2;
        massOb2B=true;
    }
    public double find(String findVar) {
        if (findVar.toLowerCase().equals("mass of object 1")) {
            return massOb1;
        } else if (findVar.toLowerCase().equals("mass of object 2")) {
            return getMassOb2();
        } else if (findVar.toLowerCase().equals("initial velocity of object 1")) {
            return getVelOb1Init();
        } else if (findVar.toLowerCase().equals("initial velocity of object 2")) {
            return getVelOb2Init();
        } else if (findVar.toLowerCase().equals("final velocity of object 1")) {
            return getVelOb1Final();
        } else if (findVar.toLowerCase().equals("final velocity of object 2")) {
            return getVelOb2Final();
        }
        else{
            return 0;
        }
    }
    public double getMassOb1() {
        return massOb1;
    }

    public double getMassOb2() {
        return massOb2;
    }

    public double getVelOb1Final() {
        return velOb1Final;
    }

    public double getVelOb1Init() {
        return velOb1Init;
    }

    public double getVelOb2Final() {
        return velOb2Final;
    }

    public double getVelOb2Init() {
        return velOb2Init;
    }
}
