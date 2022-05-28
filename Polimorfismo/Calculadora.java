package Polimorfismo;

public class Calculadora {







    public String soma(int num1, int num2){
        return"o resultado: "+(num1+num2);
    }
    //repare que eu mudei a assinatura pois os parametro ou almetou ou mudou de tipo
    public String soma(double num1, double num2){
        return"o resultado: "+(num1+num2);
    }

}
