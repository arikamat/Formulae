package com.example.formulae.physicsBack;

public class FreeFall {

    private double initVel;
    private double finVel;
    private double time;
    private double timeMaxH;
    private double maxH;
    private double gravity =9.81;  //m/s^2


    private boolean initVelB = false;
    private boolean finVelB = false;
    private boolean timeB = false;
    private boolean timeMaxHB = false;
    private boolean maxHB = false;
    public void setInitVel(double initVel) {
        this.initVel = initVel;
        this.initVelB = true;
    }

    public void setFinVel(double finVel) {
        this.finVel = finVel;
        this.finVelB = true;
    }

    public void setTime(double time) {
        this.time = time;
        this.timeB = true;
    }

    public void setMaxH(double maxH) {
        this.maxH = maxH;
        this.maxHB = true;
    }

    public void setTimeMaxH(double timeMaxH) {
        this.timeMaxH = timeMaxH;
        this.timeMaxHB = true;
    }

    public double find(String find){
        double returnedVal;
        if(find.toLowerCase().equals("initial velocity")){
            returnedVal=getInitVel();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("time")){
            returnedVal= getTime();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("final velocity")){
            returnedVal= getFinVel();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("time to max height")){
            returnedVal= getTimeMaxH();
            return returnedVal;
        }
        else{
            returnedVal= getMaxH();
            return returnedVal;
        }
    }

    public double getInitVel() {
        double insideSqrt;
        if (maxHB){
            insideSqrt=(2*gravity* maxH);
            if(insideSqrt>=0){
                return Math.sqrt(insideSqrt);
            }
            else{
                return 0;
            }
        }
        else if (timeMaxHB){
            return (time * gravity);
        }
        else{
            return 0;
        }
    }

    public double getFinVel() {
        return (9.8 * time);
    }

    public double getTime() {
        return (finVel / 9.8);
    }

    public double getMaxH() {
        return ((initVel * initVel) / 19.6);
    }

    public double getTimeMaxH() {
        return (initVel / 9.8);

    }
}
