package com.mycompany.desafio_extra_para_alunos_mais_avancados;

public class DESAFIO_EXTRA_Para_alunos_mais_avancados {

    public static void main(String[] args) {
        Retangulo objforma1 = new Retangulo();
        System.out.println("o primeiro retangulo");
        objforma1.altura = 7;
        objforma1.largura = 10;
        objforma1.calcularArea();
        objforma1.calcularPerimetro();
        System.out.println("");
        
        Retangulo objforma2 = new Retangulo();
        System.out.println("o segundo retangulo");
        objforma2.altura = 4;
        objforma2.largura = 13;
        objforma2.calcularArea();
        objforma2.calcularPerimetro();   
        System.out.println("");
        
        Retangulo objforma3 = new Retangulo();
        System.out.println("o terceiro retangulo");
        objforma3.altura = 10;
        objforma3.largura = 34;
        objforma3.calcularArea();
        objforma3.calcularPerimetro();        

    }
}
