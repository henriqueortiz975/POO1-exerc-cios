package com.mycompany.exercicio4_classeproduto_com_estoque;

public class EXERCICIO4_ClasseProduto_com_Estoque {

    public static void main(String[] args) {
        Produto objproduto = new Produto();
        objproduto.nome = "revista";
        objproduto.preco = 22;
        objproduto.quantidadeEstoque = 50;
        objproduto.vender(22);
        objproduto.repor(10);
        objproduto.mostrarEstoque();
        
    }
}
