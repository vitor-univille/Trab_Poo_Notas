package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotasTest {

    @Test
    void mediaNotapeso() {
        Notas n = new Notas();
        n.addTrab("t",10,5);
        n.addProva("p",5,5);
        assertEquals(75,n.mediaNotapeso());
    }

    @Test
    void calcPeso() {
        Notas n = new Notas();
        n.addTrab("t",10,5);
        n.addProva("p",5,5);
        assertEquals(10,n.calcPeso());
    }
}