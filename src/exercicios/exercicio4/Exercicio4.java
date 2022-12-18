package exercicios.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        boolean idadeValida = false;
        Integer idade = null;

        while (!idadeValida){
            System.out.print("Qual é sua idade? ");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.next();
            try {
                idade = Integer.valueOf(entrada);//converte esta entrada para inteiro
                if (idade <= 0 || idade > 100) {
                    //throw new IllegalArgumentException("idade informada está fora do intervalo");
                    throw new IdadeInvalidaExceptio();
                }
                idadeValida = true;
            }catch (NumberFormatException e) {
                System.out.println("Valor informado é inválido porque nao é numérico!!");
            /*
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
             */
            } catch (IdadeInvalidaExceptio e) {
                System.out.println("idade informada está fora do intervalo");;
            }
        }


    }
}
