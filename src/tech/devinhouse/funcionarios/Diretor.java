package tech.devinhouse.funcionarios;

public class Diretor extends Funcionario implements Autenticavel {

    @Override   // sobrescreve
    public String obterCategoria() {
        return "sou diretor";
    }

    @Override
    public boolean autenticar(String nome, String senha) {
        return nome.equals("diretor") && senha.equals("1234");
    }
}
