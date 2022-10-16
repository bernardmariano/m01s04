package tech.devinhouse.heranca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Animal animal = new Tigre();

        animal.nome = "garfield";

        String som = animal.emitirSom();
        System.out.println(som);

        Animal animalTigre = new Tigre();

//        darBanho(animal);
        System.out.println( darBanho(animalTigre) );

    }

    private static String darBanho(Animal animal) {
        return animal.tomarBanho();
    }
}