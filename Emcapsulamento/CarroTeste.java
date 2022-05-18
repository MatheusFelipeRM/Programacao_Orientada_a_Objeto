package Emcapsulamento;

public class CarroTeste {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setModelo("320i");
        van.setMarca("bmw");
        van.setNumDePassageiro(5);
        van.setConsulmoDeCombustivel(50);
        van.setCapacidadeDeCombustivel(100);

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumDePassageiro());
        System.out.println(van.getConsulmoDeCombustivel());
        System.out.println(van.getCapacidadeDeCombustivel());




    }
    

}
