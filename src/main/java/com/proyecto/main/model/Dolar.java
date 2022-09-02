package com.proyecto.main.model;

import com.proyecto.main.api.service.PrecioDolar;

import java.io.IOException;

public class Dolar {

    static PrecioDolar precioDolar = new PrecioDolar();

    static float dolar;

    static {
        try {
            dolar = precioDolar.datosDolar().compra;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Dolar() throws IOException {
    }

    public static final float precio = dolar;
}
