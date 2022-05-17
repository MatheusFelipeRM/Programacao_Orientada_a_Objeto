package Metodo_Com_Parametro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.numDePassageiro = 18;
        van.capacidadeDeCombustivel = 100.0;
        van.consulmoDeCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numDePassageiro);
        System.out.println(van.capacidadeDeCombustivel);
        System.out.println(van.consulmoDeCombustivel);
        
        double qtdCombustivel = van.colcularCombustivel(50);
        System.out.println("O Tamanho do tanque do carro é: " + qtdCombustivel + " L");
    }
    

}
