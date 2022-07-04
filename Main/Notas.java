package Main;

import java.util.ArrayList;

public class Notas{
    protected ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
    protected ArrayList<Prova> prova = new ArrayList<Prova>();

    public void addTrab(String nome, double nota, double peso){
        Trabalho trab = new Trabalho(nome,nota, peso);
        trabalhos.add(trab);
    }
    public void addProva(String nome, double nota, double peso){
        Prova prov = new Prova(nome,nota, peso);
        prova.add(prov);
    }

    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public ArrayList<Prova> getProva() {
        return prova;
    }

    public double mediaNotapeso(){
        double mediat = 0;
        double mediap = 0;
        for (int i = 0; i < trabalhos.size(); i++){
            mediat += trabalhos.get(i).nota * trabalhos.get(i).peso;
        }
        for (int i = 0; i < prova.size(); i++){
            mediap += prova.get(i).nota * prova.get(i).peso;
        }
        return mediat + mediap;
    }

    public double calcPeso(){
        double mediat = 0;
        double mediap = 0;
        if (trabalhos.size() > 1){
            for (int i = 0; i < trabalhos.size() - 1; i++){
                mediat += trabalhos.get(i).peso + trabalhos.get(i+1).peso;
            }
        }else{
            mediat = trabalhos.get(0).peso;
        }
        if (prova.size() > 1){
            for (int i = 0; i < prova.size() - 1; i++){
                mediap += prova.get(i).peso + prova.get(i+1).peso;
            }
        }else{
            mediap = prova.get(0).peso;
        }

        return mediat + mediap;
    }
}
