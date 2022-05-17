package Palavra_Chave_this;
public class Carro{
    //Atributos = caracteristicas do objeto
    String marca;
    String modelo;
    int numDePassageiro;
    double capacidadeDeCombustivel;
    double consulmoDeCombustivel;
  /*
    O construtor serve para quando o programa inicializar ele execultar algo ja pre definido
    e ele recebe parametro
    OBS: quando inicializar array ou matrizes inicialize no construtor 
    
    */
    public Carro(String marca){
      System.out.println("O programa inicializou");
      marca = marca;
    }
    
    }