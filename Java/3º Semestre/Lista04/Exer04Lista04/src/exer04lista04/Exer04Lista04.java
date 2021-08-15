package exer04lista04;

import java.util.Scanner;

public class Exer04Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        System.out.print("Nome da Pessoa: ");   
        p.setNome(sc.nextLine());
        System.out.print("Data de Nascimento da Pessoa: ");   
        p.setDataNasc(sc.nextLine());
        System.out.print("CPF da Pessoa: ");   
        p.setCpf(sc.nextLine());
        
        System.out.println("---------Pessoa-----------");
        p.mostraPessoa();
    }
    
}
