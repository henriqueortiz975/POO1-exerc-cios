/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8_desafio_sistema_de_cantina;

/**
 *
 * @author User
 */
public class EXERCICIO8_Desafio_Sistema_de_Cantina {

    public static void main(String[] args) {
      ItemCantina objcoxinha = new ItemCantina();
      objcoxinha.nome = "coxinha";
      objcoxinha.preco = 7.50;
      objcoxinha.quantidade = 15;
      
      System.out.println("um cliente comprou 4 coxinhas");
      objcoxinha.vender(4);
      objcoxinha.mostrarDados();
      
      System.out.println("");
      
      ItemCantina objpastel = new ItemCantina();
      objpastel.nome = "pastel";
      objpastel.preco = 8;
      objpastel.quantidade = 10;
      
      System.out.println("outro cliente chegou e pediu 2 pasteis");
      objpastel.vender(2);
      objpastel.mostrarDados();

    }
}
