package Emcapsulamento;
public class Carro{
    
    private String marca;
    private String modelo;
    private int numDePassageiro;
    private double capacidadeDeCombustivel;
    private double consulmoDeCombustivel;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumDePassageiro() {
        return numDePassageiro;
    }
    public void setNumDePassageiro(int numDePassageiro) {
        this.numDePassageiro = numDePassageiro;
    }
    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }
    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
    }
    public double getConsulmoDeCombustivel() {
        return consulmoDeCombustivel;
    }
    public void setConsulmoDeCombustivel(double consulmoDeCombustivel) {
        this.consulmoDeCombustivel = consulmoDeCombustivel;
    }

}