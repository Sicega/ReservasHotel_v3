package org.iesalandalus.programacion.reservashotel.modelo.negocio;

import org.iesalandalus.programacion.reservashotel.modelo.dominio.Habitacion;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.TipoHabitacion;

import java.util.List;

public interface IHabitaciones {

    List<? extends Habitacion> get();
    List<? extends Habitacion> get(TipoHabitacion tipoHabitacion);
    int getTamano();
    void insertar(Habitacion habitacion);
    Habitacion buscar(Habitacion habitacion);
    void borrar (Habitacion habitacion);
}
