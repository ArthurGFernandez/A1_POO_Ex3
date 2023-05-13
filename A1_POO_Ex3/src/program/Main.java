package program;

import entitites.Studant;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float nota1, nota2, nota3;
        Studant studant = new Studant();

        try {
            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();
            studant.setNome(nome);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Digite a nota do primeiro semestre, sendo o máximo 30.");
            nota1 = sc.nextFloat();
            studant.setNota1(nota1);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.print("Digite a nota do segundo semestre, sendo o máxima 35.");
            nota2 = sc.nextFloat();
            studant.setNota2(nota2);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Digite a nota do primeiro semestre, sendo o máximo 35.");
            nota3 = sc.nextFloat();
            studant.setNota3(nota3);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println(studant.pass1());
        System.out.println(studant.pass2());
        System.out.println(studant.pass3());
    }
}