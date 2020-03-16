package com.example.formulae;

public class VGT {
    //Freefall --> Velocity = gravity *time
    private double velocity;
    private double time;
    private double gravity;
    private int cases;
    public VGT(double v, double t, String find){
        //Constructor for if it is on earth
        velocity=v;
        time =t;
        if(find.toLowerCase().equals("velocity")){ cases=1; }
        else{ cases=2; }
        switch(cases){
            case 1:
                velocity = gravity*time;
                break;
            case 2:
                time = velocity/gravity;
        }
    }

    public VGT(double v, double t, double g, String find){
        //Constructor for other places
        velocity=v;
        time =t;
        gravity =g;
        if(find.toLowerCase().equals("velocity")){ cases=1; }
        else{ cases=2; }
        switch(cases){
            case 1:
                velocity = gravity*time;
                break;
            case 2:
                time = velocity/gravity;
        }
    }

    public double getVelocity(){
        return velocity;
    }

    public double getTime() {
        return time;
    }

}
