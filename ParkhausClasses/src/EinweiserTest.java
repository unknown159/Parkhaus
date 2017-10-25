import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EinweiserTest {

    Auto[] PP;


    @Before
    public void setUp() throws Exception {
        PP = new Auto[5];
    }


    @Test
    public void freeSpace_EmptyArray_Return0(){
        assertEquals(0, Einweiser.getNextFreeSpace(PP));
    }


    @Test
    public void freeSpace_SemiFullArray_Return3(){
        PP[0] = new Auto();
        PP[1] = new Auto();
        PP[2] = new Auto();
        assertEquals(3, Einweiser.getNextFreeSpace(PP));
    }

}