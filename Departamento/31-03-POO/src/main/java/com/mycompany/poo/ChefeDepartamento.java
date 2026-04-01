package com.mycompany.poo;
public class ChefeDepartamento extends Funcionario{
    private String departamento;
    
    public ChefeDepartamento(String nome, int idade, double salario, String departamento){
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.print(" Departamento: " + departamento);
    }
}
