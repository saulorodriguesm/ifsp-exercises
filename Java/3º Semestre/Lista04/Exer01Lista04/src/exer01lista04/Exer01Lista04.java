package exer01lista04;

import java.util.Scanner;

public class Exer01Lista04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Veículo 1-----------");
        Veiculo v1 = new Veiculo();
        System.out.print("Ano do Veículo: ");   
        v1.setAno(Integer.parseInt(sc.nextLine()));
        System.out.print("Cor do Veículo: ");   
        v1.setCor(sc.nextLine());
        System.out.print("Fabricante do Veículo: ");   
        v1.setFabricante(sc.nextLine());
        System.out.print("Modelo do Veículo: ");   
        v1.setModelo(sc.nextLine());
        System.out.print("Nº Marchas do Veículo: ");   
        v1.setnMarchas(Integer.parseInt(sc.nextLine()));
        System.out.print("Nº Portas do Veículo: ");   
        v1.setnPortas(Integer.parseInt(sc.nextLine()));
        System.out.print("Nº Rodas do Veículo: ");   
        v1.setnRodas(Integer.parseInt(sc.nextLine()));
        
        System.out.println("---------Veículo 2-----------");
        Veiculo v2 = new Veiculo();
        System.out.print("Ano do Veículo: ");   
        v2.setAno(Integer.parseInt(sc.nextLine()));
        System.out.print("Cor do Veículo: ");   
        v2.setCor(sc.nextLine());
        System.out.print("Fabricante do Veículo: ");   
        v2.setFabricante(sc.nextLine());
        System.out.print("Modelo do Veículo: ");   
        v2.setModelo(sc.nextLine());
        System.out.print("Nº Marchas do Veículo: ");   
        v2.setnMarchas(Integer.parseInt(sc.nextLine()));
        System.out.print("Nº Portas do Veículo: ");   
        v2.setnPortas(Integer.parseInt(sc.nextLine()));
        System.out.print("Nº Rodas do Veículo: ");   
        v2.setnRodas(Integer.parseInt(sc.nextLine()));
        
        System.out.println("---------Veículo 1-----------");
        v1.mostraVeiculo();
        System.out.println("---------Veículo 2-----------");
        v2.mostraVeiculo();
    }
    
}
