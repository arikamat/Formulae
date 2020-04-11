package com.example.formulae.physicsBack;

public class PotentialEnergy {

        private double potential, mass, height;

        private boolean potentialB=false;
        private boolean massB = false;
        private boolean heightB = false;

        public void setMass(double mass){
            this.mass =mass;
            massB = true;
        }

        public void setHeight(double height){
            this.height =height;
            heightB = true;
        }

        public void setPotential(double potential){
            this.potential=potential;
            potentialB=true;
        }

        public double find(String find){
            double returnedVal;
            if(find.toLowerCase().equals("height")){
                //returnedVal=getHeight();
                //return returnedVal;
                return 0;
            }

            else if(find.toLowerCase().equals("mass")){
                returnedVal= getMass();
                return returnedVal;
            }

            else{
                returnedVal= getPotential();
                return returnedVal;
            }
        }

        public double getPotential(){
            return ( mass * 9.81 * height);
        }

        public double getMass() {
            return (potential / (9.81 * height));
        }

        public double getHeight(){
            return (potential / (9.81 * mass));
        }


    }

}
