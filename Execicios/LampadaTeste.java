package Execicios;

public class LampadaTeste {
   public static void main(String[] args) {
       Lampada l = new Lampada();
       
       l.tipo = new String[5];
       l.tipo[0] = "Abaju";
       l.tipo[1] = "Lampeão";
       l.cor = "Branca";
       l.preco = 30.5;
       l.voltagen = 220;
       l.acender();
       l.apagar();




   } 
}
