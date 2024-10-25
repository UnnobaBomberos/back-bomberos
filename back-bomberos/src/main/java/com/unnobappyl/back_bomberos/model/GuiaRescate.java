package com.unnobappyl.model;

import java.io.File;

public class GuiaRescate {
    private File guiaPDF;

    public File getGuiaPDF() {
        return guiaPDF;
    }

    public void setGuiaPDF(File guiaPDF) {
        this.guiaPDF = guiaPDF;
    }

    public void imprimirRutaArchivo() {
        System.out.println("Ruta del archivo PDF: " + guiaPDF.getAbsolutePath());
    }
}



   
