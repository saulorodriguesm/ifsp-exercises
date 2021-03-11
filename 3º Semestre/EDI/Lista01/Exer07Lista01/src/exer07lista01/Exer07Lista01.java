/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer07lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer07Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, base, perimetro, area;
        System.out.println("Altura do terrero em metros:");    
        altura = Double.parseDouble(sc.nextLine());
        System.out.println("Base do terrero em metros:");    
        base = Double.parseDouble(sc.nextLine());  
        perimetro = altura * 2 + base * 2;
        area = altura * base;
        System.out.println("O perímetro do terreno é: " + perimetro + " metros");
        System.out.println("A área do terreno é: " + area + " metros");
    }
    
}
