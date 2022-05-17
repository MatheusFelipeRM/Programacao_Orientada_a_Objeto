package Execicios;

import java.util.Scanner;

public class Aluno {
    Scanner tc = new Scanner(System.in);
    String nome;
    String matricula;
    String curso;
    String[] disciplina = new String[3];
    double[][] notas = new double[3][4];
    double[] media = new double[3];


    public void addDisciplina(){
        for(int i = 0; i < disciplina.length; i++){
            System.out.println("Digite o nome da primeira disciplina " + (i+1));
            disciplina[i] = tc.nextLine();
        }
    }
    public void exibirDisciplina(){
        for(int i = 0; i < disciplina.length; i++){
            System.out.println("Nome da disciplina " + (i+1) + " " + disciplina[i]);
        }
    }

    public void addNotas(){
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite as notas da disciplina de " + disciplina[i]);
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Digite a notas " + (j+1) + " " + disciplina[i]);
                notas[i][j] = tc.nextDouble();
            }
        }
    }
    public void exibirNotas(){
        for(int i = 0; i < notas.length; i++){
            System.out.println("Notas de " + disciplina[i]);
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("nota " + (j+1) + " " + notas[i][j]);
            }
        }
    }
}
