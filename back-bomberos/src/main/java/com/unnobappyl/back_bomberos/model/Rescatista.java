package com.unnobappyl.model;

public class Rescatista {
    
    public Vehiculo buscarModelo (String modelo){
        return new Vehiculo();
    }

    public Vehiculo buscarModeloQr (){
        return new Vehiculo();
    }

    public GuiaRescate VerGuiaRescate (Vehiculo vehiculo){
        return vehiculo.getGuiaRescate();
    }

    /*public GuiaRescate descargarGuiaRescate (Vehiculo vehiculo){
        return vehiculo.getGuiaRescate()
    }*/


}
