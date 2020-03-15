package com.example.formulae.physics;

public class FreeFall<booelan> {

    private double initVel;
    private double finVel;
    private double time;
    private double timemaxh;
    private double maxh;

    private boolean initVelB = false;
    private boolean finVelB = false;
    private boolean timeB = false;
    private boolean timemaxhB = false;
    private boolean maxhB = false;

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

    public void setmaxh(double maxh) {
        this.maxh = maxh;
        this.maxhB = true;
    }

    public void setTimemaxh(double timemaxh) {
        this.timemaxh = timemaxh;
        this.timemaxhB = true;
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
            returnedVal=getTimemaxh();
            return returnedVal;
        }
        else{
            returnedVal= getMaxh();
            return returnedVal;
        }
    }

    public double getInitVel() {
        if (maxhB){
            return ( );
            //somone fniish above return
        }
        else if (timemaxhB){
            return (time * 9.8);
        }
    }

    public double getFinVel() {
        return (9.8 * time);
    }

    public double getTime() {
        return (finVel / 9.8);
    }

    public double getMaxh() {
        return ((initVel * initVel) / 19.6);
    }

    public double getTimemaxh() {
        return (initVel / 9.8);

    }
}
