package tech.devinhouse.heranca;

public class Teste {

    public static void main(String[] args) {

        Zebra zebra = new Zebra();

        zebra.quantidadeDeListras = 70;
        zebra.nome = "Marvin";
        zebra.idade = 10;

        zebra.emitirSom();
        zebra.zebrar();

//        Animal animal = new Animal();

        Gato gato = new Gato();

        gato.nome = "garfield";
        gato.pelo = "branco";

    }
}