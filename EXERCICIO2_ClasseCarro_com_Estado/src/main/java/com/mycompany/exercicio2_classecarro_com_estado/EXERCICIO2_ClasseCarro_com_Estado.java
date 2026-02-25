package com.mycompany.exercicio2_classecarro_com_estado;

public class EXERCICIO2_ClasseCarro_com_Estado {

    public static void main(String[] args) {
       
        Carro objcarro = new Carro();
        objcarro.marca = "Toyota";
        objcarro.modelo = "Corolla";
        objcarro.ligar();
        objcarro.status();
    }
}
