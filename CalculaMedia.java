/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculamedia;
import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class CalculaMedia {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira noma: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite a segunda noma: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite a terceira noma: ");
        int n3 = scanner.nextInt();
        
        int media = (n1 + n2 + n3) / 3;
        System.out.println("A media das notas apresentadas e: " + media);
        
        if(media < 5){
            System.out.println("Aluno reprovado!");
        }else if(media < 7){
            System.out.println("Aluno em recuperacao!");
        }else{
            System.out.println("Aluno aprovado!");
        }
    }
}
