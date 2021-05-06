/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista02.pkg1;

import java.util.Scanner;

public class Exer02Lista021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean num1Maior = false;
        System.out.println("Digite o primero número: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo número: ");
        num2 = Integer.parseInt(sc.nextLine());
        if(num1 > num2){
            num1Maior = true;
        }
        if(num1Maior){
            while(num1 >= num2){
                System.out.print(num1 + " ");
                num1--;
            }
        }else{
            while(num1 <= num2){
                System.out.print(num1 + " ");
                num1++;
            }
        }
    }
    
}
