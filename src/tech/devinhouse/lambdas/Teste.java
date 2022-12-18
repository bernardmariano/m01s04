package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;
import tech.devinhouse.funcionarios.Autenticavel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

//        Autenticavel aut = (nome, senha) -> nome.equals(senha);

        Gato garfield = new Gato("garfield", 5);
        Gato gatoDeBotas = new Gato("gato de botas", 3);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(garfield);
        gatos.add(gatoDeBotas);
        System.out.println("Antes de ordenar: " + gatos);

        // criei um comparador de gatos pela idade usando lambda function
        Comparator<Gato> idadeComparator = (g1, g2) -> g1.getIdade().compareTo(g2.getIdade());

        Collections.sort(gatos, idadeComparator);
        System.out.println("Depois de ordenar: " + gatos);

        gatos.stream()
                .sorted(Comparator.comparing(Gato::getNome).thenComparing(Gato::getIdade));
    }

}