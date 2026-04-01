/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author vitor.patrick
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){
    }
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void mostrarDados(){
        System.out.print("Nome : " + nome + " Idade: " + idade);
    }
}
