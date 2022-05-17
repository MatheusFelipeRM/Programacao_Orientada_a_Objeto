package Execicios;

public class ContaCorrente {
    int numero;
    double saldo;
    double limite;
    boolean status;//especia(true) ñ especial(false)


    public void saque(double valorDoSaque){
        if(valorDoSaque > saldo){
            System.out.println("Não da para sacar por que seu saldo é insuficiente");
        }else if(valorDoSaque <= saldo){
            saldo -= valorDoSaque;
            System.out.println("Seu saque foi de " + valorDoSaque);
        }else if(valorDoSaque < 1){
            System.out.println("Valor invalido digite um valor exato");
        }
    }

    public void depositar(double valorDeDeposito){
            saldo += valorDeDeposito;
            System.out.println("voce depositou " + valorDeDeposito);
    }


    public void consultar(){
        System.out.println("Seu saldo atual é de " + saldo + " R$");
    }
}
