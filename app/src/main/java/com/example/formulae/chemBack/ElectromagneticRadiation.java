package com.example.formulae.chemBack;

public class ElectromagneticRadiation {
    private double wavlen, freq, energy;
    private double mass, velocity;
    private int initLevel, finLevel;    //set finLevel to 0 if electron is removed
    private String emissionOrAbsorbption;
    private final double C = 3.00e8;
    private final double H = 6.626e-34;
    private final double Bohr = 2.178e-18;

    private boolean wavelenB, freqB, energyB = false;
    private boolean massB, velocityB = false;
    private boolean initLevelB, finLevelB, emssionOrAbsorptionB = false;

    public void setWavlen (double w) {
        this.wavlen = w;
        wavelenB = true;
    }
    public void setFreq(double freq) {
        this.freq = freq;
        freqB = true;
    }
    public void setEnergy(double energy) {
        this.energy = energy;
        energyB = true;
    }
    public void setMass(double mass) {
        this.mass = mass;
        massB = true;
    }
    public void setVelocity(double velocity) {
        this.velocity = velocity;
        velocityB = true;
    }
    public void setInitLevel(int initLevel) {
        this.initLevel = initLevel;
        initLevelB = true;
    }
    public void setFinLevel(int finLevel) {
        this.finLevel = finLevel;
        finLevelB = true;
    }
    public void setEmissionOrAbsorbption (String s) {
        this.emissionOrAbsorbption = s;
        emssionOrAbsorptionB = true;
    }


    public double find (String find) {
        double returnedVal;
        if (find.toLowerCase().equals("wavelength")) {
            returnedVal = getWavelen ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("frequency")) {
            returnedVal = getFreq ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("wavelength of particle")) {
            returnedVal = getWavlenOfParticle ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("energy of electron")) {
            returnedVal = getEnergyOfElectron ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("initial energy level")) {
            returnedVal = getInitLevel (emissionOrAbsorbption);
            return returnedVal;
        }
        else if (find.toLowerCase().equals("final energy level")) {
            returnedVal = getFinLevel (emissionOrAbsorbption);
            return returnedVal;
        }
        else {
            returnedVal = getEnergy ();
            return returnedVal;
        }
    }

    public double getWavelen () {
        return C / freq;
    }

    public double getFreq () {
        return C / wavlen;
    }


    public double getEnergy () {
        if (freqB) {
            return freq * H;
        }
        else {
            return H * C / wavlen;
        }
    }

    public double getWavlenOfParticle () {
        return H / (mass * velocity);
    }

    public double getEnergyOfElectron () {
        double e;
        if (finLevel == 0)
            e = -1 * Bohr * (0 - (1.0 / initLevel * initLevel));
        else e = Bohr * ((1.0 / (finLevel * finLevel)) - (1.0 / (initLevel * initLevel)));
        //positive e -> absorption of energy
        //negative e -> emission of energy
        return e;
    }

    public double getInitLevel (String s) {
        double e;
        //check for emission or absorption of energy
        if (s.toLowerCase().equals("emission"))
            e = Math.pow ((1.0 / (1.0 / (finLevel * finLevel) - energy / Bohr)), 0.5);
        else
            e = Math.pow ((1.0 / (1.0 / (finLevel * finLevel) + energy / Bohr)), 0.5);

        return Math.round (e);
    }

    public double getFinLevel (String s) {
        double e;
        //check for emission or absorption
        if (s.toLowerCase().equals("emission"))
            e = Math.pow ((1.0 / (1.0 / (initLevel * initLevel) - energy / Bohr)), 0.5);
        else
            e = Math.pow ((1.0 / (1.0 / (initLevel * initLevel) + energy / Bohr)), 0.5);

        return Math.round (e);
    }
}
