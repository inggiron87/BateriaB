package com.renato;

/**
 * Created by alumno on 6/07/2017.
 */
public class Canal {
    private int Numero;
    private String Tematica;
    private boolean Adultos;

    public Canal() {
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getTematica() {
        return Tematica;
    }

    public void setTematica(String tematica) {
        Tematica = tematica;
    }

    public boolean isAdultos() {
        return Adultos;
    }

    public void setAdultos(boolean adultos) {
        Adultos = adultos;
    }
}
