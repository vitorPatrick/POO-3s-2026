/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculamediaponderada;
import java.util.Scanner;
/**
 *
 * @author Patrick
 */
public class CalculaMediaPonderada {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextInt();
        System.out.print("Digite o peso da primeira nota: ");
        double p1 = scanner.nextInt();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextInt();
        System.out.print("Digite o peso da segunda nota: ");
        double p2 = scanner.nextInt();
        
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextInt();
        System.out.print("Digite o peso da terceira nota: ");
        double p3 = scanner.nextInt();
        
        double mediaPonderada = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
        
        System.out.println("A media Ponderada das notas declaradas e: " + mediaPonderada);
        
        if(mediaPonderada < 5){
            System.out.println("Aluno reprovado!");
        }else if(mediaPonderada < 7){
            System.out.println("Aluno em recuperacao!");
        }else{
            System.out.println("Aluno aprovado!");
        }
    }
}
