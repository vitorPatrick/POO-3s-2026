/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesalarial2;
import java.util.Scanner;
/**
 *
 * @author Patrick
 */
public class ReajusteSalarial2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salario atual: R$");
        double s1 = scanner.nextDouble();
        
        System.out.print("Digite a porcentagem para o ajuste salarial: ");
        double p1 = scanner.nextDouble();
        
        double salarioAjustado = (s1 * p1 /100) + s1;
        System.out.printf("O novo salario e: R$%.2f", salarioAjustado);
    }
}
