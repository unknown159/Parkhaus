import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EinweiserTest {
    @Before
    public void setUp() throws Exception {
        Auto[] PP = new Auto[5];

    }


    @Test
    public void freeSpaceTest1(){
        assertEquals(3, Einweiser.getNextFreeSpace(PP));
    }

}