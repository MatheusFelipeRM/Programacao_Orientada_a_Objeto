package Projeto_Do_Banco_IFRN;

public class Conta {
    
    private String numDaConta;
    private String tipoDaConta;
    private int senha;
    private double saldo;

    public String getNumDaConta() {
        return numDaConta;
    }
    public void setNumDaConta(String numDaConta) {
        this.numDaConta = numDaConta;
    }
    public String getTipoDaConta() {
        return tipoDaConta;
    }
    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double v){
        saldo=-v;
        return saldo;
    }

}
