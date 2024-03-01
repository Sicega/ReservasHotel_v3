package org.iesalandalus.programacion.reservashotel.modelo.negocio;

import org.iesalandalus.programacion.reservashotel.modelo.dominio.Habitacion;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Huesped;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.TipoHabitacion;

import java.time.LocalDateTime;
import java.util.List;

public interface IReservas {

    List<? extends Reserva> get();
    int getTamano();
    void insertar(Reserva reserva);
    Reserva buscar(Reserva reserva);
    void borrar(Reserva reserva);
    List<? extends Reserva> getReservas(Huesped huesped);
    List<? extends Reserva> getReservas(TipoHabitacion tipoHabitacion);
    List<? extends Reserva> getReservasFuturas(Habitacion habitacion);
    void realizarCheckIn(Reserva reserva, LocalDateTime fecha);
    void realizarCheckOut(Reserva reserva, LocalDateTime fecha);

}
