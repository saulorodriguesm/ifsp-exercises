/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04lista02.pkg1;

import java.util.Scanner;

public class Exer04Lista021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, i;
        boolean num1Maior = false;
        System.out.println("Digite o primero número: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo número: ");
        num2 = Integer.parseInt(sc.nextLine());
        if(num1 > num2){
            num1Maior = true;
        }
        if(num1Maior){
            for(i = num1; i >= num2; i--){
                System.out.print(i + " ");
            }
        }else{
            for(i = num1; i <= num2; i++){
                System.out.print(i + " ");
            }
        }
    }
    
}
