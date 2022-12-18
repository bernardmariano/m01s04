package tech.devinhouse.funcionarios;

public class Teste {

    public static void main(String[] args) {

        Funcionario func = new Gerente();
        String resultado = func.baterPonto();
        System.out.println(resultado);

        Autenticavel auth = new Diretor();
        auth.autenticar("tiago", "admin");

    }

}