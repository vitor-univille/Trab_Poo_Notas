package Main;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    Notas nota = new Notas();

    public Aluno(String nome){
        this.nome = nome;
    }

    public void addTrabalho(String nome, double nota, double peso){
        this.nota.addTrab(nome,nota,peso);
    }
    public void addProva(String nome, double nota, double peso){
        this.nota.addProva(nome,nota,peso);
    }

    public ArrayList<Trabalho> getTrabalhos(){
        return nota.getTrabalhos();
    }
    public ArrayList<Prova> getProvas(){
        return nota.getProva();
    }

    public double mediaFinal(){
        return nota.mediaNotapeso() / nota.calcPeso();
    }
}
