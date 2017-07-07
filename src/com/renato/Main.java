package com.renato;

//Programa modificado para el examen

public class Main {

    public static void main(String[] args) {
	// write your code here
        Televisor Televisor = new Televisor();

        Televisor.setMarca("AXN");
        Televisor.setPlano(true);
        Televisor.setPulgadas(55);

        Canal c1 = new Canal();
        c1.setNumero(2);
        c1.setTematica("Guia Televisiva");
        c1.setAdultos(false);
        Televisor.addCanal(c1);

        Canal c2 = new Canal();
        c2.setNumero(3);
        c2.setTematica("local");
        c2.setAdultos(false);
        Televisor.addCanal(c2);

        Canal c3 = new Canal();
        c3.setNumero(4);
        c3.setTematica("Dibujos Animados");
        c3.setAdultos(false);
        Televisor.addCanal(c3);

        Canal c4 = new Canal();
        c4.setNumero(5);
        c4.setTematica("Fox Series");
        c4.setAdultos(true);
        Televisor.addCanal(c4);

        Canal c5 = new Canal();
        c5.setNumero(6);
        c5.setTematica("ESPN Deportes");
        c5.setAdultos(false);
        Televisor.addCanal(c5);

        System.out.println("El canal 4: " + Televisor.verificarCanal(Televisor.getCanal(),4)
                + " No es de adultos y es de temataica \"Dibujos Animados\"");

    }
}
