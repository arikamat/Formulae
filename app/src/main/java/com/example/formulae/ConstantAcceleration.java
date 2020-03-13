package com.example.formulae;

import static java.lang.Double.NaN;

public class ConstantAcceleration {
    private double initVel;
    private double finVel;
    private double dis;
    private double acc;
    private double time;

    private boolean initVelB = false;
    private boolean finVelB = false;
    private boolean disB = false;
    private boolean accB = false;
    private boolean timeB = false;


    ConstantAcceleration() {

    }

    public void setInitVel(double initVel) {
        this.initVel = initVel;
        this.initVelB = true;
    }

    public void setFinVel(double finVel) {
        this.finVel = finVel;
        this.finVelB = true;
    }

    public void setDis(double dis) {
        this.dis = dis;
        this.disB = true;
    }

    public void setAcc(double acc) {
        this.acc = acc;
        this.accB = true;
    }

    public void setTime(double initTime) {
        this.time = initTime;
        this.timeB = true;
    }


    public double find(String s){
        if(s.equals("initVel")){
            return getInitVel();
        }
        return 0;
        // the others go here
    }

    private double getInitVel() {
        if (initVelB){
            return initVel;
        } else if (finVelB && accB && timeB) {
            return finVel - acc * time;
        } else if (disB && finVelB && timeB) {
            return (2*dis - finVel*time) / time;
        } else if (disB && accB && timeB) {
            return (dis - 0.5*acc*time*time)/time;
        } else if (finVelB && disB && accB) {
            return Math.sqrt(finVel*finVel - 2*acc*dis);
        } else {
            return NaN;
        }
    }
}
