package exer02lista05;

import exer02lista05.javateste.Diretor;
public class Exer01Lista05 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Gabriel", 19);
        Professor p = new Professor("Eduardo", 33);
        TecnicoAdministrativo ta = new TecnicoAdministrativo("Galhardo", 23);
        Diretor d = new Diretor("Valéria", 63);
        a.quemSou();
        p.quemSou();
        ta.quemSou();
        d.quemSou();
    }
    
}
