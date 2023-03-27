package Calculo;

import calc.Calcular1;
import calc.calcular;

public class Raiz implements Calcular1 {

    private Integer num1;
    private Integer num2;



    @Override
    public double calc(Integer num1) {
        double rquadrada = Math.sqrt(num1);

        return rquadrada;
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
}
