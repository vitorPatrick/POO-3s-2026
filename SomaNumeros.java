/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somanumeros;

import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello World!");
        
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();
        
        System.out.print("Digite o quarto numero: ");
        int n4 = scanner.nextInt();
        
        System.out.print("Digite o quinto numero: ");
        int soma = n1 + n2 + n3 + n4;
        System.out.println("A soma dos valores digitados e: " + soma);
    }
}
