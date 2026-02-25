package com.mycompany.exercicio5_classealuno_com_media;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    
    public void calcularMedia(){
        System.out.println("nome do aluno: " + nome);
        System.out.println("a primeira nota do aluno: " + nota1);
        System.out.println("a segunda nota do aluno: " + nota2);
        nota1 += nota2;
        System.out.println("");
    }
    public void verificarSituacao(){
        nota1 /= 2;
        if(nota1 >= 7){
            System.out.println("Aprovado");
        }else if(nota1 >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        

    }
}
