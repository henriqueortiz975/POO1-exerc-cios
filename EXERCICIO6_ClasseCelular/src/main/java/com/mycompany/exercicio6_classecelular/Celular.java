package com.mycompany.exercicio6_classecelular;

public class Celular {
    String marca;
    int bateria;
    boolean ligado;
    
    public void ligar(){
        if(bateria > 0){
            ligado = true;
        }else{
            ligado = false;
        }
    }
    
    public void desligar(){
        ligado = false;     
    }
    
    public void usarBateria(int consumo){
        bateria -= consumo;
        System.out.println("Bateria de seu celular: " + bateria + "%"); 
        
       if(bateria > 0){
           System.out.println("Seu celular esta com bateria sufiente para ser usado");
       }else{
           System.out.println("Seu celular esta com bateria insufiente para ser usado");
       }
        System.out.println("");
    }
    
    public void status(){
        System.out.println("Marca de seu celular: " + marca);
    }
}
