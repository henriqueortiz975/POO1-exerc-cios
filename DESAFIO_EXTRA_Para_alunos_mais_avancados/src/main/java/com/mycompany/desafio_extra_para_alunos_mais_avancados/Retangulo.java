package com.mycompany.desafio_extra_para_alunos_mais_avancados;

public class Retangulo {
    double largura;
    double altura; 
    
    
    
    public void calcularArea(){
        System.out.println("ele possui uma largura de: "+ largura);
        System.out.println("ele tambem possui uma altura de: " + altura);
        altura *= largura;
        System.out.println("ele possui a area de: " + altura);
    }
    
    public void calcularPerimetro(){
        altura /= largura;
        altura += largura;
        altura *= 2;
        System.out.println("ele possui o perimetro de: " + altura);
    }
}
