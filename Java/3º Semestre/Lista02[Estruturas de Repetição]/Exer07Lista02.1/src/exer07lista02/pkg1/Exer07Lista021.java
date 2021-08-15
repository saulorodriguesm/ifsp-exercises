/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer07lista02.pkg1;

import java.util.Scanner;

public class Exer07Lista021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        do{
            //System.out.println("A");
            //System.out.println("B");
            //System.out.println("C");
            //System.out.println("S");
            System.out.println("Primeira");
            System.out.println("Segunda");
            System.out.println("Terceira");
            System.out.println("Sair");
            System.out.println("Digite algo: ");
            letra = sc.nextLine();
        }while(!"s".equals(letra.toLowerCase()) && !"sair".equals(letra.toLowerCase()));
    }
    
}
