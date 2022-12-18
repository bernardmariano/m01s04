package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

    public static void main(String[] args) {

        Gato garfield = new Gato("garfield", 5);
        Gato gatoDeBotas = new Gato("gato de botas", 3);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(garfield);
        gatos.add(gatoDeBotas);

        Gato garfieldFiltrado =  null;
        for(Gato gato: gatos) {
            if (gato.getNome().equals("garfield"))
                garfieldFiltrado =  gato;
        }

        List<Integer> gatos2 = gatos.stream()
                .filter(gato -> gato.getNome().equals("garfield"))
                .map(gato -> gato.getIdade())
                .collect(Collectors.toList());
    }

}
