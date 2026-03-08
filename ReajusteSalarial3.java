/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesalarial3;
import java.util.Scanner;

public class ReajusteSalarial3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salario base para calcular o reajuste : R$");
        double s1 = scanner.nextDouble();
        
        double gratificacao = s1 * 0.05;
        double imposto = (s1 + gratificacao) * 0.07;
        
        double salarioAjustado = s1 + gratificacao - imposto;
        
        System.out.printf("O salario ajustado do funcionario e: R$%.2f", salarioAjustado);
    }
}
