package tech.devinhouse.calculadora;

import java.util.Scanner;

public class Principal_old {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a operação que deseja realizar: ");
        System.out.println("A - adição / S - subtração / M - multiplicação / D - divisão");
        String opcao = scanner.next();
        System.out.print("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();
        opcao = opcao.toUpperCase();  // transformando em maiusculo

        Operacao operacao = obterOperacaoDesejada(opcao);
        double resultado = operacao.calcular(valor1, valor2);
        System.out.printf("O resultado é %.2f", resultado);
        System.out.println();
        System.out.println("Descricao: " + operacao.getDescricao());
    }

    private static Operacao obterOperacaoDesejada(String opcao) {
        Operacao operacao;
        switch (opcao) {
            case "A":
                operacao = new Adicao();
                break;
            case "S":
                operacao = new Subtracao();
                break;
            case "M":
                operacao = new Multiplicacao();
                break;
            case "D":
                operacao = new Divisao();
                break;
            default:
                operacao = null;
        }
        return operacao;
    }

}

