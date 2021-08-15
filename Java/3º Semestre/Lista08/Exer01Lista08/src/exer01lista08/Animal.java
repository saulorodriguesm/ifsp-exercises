/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista08;

/**
 *
 * @author GABRIEL
 */
public class Animal implements Comparable<Animal>  {
    private String Nome;
    private double Peso;
    
    public Animal(String Nome, double Peso) {
        this.Nome = Nome;
        this.Peso = Peso;
    }
    
    public String getNome() { return Nome; }

    public double getPeso() { return Peso; }

    public void setNome(String Nome) { this.Nome = Nome; }

    public void setPeso(double Peso) { this.Peso = Peso; }
    
    @Override
    public int compareTo(Animal o) {
        if(this.Peso < o.getPeso())
          return -1;
        else if(o.getPeso() < this.Peso)
              return 1;
        return 0;
    }
}
