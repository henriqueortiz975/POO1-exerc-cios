package com.mycompany.exercicio3_classe_contabancaria;

public class EXERCICIO3_Classe_ContaBancaria {

    public static void main(String[] args) {
        ContaBancaria objconta = new ContaBancaria();
        objconta.titular = "Henrique Ibarra Ortiz Urbano";
        objconta.depositar(19.45);
        objconta.sacar(14.55);
        objconta.mostrarSaldo();
    }
}
