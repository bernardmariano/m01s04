package tech.devinhouse.interfaces;

public interface Carro {

    default void acelerar() {
        System.out.println("acelerando generico");
    }

    void frear();

}
