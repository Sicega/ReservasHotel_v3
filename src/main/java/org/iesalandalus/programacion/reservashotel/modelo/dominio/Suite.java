package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Suite extends Habitacion{

    private static final int NUM_MAXIMO_PERSONAS=4;
    static final int MIN_NUM_BANOS=2;
    static final int MAX_NUM_BANOS=2;
    private int numBanos;
    private boolean tieneJacuzzi;

    public Suite(int planta, int puerta, double precio, int numBanos, boolean tieneJacuzzi) {
        super(planta, puerta, precio);
        setNumBanos(numBanos);
        setTieneJacuzzi(tieneJacuzzi);
    }

    public Suite(Suite habitacionSuite) {
        super(habitacionSuite);
        setNumBanos(habitacionSuite.getNumBanos());
        setTieneJacuzzi(habitacionSuite.isTieneJacuzzi());
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        if(numBanos<MIN_NUM_BANOS || numBanos >MAX_NUM_BANOS){
            throw new IllegalArgumentException("El n�mero de ba�os no es correcto para la habitaci�n Suite");
        }
        this.numBanos = numBanos;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    @Override
    public int getNumeroMaximoPersonas() {
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return String.format("%s, habitaci�n suite, capacidad=%d personas, ba�os=%d, %s",
                super.toString(), getNumeroMaximoPersonas(), numBanos, tieneJacuzzi ? "con Jacuzzi" : "sin Jacuzzi");
    }
}
