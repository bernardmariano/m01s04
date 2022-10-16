package tech.devinhouse.heranca;

public class Zebra extends Animal {

    int quantidadeDeListras;
    public String zebrar() {
        return "zebra";
    }
    @Override  // sobrescrita
    public String emitirSom() {
        return "zurrooooo";
    }
}