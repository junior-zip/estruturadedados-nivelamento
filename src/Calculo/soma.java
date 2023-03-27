package Calculo;

import calc.calcular;

public class soma implements calcular {
    private Integer num1;
    private Integer num2;

    private Integer pergunta;


    public soma(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    @Override
    public double calc(Integer num1, Integer num2) {
        int soma = num1 + num2;


        return soma;


    }




}
