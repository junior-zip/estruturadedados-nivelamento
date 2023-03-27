import Calculo.Divisao;
import Calculo.Multiplicacao;
import Calculo.Subtracao;
import Calculo.soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("calculadora automatica!");

        System.out.println("Digite um número");
         int num1 = sc.nextInt();
        System.out.println("Digite outro número");
         int num2 = sc.nextInt();

        int alternativa = 0;
        int count = 0;
        while(alternativa != 5){
            System.out.println("Qual operação deseja realizar? Soma: 1, subtração: 2, multiplicação: 3, divisão: 4 ");
            alternativa = sc.nextInt();


            if(alternativa == 1){
                soma Soma = new soma(num1, num2);

                System.out.println(" A soma dos números é: " + Soma.calc( num1, num2));

            }else if (alternativa == 2){
                Subtracao subtracao = new Subtracao(num1, num2);

                System.out.println("A subtracao dos números é: " + subtracao.calc(num1, num2 ));
            }  else if(alternativa == 3) {

                Multiplicacao multiplicao = new Multiplicacao(num1, num2);

                System.out.println("A multiplicação dos números é: " + multiplicao.calc(num1, num2));

            }else if(alternativa == 4){
                Divisao divisao = new Divisao(num1, num2);

                System.out.println("A divisao dos números é: "+ divisao.calc(num1, num2));


            }else{
                alternativa = 5;
                System.out.println("Até mais!");


            }

        }






























        sc.close();

    }
}