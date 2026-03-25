package com.mycompany.testaproduto;
public class Produto {
    private String nome;
    private double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quantEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quantEmEstoque;
    }
    
    
    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantEmEstoque);
    }
    
    public void adicionarAoEstoque(int quantidade){
        quantEmEstoque += quantidade;
    }
    
    public void removerAoEstoque(int quantidade){
        quantEmEstoque -= quantidade;
    }
}
