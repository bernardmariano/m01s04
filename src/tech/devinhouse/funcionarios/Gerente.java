package tech.devinhouse.funcionarios;

public class Gerente extends Funcionario implements Autenticavel {


    @Override
    public String obterCategoria() {
        return null;
    }

    @Override
    public boolean autenticar(String nome, String senha) {
        return false;
    }
}