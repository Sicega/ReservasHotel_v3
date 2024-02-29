package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Doble extends Habitacion{

    private int NUM_MAXIMO_PERSONAS=2; // Al ser habitacion doble el nº máx. personas es 2
    int MIN_NUM_CAMAS_INDIVIDUALES=2; // Modificador por defecto package
    int MAX_NUM_CAMAS_INDIVIDUALES=2;
    int MIN_NUM_CAMAS_DOBLES=1;
    int MAX_NUM_CAMAS_DOBLES=1;
    private int numCamasIndividuales;
    private int numCamasDobles;

    public Doble(int planta, int puerta, double precio, int numCamasIndividuales, int numCamasDobles) {
        super(planta, puerta, precio);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
    }

    public Doble(Doble habitacionDoble) {
        super(habitacionDoble);
    }

    public int getNumCamasIndividuales() {

        return numCamasIndividuales;
    }

    public void setNumCamasIndividuales(int numCamasIndividuales) {

       validaNumCamas(); // Valida el número de camas individuales antes de asignarlo, hago igual para el de camas dobles
        this.numCamasIndividuales = numCamasIndividuales;
    }

    public int getNumCamasDobles() {

        return numCamasDobles;
    }

    public void setNumCamasDobles(int numCamasDobles) {

        validaNumCamas();
        this.numCamasDobles = numCamasDobles;
    }

    private void validaNumCamas(){ // Hago uso de las constantes para establecer el número obligatorio de camas individuales y dobles

        if (getNumCamasIndividuales() < MIN_NUM_CAMAS_INDIVIDUALES || getNumCamasIndividuales() > MAX_NUM_CAMAS_INDIVIDUALES) {
            throw new IllegalArgumentException("ERROR: El número de camas individuales debe ser 2.");
        }

        if (getNumCamasDobles() < MIN_NUM_CAMAS_DOBLES || getNumCamasDobles() > MAX_NUM_CAMAS_DOBLES) {
            throw new IllegalArgumentException("ERROR: El número de camas dobles debe ser 1.");
        }

    }

    @Override
    public int getNumeroMaximoPersonas() { // Implemento el método que debe tener por herencia y devuelve el num. máx de personas
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return String.format("%s, habitación doble, capacidad=%d personas, camas individuales=%d, camas dobles=%d",
                super.toString(), getNumeroMaximoPersonas(), getNumCamasIndividuales(), getNumCamasDobles());
    }
}
