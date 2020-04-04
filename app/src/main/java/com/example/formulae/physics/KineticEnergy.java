package com.example.formulae.physics;

public class KineticEnergy {
    private double kinetic, mass, velocity;

    private boolean kineticB=false;
    private boolean massB = false;
    private boolean velocityB = false;

    public void setMass(double mass){
        this.mass =mass;
        massB = true;
    }

    public void setVelocity(double velocity){
        this.velocity =velocity;
        velocityB = true;
    }

    public void setKinetic(double kinetic){
        this.kinetic=kinetic;
        kineticB=true;
    }

    public double find(String find){
        double returnedVal;
        if(find.toLowerCase().equals("velocity")){
            returnedVal=getVelocity();
            return returnedVal;
        }

        else if(find.toLowerCase().equals("mass")){
            returnedVal= getMass();
            return returnedVal;
        }

        else{
            returnedVal= getKinetic();
            return returnedVal;
        }
    }

    public double getKinetic(){
        return (0.5 * mass * velocity * velocity);
    }

    public double getMass() {
        return ((2 * kinetic) / velocity * velocity);
    }

    public double getVelocity(){
        return ();
    }


}
