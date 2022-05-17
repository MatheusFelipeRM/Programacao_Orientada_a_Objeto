package Execicios;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.saldo = 500;
        cc.saque(100);
        cc.consultar();
        cc.depositar(50);
        cc.consultar();

    }
}
