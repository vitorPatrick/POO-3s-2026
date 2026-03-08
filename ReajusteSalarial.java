/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesalarial;
import java.util.Scanner;
/**
 *
 * @author Patrick
 */
public class ReajusteSalarial {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salario atual: R$");
        double s1 = scanner.nextDouble();
        
        double salarioAjustado = s1 * 1.25;
        System.out.printf("O novo salario sera de R$%.2f%n", salarioAjustado);
    }
}
