package Main;

import java.util.ArrayList;

public class Trabalho {
    protected String nome;
    protected double nota;
    protected double peso;
    ArrayList<Integer> lista = new ArrayList<Integer>();

    public Trabalho(String nome,double nota, double peso) {
        this.nome = nome;
        this.nota = nota;
        this.peso = peso;
    }

}
