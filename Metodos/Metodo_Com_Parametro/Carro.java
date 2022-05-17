package Metodo_Com_Parametro;
public class Carro{
    String marca;
    String modelo;
    int numDePassageiro;
    double capacidadeDeCombustivel;
    double consulmoDeCombustivel;
  /*
   eu so usei parametro aqui pq ele so serar usado nesse metodo
  */
    public double colcularCombustivel(double km){
      double qtdCombustivel = km/consulmoDeCombustivel;
      return qtdCombustivel;
    }
    }