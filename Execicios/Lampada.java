package Execicios;

public class Lampada {
    String cor;
    int voltagen;
    String[] tipo;
    double preco;
    boolean status;

    public void acender(){
        status = true;
        System.out.println("A lampada esta " + status);
    }

    public void apagar(){
        status = false;
        System.out.println("A lampada esta " + status);
    }
}
