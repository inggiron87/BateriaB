package com.renato;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by alumno on 6/07/2017.
 */
public class Televisor {

    private String Marca;
    private int Pulgadas;
    private boolean Plano;
    private List<Canal> Canal;


    public Televisor() {
        Canal = new ArrayList<>();
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        Pulgadas = pulgadas;
    }

    public boolean isPlano() {
        return Plano;
    }

    public void setPlano(boolean plano) {
        this.Plano = plano;
    }

    public List<Canal> getCanal() {
        return Canal;
    }

    public void setCanal(List<Canal> canal) {
        Canal = canal;
    }

    public void addCanal(Canal c) {
        Canal.add(c);
    }

    public boolean verificarCanal(List<Canal> c, int Numero) {
        for (Canal c2:c
                ) {
            if (c2 !=null && c2.getNumero()==Numero) // El canal existe?
                if(!c2.isAdultos()) // El canal no es de Adultos
                    if(c2.getTematica().equalsIgnoreCase("DIBUJOS ANIMADOS")) // El canal tiene tematica dibujos animados
                        return true;
        }
        return false;
    }


}
