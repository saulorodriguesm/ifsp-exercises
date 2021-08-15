/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04.pkg2lista02;

import java.util.Scanner;

public class Exer042Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        String msg;
        System.out.println("Digite um horário: ");
        hora = Integer.parseInt(sc.nextLine());
        msg = hora > 23 ? "Erro: Digite uma hora certa" : hora < 0 ? "Erro: Digite uma hora certa" : hora <= 5 ? "Boa Madrugada" : hora <= 11 ? "Bom dia" : hora <= 18 ? "Boa tarde" : "Boa noite";
        System.out.println(msg);
    }
    
}
