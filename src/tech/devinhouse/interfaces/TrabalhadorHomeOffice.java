package tech.devinhouse.interfaces;


public class TrabalhadorHomeOffice implements Trabalhador {

    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via sistema!");
    }

}