package Main;

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

    public double mediaFinal(){
        return (nota.mediaNopeTrab() + nota.mediaNopeProv()) / (nota.calcPesoTrab() + nota.calcPesoProv());
    }
}
