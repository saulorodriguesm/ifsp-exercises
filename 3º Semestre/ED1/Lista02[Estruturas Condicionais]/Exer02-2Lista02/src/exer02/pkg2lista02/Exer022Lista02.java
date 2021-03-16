/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02.pkg2lista02;

import java.util.Scanner;

public class Exer022Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());
        if(num <= 10 || num >= 20) 
            System.out.println("O número não está entre 10 e 20");
        else
            System.out.println("O número está entre 10 e 20");
    }
    
}
