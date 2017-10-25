import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchrankenwartTest {

    Schrankenwart sw;

    @Before
    public void setUp() throws Exception {
        sw = new Schrankenwart();
    }

    @Test
    public void freieParkplaetze_emptyArray_zero(){
        assertEquals(0, sw.freieParkplaetze(new Auto[]{}));
    }

    @Test
    public void freieParkplaetze_fullArray_zero(){

        Auto[] PP = new Auto[3];
        PP[0] = new Auto();
        PP[1] = new Auto();
        PP[2] = new Auto();
        assertEquals(0, sw.freieParkplaetze();
    }

    @Test
    public void freieParkplaetze_semiFullArray_zero(){
        Auto[] PP = new Auto[3];
        PP[0] = new Auto();
        PP[2] = new Auto();
        assertEquals(1, sw.freieParkplaetze();
    }


    @Test
    public void TicketBezahlt_NewAuto_False(){
        assertFalse(sw.TicketBezahlt(new Auto()));
    }



}