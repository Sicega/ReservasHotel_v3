package org.iesalandalus.programacion.reservashotel.modelo.negocio;

import org.iesalandalus.programacion.reservashotel.modelo.dominio.Habitacion;
import org.iesalandalus.programacion.reservashotel.modelo.dominio.Huesped;

import java.util.List;

public interface IHuespedes {

    List<? extends Huesped> get();
    int getTamano();
    void insertar(Huesped huesped);
    Huesped buscar(Huesped huesped);
    void borrar(Huesped huesped);
}
