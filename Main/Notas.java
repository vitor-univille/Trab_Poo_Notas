package Main;

import java.util.ArrayList;

public class Notas{
    private ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
    private ArrayList<Prova> prova = new ArrayList<Prova>();

    public void addTrab(String nome, double nota, double peso){
        Trabalho trab = new Trabalho(nome,nota, peso);
        trabalhos.add(trab);
    }
    public void addProva(String nome, double nota, double peso){
        Prova prov = new Prova(nome,nota, peso);
        prova.add(prov);
    }

    public double mediaNopeTrab(){
        double aux = 0;
        for (int i = 0; i < trabalhos.size(); i++){
            aux += trabalhos.get(i).nota * trabalhos.get(i).peso;
        }
        return aux;
    }
    public double mediaNopeProv(){
        double aux = 0;
        for (int i = 0; i < prova.size(); i++){
            aux += prova.get(i).nota * prova.get(i).peso;
        }
        return aux;
    }

    public double calcPesoTrab(){
        double aux = 0;
        for (int i = 0; i < trabalhos.size() - 1; i++){
            aux += trabalhos.get(i).peso + trabalhos.get(i+1).peso;
        }
        return aux;
    }

    public double calcPesoProv(){
        double aux = 0;
        for (int i = 0; i < prova.size() - 1; i++){
            aux += prova.get(i).peso + prova.get(i+1).peso;
        }
        return aux;
    }
}
