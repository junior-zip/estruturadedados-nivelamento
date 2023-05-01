package EstruturaDeOrdenacao;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] vetor = new int[10];


        for(int i = 0; i < vetor.length; i++) {
            vetor[i]= (aleatorio.nextInt(10));


        }

        System.out.println("Vetor desordenado");
            System.out.println(Arrays.toString(vetor));



        int aux, j;

        for(int i = 1; i < vetor.length; i++) {

            aux = vetor[i];
            j = i - 1;

            while(j >= 0 && vetor[j] > aux){
                vetor [j + 1] = vetor[j];
                j--;

            }

            vetor[j + 1] = aux;

        }
        System.out.println("vetor ordenado");
            System.out.println(Arrays.toString(vetor));









    }
}
