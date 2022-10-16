package tech.devinhouse.interfaces;

import java.util.*;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Trabalhador trabalhador = new TrabalhadorPresencial();
        trabalhador.baterPonto();

        List<String> lista = new ArrayList<>();

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "tiago");

    }
}
