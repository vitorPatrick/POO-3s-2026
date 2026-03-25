package com.mycompany.testaproduto;
public class TestaProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto("Monitor 24'",900,10);
        Produto p2 = new Produto("CPU",300,25);
        Produto p3 = new Produto("Mouse",30.5,50);
        
        //Exibir informações
        p1.exibirInformacoes();
        System.out.println("***************************");
        
        p2.exibirInformacoes();
        System.out.println("***************************");
        
        p3.exibirInformacoes();
        System.out.println("***************************");
        
        p1.adicionarAoEstoque(20);
        p2.removerAoEstoque(15);
        p3.adicionarAoEstoque(30);
        
        //Exibir informações
        p1.exibirInformacoes();
        System.out.println("***************************");
        
        p2.exibirInformacoes();
        System.out.println("***************************");
        
        p3.exibirInformacoes();
        System.out.println("***************************");
    }
}
