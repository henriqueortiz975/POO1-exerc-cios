package com.mycompany.exercicio8_desafio_sistema_de_cantina;

public class ItemCantina {
   String nome;
   double preco;
   int quantidade;
   
   public void vender(int qtd){
       preco *= qtd;
       quantidade-=qtd;
       
   }
    
   public void mostrarDados(){
       System.out.println("nome do produto: " + nome);
       System.out.println("o valor da venda:" + preco);
       System.out.println("quantidade que ainda possui no estoque: " + quantidade);
   }
}
