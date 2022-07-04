package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void TesteMediaFinal() {
        Aluno a = new Aluno("Vitor");
        a.addProva("Prov1", 6,2);
        a.addProva("Prov2", 8,3);
        a.addTrabalho("Trab1", 7,1);
        a.addTrabalho("Trab2", 7,4);
        assertEquals(7.1,a.mediaFinal());
    }

    @Test
    void addTrabalho() {
        Aluno a = new Aluno("Vitor");
        a.addTrabalho("Trab1",7,8);
        assertEquals("Trab1",a.getTrabalhos().get(0).nome);
        assertEquals(7,a.getTrabalhos().get(0).nota);
        assertEquals(8,a.getTrabalhos().get(0).peso);

    }

    @Test
    void addProva() {
        Aluno a = new Aluno("Vitor");
        a.addProva("Prova 1",4,6);
        assertEquals("Prova 1",a.getProvas().get(0).nome);
        assertEquals(4,a.getProvas().get(0).nota);
        assertEquals(6,a.getProvas().get(0).peso);
    }

}