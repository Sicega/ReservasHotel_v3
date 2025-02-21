package org.iesalandalus.programacion.reservashotel.controlador;

import org.iesalandalus.programacion.reservashotel.modelo.*;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Habitacion;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Huesped;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.TipoHabitacion;
import org.iesalandalus.programacion.reservashotel.vista.*;

import javax.naming.OperationNotSupportedException;
import java.time.LocalDateTime;
import java.util.List;

public class Controlador {

    private Modelo modelo;
    private Vista vista;


    //M?TODOS CONSTRUCTOR, COMENZAR Y TERMINAR

    public Controlador(Modelo modelo, Vista vista){

        if (modelo == null || vista == null) { //Verifico que ni modelo ni vista sean nulos
            throw new IllegalArgumentException("ERROR: El modelo y la vista no pueden ser nulos.");
        }
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this); //Paso como par?metro el controlador

    }

    public void comenzar(){ //Llama a los m?todos comenzar de vista y modelo

        modelo.comenzar();
        vista.comenzar();

    }

    public void terminar(){

        modelo.terminar();
        vista.terminar();


    }

    //Metodos para gestionar huespedes

    public void insertar(Huesped huesped) throws OperationNotSupportedException {

        modelo.insertar(huesped);


    }

    public Huesped buscar (Huesped huesped){

        return modelo.buscar(huesped);
    }

    public void borrar(Huesped huesped) throws OperationNotSupportedException {

        modelo.borrar(huesped);

    }

    public List<Huesped> getHuespedes() {

        return modelo.getHuespedes();
    }

    //Metodos para gestionar habitaciones

    public void insertar(Habitacion habitacion) throws OperationNotSupportedException {

        modelo.insertar(habitacion);

    }

    public Habitacion buscar(Habitacion habitacion){

        return modelo.buscar(habitacion);
    }

    public void borrar(Habitacion habitacion) throws OperationNotSupportedException {

        modelo.borrar(habitacion);

    }

    public List<Habitacion> getHabitaciones() {
        return modelo.getHabitaciones();
    }

    public List<Habitacion> getHabitaciones(TipoHabitacion tipoHabitacion) {
        return modelo.getHabitaciones(tipoHabitacion);
    }


    //Metodos para gestionar reservas

    public void insertar(Reserva reserva) throws OperationNotSupportedException {

        modelo.insertar(reserva);

    }

    public void borrar (Reserva reserva) throws OperationNotSupportedException {

        modelo.borrar(reserva);

    }

    public Reserva buscar(Reserva reserva){

        return modelo.buscar(reserva);

    }

    public List<Reserva> getReservas() {
        return modelo.getReservas();
    }

    public List<Reserva> getReservas(Huesped huesped) {
        return modelo.getReservas(huesped);
    }

    public List<Reserva> getReservas(TipoHabitacion tipoHabitacion) {
        return modelo.getReservas(tipoHabitacion);
    }

    public List<Reserva> getReservasFuturas(Habitacion habitacion) {
        return modelo.getReservasFuturas(habitacion);
    }


    //Metodos para gestionar checkIn y checkOut

    public void realizarCheckIn(Reserva reserva, LocalDateTime fecha)  {

        modelo.realizarCheckIn(reserva, fecha);

    }

    public void realizarCheckOut(Reserva reserva, LocalDateTime fecha)  {

        modelo.realizarCheckOut(reserva, fecha);

    }

}
