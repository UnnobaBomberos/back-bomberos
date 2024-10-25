package com.unnobappyl.back_bomberos.model;

public class Administrador {
    
    private CatalogoVehiculos catalogoVehiculos;

    public void cargarVehiculo (Vehiculo vehiculo){
        catalogoVehiculos.cargarVehiculo(vehiculo);
    }

    public void cargarGuiaRescate (Vehiculo vehiculo, GuiaRescate guia){
        vehiculo.setGuiaRescate(guia);
    }
}
