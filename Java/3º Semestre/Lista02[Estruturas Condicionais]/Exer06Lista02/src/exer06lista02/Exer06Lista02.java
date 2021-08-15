/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer06lista02;

import java.util.Scanner;

public class Exer06Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra, msg;
        System.out.println("Digite uma letra referente ao seu sexo: ");
        letra = sc.nextLine();
        msg = "F".equals(letra) ? "Feminino" : "M".equals(letra) ? "Masculino" : "Letra incorreta";
        System.out.println(msg);
    }
    
}
