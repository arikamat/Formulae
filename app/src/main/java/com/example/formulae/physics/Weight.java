package com.example.formulae.physics;

public class Weight {
    private double mass, weight;

    private boolean massB = false;
    private boolean weightB = false;


    public void setMass(double mass){
        this.mass =mass;
        massB = true;
    }

    public void setWeight(double weight){
        this.weight =weight;
        weightB = true;
    }


    public double find(String find){
        double returnedVal;
        if(find.toLowerCase().equals("mass")){
            returnedVal=getMass();
            return returnedVal;
        }

        else {
            returnedVal= getWeight();
            return returnedVal;
        }

    }

    public double getMass(){
        return (weight / 9.81);
    }

    public double getWeight(){
        return (9.81 * mass);
    }



}
