package exer06lista04;

import java.util.Scanner;

public class Exer06Lista04 {

    public static void main(String[] args) {
        int i, aux;
        float valorTotal = 0;
        Scanner sc = new Scanner(System.in);
        Cardapio c = new Cardapio();
        PedidoDoCliente pc = new PedidoDoCliente();
        
        ItemDoCardapio ic1 = new ItemDoCardapio();
        ic1.nome = "Arroz";
        ic1.valor = 4.50;
        c.ListaItemCardapio.add(ic1);
        
        ItemDoCardapio ic2 = new ItemDoCardapio();
        ic2.nome = "Sorvete";
        ic2.valor = 13.50;
        c.ListaItemCardapio.add(ic2);
        
        ItemDoCardapio ic3 = new ItemDoCardapio();
        ic3.nome = "Macarrão";
        ic3.valor = 3;
        c.ListaItemCardapio.add(ic3);
        
        ItemDoCardapio ic4 = new ItemDoCardapio();
        ic4.nome = "Feijão";
        ic4.valor = 6.50;
        c.ListaItemCardapio.add(ic4);
        
        ItemDoCardapio ic5 = new ItemDoCardapio();
        ic5.nome = "Frango";
        ic5.valor = 5;
        c.ListaItemCardapio.add(ic5);
        
        do{
            i = 0;
            System.out.println("Digite a opção que você quer");
            for(ItemDoCardapio item : c.ListaItemCardapio){                
                System.out.println(i + " - " + item.nome + " - R$ " + item.valor);
                i++;
            }
            aux = Integer.parseInt(sc.nextLine());
            if(aux <= 4 && aux >= 0){
                pc.ListaItemCardapio.add(c.ListaItemCardapio.get(aux));
                valorTotal += c.ListaItemCardapio.get(aux).valor;
            }else{
                System.out.println("Opção errada");
            }
            System.out.println("Deseja continuar? 0 para continuar e -1 para sair");
            aux = Integer.parseInt(sc.nextLine());
        }while(aux != -1);       
        
        pc.ListaItemCardapio.forEach((item) -> {                
            System.out.println(item.nome + " - " + item.valor);
        });
        System.out.println("");
        System.out.println("Valor Total R$ " + valorTotal);
    }
    
}
