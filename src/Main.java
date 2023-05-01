import Calculo.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);
            System.out.println("calculadora automatica!");

            int num1 = 0;
            int num2 = 0;
            int alternativa = 0;
            while(alternativa != 8){
                System.out.println("Qual operação deseja realizar? Soma: 1, subtração: 2, multiplicação: 3, divisão: 4,  Logaritmo: 5, potenciacao: 6, Raiz quadrada: 7, Sair 8");
                alternativa = sc.nextInt();


                if(alternativa <= 6) {
                    System.out.println("Digite um número:");
                    num1 = sc.nextInt();
                    System.out.println("Digite outro número:");
                    num2 = sc.nextInt();

                    if (alternativa == 1) {
                        soma Soma = new soma();

                        System.out.println(" A soma dos números é: " + Soma.calc(num1, num2));

                    } else if (alternativa == 2) {

                        Subtracao subtracao = new Subtracao(num1, num2);

                        System.out.println("A subtracao dos números é: " + subtracao.calc(num1, num2));
                    } else if (alternativa == 3) {

                        Multiplicacao multiplicao = new Multiplicacao(num1, num2);

                        System.out.println("A multiplicação dos números é: " + multiplicao.calc(num1, num2));

                    } else if (alternativa == 4) {

                        Divisao divisao = new Divisao(num1, num2);

                        System.out.println("A divisao dos números é: " + divisao.calc(num1, num2));


                    } else if (alternativa == 5) {

                        Logaritmo logaritmo = new Logaritmo();
                        System.out.println("O resultado do calculo do  logaritmo é: " + logaritmo.calc(num1, num2));


                    } else if (alternativa == 6) {

                        Potenciacao potenciacao = new Potenciacao();

                        System.out.println("O calculo das potencias é: " + potenciacao.calc(num1, num2));

                    } else {
                        alternativa = 8;
                        System.out.println("Até mais!");


                    }

                }else if (alternativa == 7){
                    Raiz raiz = new Raiz();
                    System.out.println("Digite um número para calcular a raiz:");
                    num1 = sc.nextInt();

                    System.out.println("A raiz quadrada de num1 é: " + raiz.calc(num1));


                }else{
                    alternativa = 8;
                    System.out.println("Até mais!");

                }

            }

            sc.close();


        }catch (InputMismatchException e){
            System.out.println(e.getMessage());

        }

    }
}