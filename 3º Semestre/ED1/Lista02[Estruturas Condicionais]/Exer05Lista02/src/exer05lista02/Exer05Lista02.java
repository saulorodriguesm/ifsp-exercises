/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05lista02;

import java.util.Scanner;

public class Exer05Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        String msg;
        System.out.println("Digite seu peso: ");
        peso = Double.parseDouble(sc.nextLine());
        msg = peso < 56.7 ? "Peso Mosca" : peso <= 61.2 ? "Peso Galo" : peso <= 65.8 ? "Peso Pena" : peso <= 70.3 ? "Peso Leve" : peso <= 77.6 ? "Peso Meio-médio" : peso <= 83.9 ? "Peso Médio" : peso <= 120.2 ? "Peso Pesado" : "Não permitido";
        System.out.println(msg);
    }
    
}
