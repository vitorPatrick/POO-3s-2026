package com.mycompany.calculararea;
public class CalcularArea {

    public static void main(String[] args) {
        
        // Criando um retangulo
        Retangulo ret = new Retangulo(5, 10);
        System.out.println("Retangulo:");
        System.out.println("Area: " + String.format("%.2f", ret.calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", ret.calcularPerimetro()));
        
        System.out.println("-------------------------");
        
        // Criando um circulo
        Circulo circ = new Circulo(7);
        System.out.println("Circulo:");
        System.out.println("Area: " + String.format("%.2f", circ.calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", circ.calcularPerimetro()));
    }
}
