/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer05Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento, diferencaAnos, diferencaMeses, diferencaDias, diferencaMinutos, diferencaSegundos;
        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = Integer.parseInt(sc.nextLine());
        diferencaAnos = 2020 - anoNascimento;
        diferencaMeses = diferencaAnos * 12;
        diferencaDias = diferencaMeses * 30;
        diferencaMinutos = diferencaDias * 60 * 24;
        diferencaSegundos = diferencaMinutos * 60;
        System.out.println("Já viveu " + diferencaAnos + " anos, ou " + diferencaMeses + " meses, ou " + diferencaDias + " dias, ou " + diferencaMinutos + " minutos, ou " + diferencaSegundos + " segundos");        
    }
    
}
