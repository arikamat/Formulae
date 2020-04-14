package com.example.formulae.chemBack;

public class IdealGas {
    private double pressure, volume, mols, temp;    //assume temp is in degC
    private final double R = 0.0821;    //L*atm/(mol*K)
    private boolean pressureB, volumeB, molsB, tempB = false;

    public void setPressure (double p) {
        pressure = p;
        pressureB = true;
    }

    public void setVolume (double v) {
        volume = v;
        volumeB = true;
    }

    public void setMols (double m) {
        mols = m;
        molsB = true;
    }

    public void setTemp (double t) {
        temp = t + 273;
        tempB = true;
    }

    public double find (String find) {
        double returnedVal;
        if (find.toLowerCase().equals("pressure")) {
            returnedVal = getPressure ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("volume")) {
            returnedVal = getVolume ();
            return returnedVal;
        }
        else if (find.toLowerCase().equals("mols")) {
            returnedVal = getMols ();
            return returnedVal;
        }
        else {
            returnedVal = getTemp();
            return returnedVal;
        }
    }

    public double getPressure () {
        return mols * R * temp / volume;
    }

    public double getVolume () {
        return mols * R * temp / pressure;
    }

    public double getMols () {
        return pressure * volume / (R * temp);
    }

    public double getTemp () {
        return pressure * volume / (mols * R);
    }
}
