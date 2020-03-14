package com.example.formulae;

public class Displacement {
    private double time, acceleration, velFinal, velInit, displacement;

    private boolean timeB = false;
    private boolean displacementB=false;
    private boolean accelerationB=false;
    private boolean velFinalB=false;
    private boolean velInitB=false;
    public Displacement(){ }
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
        else{
            returnedVal[0]= getAcceleration();
            return returnedVal;
        }
    }

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

    /*public double getVelInit(){
        if(displacementB)

    }*/
}
