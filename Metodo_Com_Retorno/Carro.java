package Metodo_Com_Retorno;
public class Carro{
    String marca;
    String modelo;
    int numDePassageiro;
    double capacidadeDeCombustivel;
    double consulmoDeCombustivel;
  /*
   Um metodo é uma ação que o objeto pode fazer
   OBS: uma boa pratica é sempre começar o nome do
   metodo com um verbo 
  */
    public double exibirAutonomia(){
      return capacidadeDeCombustivel * consulmoDeCombustivel;
    }
    }