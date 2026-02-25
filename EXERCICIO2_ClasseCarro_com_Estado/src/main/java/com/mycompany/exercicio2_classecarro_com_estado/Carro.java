package com.mycompany.exercicio2_classecarro_com_estado;

public class Carro {
    String marca;
    String modelo;
    boolean ligado;
    
    public void ligar(){
        System.out.println("a marca do carro é: " + marca);
        System.out.println("o modelo do carro é: " + modelo);
        ligado = true;
        if(ligado == true){
            System.out.println("carro ligado");
        }
    }
    public void desligar(){
        System.out.println("a marca do carro é: " + marca);
        System.out.println("o modelo do carro é: " + modelo);
        ligado = false;
        if(ligado == false){
            System.out.println("carro desligado");
        }
    }
    public void status(){
        if(ligado == true){
            System.out.println("Status: ligado");
        }else{
            System.out.println("Status: desligado");

        }
    }
    
}
