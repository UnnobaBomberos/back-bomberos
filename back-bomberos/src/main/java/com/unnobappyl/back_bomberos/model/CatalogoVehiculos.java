package com.unnobappyl.back_bomberos.model;

import java.util.ArrayList;

public class CatalogoVehiculos {
    private ArrayList <Vehiculo> vehiculos;

    public CatalogoVehiculos (){
        vehiculos = new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void cargarVehiculo (Vehiculo vehiculo){
        vehiculos.add (vehiculo);
    }
    
}
