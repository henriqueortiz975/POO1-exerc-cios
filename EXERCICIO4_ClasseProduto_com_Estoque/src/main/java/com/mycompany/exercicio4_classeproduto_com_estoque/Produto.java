package com.mycompany.exercicio4_classeproduto_com_estoque;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;
    
    public void vender(int quantidade){
        System.out.println("nome do produto comrpado é: " + nome);
        System.out.println("preço do produto é: " + preco);
        System.out.println("a quantidade que possui no estoque: " + quantidadeEstoque);
        System.out.println("quantidade de produtos comprados: " + quantidade);
        if(quantidadeEstoque < quantidade){
            System.out.println("acima do estoque, por favor comprar menos");
        }else{
            System.out.println("compra realizada");
            quantidadeEstoque -= quantidade;
        }
    }
    public void repor(int quantidade){
        System.out.println("");
        quantidadeEstoque += quantidade;
        System.out.println("a quantidade de" + nome + "reposto foi: " + quantidade);
    }
    public void mostrarEstoque(){
        System.out.println("a quantidade do estoque de agora é: " + quantidadeEstoque);
        
    }
    
}
