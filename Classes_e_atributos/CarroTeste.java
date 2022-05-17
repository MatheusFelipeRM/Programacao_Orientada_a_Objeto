package Classes_e_atributos;

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
        
        System.out.println("-------------------------------");

        Carro fusca = new Carro();
         fusca.marca = "volkswagen";
         fusca.numDePassageiro = 4;
         fusca.capacidadeDeCombustivel = 50;
         fusca.consulmoDeCombustivel = 0.1;

         System.out.println(fusca.marca);
         System.out.println(fusca.modelo);
         System.out.println(fusca.numDePassageiro);
         System.out.println(fusca.capacidadeDeCombustivel);
         System.out.println(fusca.consulmoDeCombustivel);

    }
    

}
