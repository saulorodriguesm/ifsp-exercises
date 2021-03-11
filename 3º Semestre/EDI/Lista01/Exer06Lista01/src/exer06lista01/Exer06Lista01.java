/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer06lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer06Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, raio, volume;
        System.out.println("Altura de um Cilindro Circular:");    
        altura = Double.parseDouble(sc.nextLine());
        System.out.println("Raio de um Cilindro Circular:");    
        raio = Double.parseDouble(sc.nextLine());
        volume = 3.14 * raio * raio * altura;
        System.out.println("O volume de um Cilindro Circular é: " + volume);
    }
    
}
