import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int num1 = 0;

        int num2 = 0;
        System.out.println("Diite uma alternativa: adição: 1, subtração: 2 ou multiplicação: 3, divisão: 4");
        int pergunta = sc.nextInt();


        if(pergunta == 1){
            System.out.println("Primeiro numero:");
            num1 = sc.nextInt();

            System.out.println("Segundo numero:");
            num2 = sc.nextInt();

            int soma = num1 + num2;

            System.out.println("A soma de " + num1 + "+"+ num2 + "é igual a: " + soma);

        }else if (pergunta == 2) {
            System.out.println("Primeiro numero:");
            num1 = sc.nextInt();

            System.out.println("Segundo numero:");
            num2 = sc.nextInt();

            int subtracao = num1 - num2;

            System.out.println("A subtracao de " + num1 + " e "+ num2 + "é igual a: " + subtracao);

        }else if (pergunta == 3) {
            System.out.println("Primeiro numero:");
            num1 = sc.nextInt();

            System.out.println("Segundo numero:");
            num2 = sc.nextInt();

            int multiplicao = num1 * num2;

            System.out.println("A multiplicao de " + num1 + " e "+ num2 + "é igual a: " + multiplicao);

        }else if (pergunta == 4) {
            System.out.println("Primeiro numero:");
            num1 = sc.nextInt();

            System.out.println("Segundo numero:");
            num2 = sc.nextInt();

            int divisao = num1 / num2;

            System.out.println("A divisao de " + num1 + " e "+ num2 + "é igual a: " + divisao);

        }













        sc.close();

    }
}