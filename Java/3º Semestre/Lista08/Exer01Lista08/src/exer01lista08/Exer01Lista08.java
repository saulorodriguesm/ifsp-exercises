/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista08;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crie uma classe Animal
        // Crie 3 objetos do tipo Animal
        Animal a1 = new Animal("Urso", 120);
        Animal a2 = new Animal("Gato", 16);
        Animal a3 = new Animal("Peixe", 0.1);
        
        // Crie uma TreeSet de animais ordenada por peso
        TreeSet<Animal> tsp = new TreeSet<>();
        
        // Verifique se a TreeSet está vazia
        if (tsp.isEmpty()) {
            System.out.println("TreeSet Vazio");
        }else{
            System.out.println("Há item(ns) no TreeSet");
        }
        
        // Liste os itens da TreeSet
        tsp.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
        });
        
        // Adicione um animal na TreeSet
        tsp.add(a1);
        
        // Verifique se a TreeSet está vazia
        if (tsp.isEmpty()) {
            System.out.println("TreeSet Vazio");
        }else{
            System.out.println("Há item(ns) no TreeSet");
        }
        
        // Exiba a quantidade itens presentes na TreeSet
        System.out.println("Total de itens: " + tsp.size());
        
        // Liste os itens da TreeSet
        System.out.println("");
        tsp.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Crie uma ArrayList de animais
        ArrayList<Animal> listaAnimal = new ArrayList<>();   
        
        // Adicione na ArrayList dois animais diferentes do contido na TreeSet
        listaAnimal.add(a2);
        listaAnimal.add(a3);
        
        // Verifique se os itens da ArrayList estão presentes na TreeSet
        if (tsp.containsAll(listaAnimal)) {
            System.out.println("listaAnimal está presente");
        } else {
            System.out.println("listaAnimal não está presente");
        }
        
        // Adicione todos os itens da ArrayList na TreeSet
        tsp.addAll(listaAnimal);
        
        // Liste os itens da TreeSet
        System.out.println("");
        tsp.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Verifique se os itens da ArrayList estão presentes na TreeSet
        if (tsp.containsAll(listaAnimal)) {
            System.out.println("listaAnimal está presente");
        } else {
            System.out.println("listaAnimal não está presente");
        }
        
        // Exiba a quantidade itens presentes na TreeSet
        System.out.println("Total de itens: " + tsp.size());
        
        // Exiba a quantidade itens presentes na TreeSet
        tsp.remove(a1);
        
        // Liste os itens da TreeSet
        System.out.println("");
        tsp.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Remova da TreeSet todos os itens presentes na ArrayList
        tsp.removeAll(listaAnimal);
        
        // Limpe a TreeSet
        tsp.clear();
    }
    
}
