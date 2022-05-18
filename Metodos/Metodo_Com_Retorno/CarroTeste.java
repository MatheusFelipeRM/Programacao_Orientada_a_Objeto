package Metodos.Metodo_Com_Retorno;

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
        
        double autonomia = van.exibirAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
    }
    

}
