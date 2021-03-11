/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer08lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer08Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1, p2, t1, t2, le, se, notaFinal;
        System.out.println("Sua nota na P1:");    
        p1 = Double.parseDouble(sc.nextLine());
        System.out.println("Sua nota na T1:");    
        t1 = Double.parseDouble(sc.nextLine());
        System.out.println("Sua nota na LE:");    
        le = Double.parseDouble(sc.nextLine());
        System.out.println("Sua nota na P2:");    
        p2 = Double.parseDouble(sc.nextLine());
        System.out.println("Sua nota na T2:");    
        t2 = Double.parseDouble(sc.nextLine());
        System.out.println("Sua nota na SE:");    
        se = Double.parseDouble(sc.nextLine());
        notaFinal = (p1 * 0.3 + t1 * 0.15 + le * 0.05) + (p2 * 0.25 + t2 * 0.175 + se * 0.075);
        System.out.println("Sua nota final é: " + notaFinal);
    }
    
}
