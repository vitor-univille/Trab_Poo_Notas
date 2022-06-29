package Main;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("al1");

        aluno1.addProva("Prov1", 6,2);
        aluno1.addProva("Prov2", 8,3);
        aluno1.addTrabalho("Trab1", 7,1);
        aluno1.addTrabalho("Trab2", 7,4);

        System.out.println(aluno1.mediaFinal());

    }
}
