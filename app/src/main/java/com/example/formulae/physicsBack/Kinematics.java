package com.example.formulae.physicsBack;

public class Kinematics {
    private double time, acceleration, velFinal, velInit, displacement;

    private boolean timeB = false;
    private boolean displacementB=false;
    private boolean accelerationB=false;
    private boolean velFinalB=false;
    private boolean velInitB=false;
    public Kinematics(){ }
    public void setTime(double time){
        this.time =time;
        timeB = true;
    }
    public void setAcceleration(double acceleration){
        this.acceleration=acceleration;
        accelerationB=true;
    }
    public void setVelInit(double velInit){
        this.velInit=velInit;
        velInitB=true;
    }
    public void setVelFinal(double velFinal){
        this.velFinal=velFinal;
    }
    public void setDisplacement(double displacement){
        this.displacement=displacement;
        displacementB=true;
    }
    public double[] find(String find){
        double[] returnedVal = new double[2];
        if(find.toLowerCase().equals("initial velocity")){
            returnedVal[0]=getVelInit();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("time")){
            returnedVal= getTime();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("final velocity")){
            returnedVal[0]= getVelInit();
            return returnedVal;
        }
        else if(find.toLowerCase().equals("displacement")){
            returnedVal[0]=getDisplacement();
            return returnedVal;
        }
        else{
            returnedVal[0]= getAcceleration();
            return returnedVal;
        }
    }
        //We need to make getTime() better. returning an array is kind of pointless.
    public double[] getTime() {
        double[] answer = new double[2];
        double insideSqrt;
        double negVelInit;
        if (velFinalB && velInitB && displacementB) {
            answer[0] = ((2 * displacement) / (velFinal + velInit));
            return answer;
        }
        else {
            if (accelerationB && velInitB && displacementB) {
                insideSqrt = Math.pow(velInit, 2) + (2 * acceleration * displacement);
                negVelInit = -1 * velInit;
                if (insideSqrt >= 0) {
                    answer[0] = (negVelInit + insideSqrt) / acceleration;
                    answer[1] = (negVelInit - insideSqrt) / acceleration;
                } else {
                    answer[0] = 0;
                    answer[1] = 0;
                }
                return answer;
            }
            answer[0]=0;
            answer[1]=0;
            return answer;
        }
    }

    public double getVelInit(){
        //if(displacementB)
        if(velFinalB&&timeB&&displacementB){
            return ((2*displacement)/time)-velFinal;
        }
        else if(displacementB&&timeB&&accelerationB){
            return (2*displacement)-(acceleration*Math.pow(time,2))/(2*time);

        }
        else{
            if(displacementB&&velFinalB&&accelerationB){
                double insideSqrt= (Math.pow(velFinal,2)-(2*acceleration*displacement));
                if(insideSqrt>=0){
                    return Math.sqrt(insideSqrt);
                }
                else{
                    return 0;
                }
            }
            return 0;
        }

    }
    public double getAcceleration(){
        return 0;
    }
    public double getDisplacement(){
        if(velFinalB&&velInitB&&timeB){
            return ((velFinal+velInit)*time)/2;
        }
        else if(velInitB&&timeB&&accelerationB){
            return ((velInit*time)+((acceleration*Math.pow(time,2))/2));
        }
        else if(velFinalB&&velInitB&&accelerationB){
            return (Math.pow(velFinal,2)-Math.pow(velInit,2))/(2*acceleration);
        }
        else{
            return 0;
        }
    }
    public double getVelFinal(){
        if(displacementB&&velInitB&&timeB){
            return ((2*displacement)/time)-velInit;
        }
        else if(displacementB&&velInitB&&accelerationB){
            double insideSqrt = (2*acceleration*displacement)+Math.pow(velInit,2);
            if(insideSqrt>=0){
                return Math.sqrt(insideSqrt);
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
