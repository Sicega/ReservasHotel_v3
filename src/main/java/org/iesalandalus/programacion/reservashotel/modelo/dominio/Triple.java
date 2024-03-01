package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Triple extends Habitacion{

    private static final int NUM_MAXIMO_PERSONAS=3;
    static final int MIN_NUM_BANOS=1; // Añado el nº mínimo y máximo de baños para la habitación triple
    static final int MAX_NUM_BANOS=2;
    static final int MIN_NUM_CAMAS_INDIVIDUALES=2; // Establezco el nº de camas individuales y dobles según el enunciado
    static final int MAX_NUM_CAMAS_INDIVIDUALES=3;
    static final int MIN_NUM_CAMAS_DOBLES=1;
    static final int MAX_NUM_CAMAS_DOBLES=1;
    private int numBanos;
    private int numCamasIndividuales;
    private int numCamasDobles;


    public Triple(int planta, int puerta, double precio, int numBanos, int numCamasIndividuales, int numCamasDobles) {
        super(planta, puerta, precio);
        setNumBanos(numBanos);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
    }

    public Triple(Triple habitacionTriple) {
        super(habitacionTriple);
        setNumBanos(habitacionTriple.getNumBanos());
        setNumCamasIndividuales(habitacionTriple.getNumCamasIndividuales());
        setNumCamasDobles(habitacionTriple.getNumCamasDobles());
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) { //Valido que el número de baños sea el esperado
        if(numBanos<MIN_NUM_BANOS || numBanos>MAX_NUM_BANOS){
            throw new IllegalArgumentException("El número de baños no es correcto para la habitación triple.");
        }
        this.numBanos = numBanos;
    }

    public int getNumCamasIndividuales() {
        return numCamasIndividuales;
    }

    public void setNumCamasIndividuales(int numCamasIndividuales) {

        this.numCamasIndividuales = numCamasIndividuales;
        validaNumCamas();
    }

    public int getNumCamasDobles() {
        return numCamasDobles;
    }

    public void setNumCamasDobles(int numCamasDobles) {

        this.numCamasDobles = numCamasDobles;
        validaNumCamas();
    }

    private void validaNumCamas(){ // Valido el número de camas para la habitación triple
        if (getNumCamasIndividuales() < MIN_NUM_CAMAS_INDIVIDUALES || getNumCamasIndividuales() > MAX_NUM_CAMAS_INDIVIDUALES) {
            throw new IllegalArgumentException("ERROR: El número de camas individuales no es correcto.");
        }

        if (getNumCamasDobles() < MIN_NUM_CAMAS_DOBLES || getNumCamasDobles() > MAX_NUM_CAMAS_DOBLES) {
            throw new IllegalArgumentException("ERROR: El número de camas dobles debe ser 1.");
        }
    }

    @Override
    public int getNumeroMaximoPersonas() { // Devuelvo la constante del número máximo de personas en el método heredado
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() { // Devuelvo la cadena esperada por los tests
        return String.format("%s, habitación triple, capacidad=%d personas, baños=%d, camas individuales=%d, camas dobles=%d",
                super.toString(), getNumeroMaximoPersonas(), getNumBanos(), getNumCamasIndividuales(), getNumCamasDobles());
    }
}
