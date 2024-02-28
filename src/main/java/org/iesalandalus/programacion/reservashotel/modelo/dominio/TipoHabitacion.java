package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public enum TipoHabitacion {

    SUITE("Suite",4),
    SIMPLE("Simple",1),
    DOBLE("Doble",2),
    TRIPLE("Triple",3);

    /**2-Creo el atributo privado de tipo String cadenaAMostrar. */

    private String cadenaAMostrar; //ambos atributos son de visibilidad privada
    private int numeroMaximoPersonas;

    /**3-Creo el constructor privado con el mismo nombre que la clase le paso por par�metros los atributos declarados.*/

    private TipoHabitacion(String cadenaAMostrar, int numeroMaximoPersonas){

        this.cadenaAMostrar=cadenaAMostrar;
        this.numeroMaximoPersonas=numeroMaximoPersonas;
    }

    /**4- Creo el m�todo p�blico getter que devuelve el n�mero m�ximo de personas que pueden alojarse en seg�n qu� tipo de habitaci�n*/
    public int getNumeroMaximoPersonas() {

        return numeroMaximoPersonas;
    }

    /**5-Creo el m�todo toString que devuelve la cadena que esperan los tests.*/

    @Override
    public String toString() {

        //return "La habitaci�n de tipo " + cadenaAMostrar + " tiene una capacidad de " + numeroMaximoPersonas + " personas.";
        return ordinal() + " .- " + cadenaAMostrar;
    }

}
