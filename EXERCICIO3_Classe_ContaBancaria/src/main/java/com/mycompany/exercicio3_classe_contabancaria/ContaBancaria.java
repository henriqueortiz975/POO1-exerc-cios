package com.mycompany.exercicio3_classe_contabancaria;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        System.out.println("a conta presente é: " + titular);
        System.out.println("o valor depositado foi: " + valor);
        saldo = valor;

    }
    
    public void sacar(double valor){
        System.out.println("o valor do saque foi: " + valor);
        if(valor > saldo){
            System.out.println("valor acima do saldo, saque invalido");
        }else{
            System.out.println("saque feito");
            saldo -= valor;
        }
        
    }
    
    public void mostrarSaldo(){
        System.out.println("o saldo total é: " + saldo);
    }
    
}
