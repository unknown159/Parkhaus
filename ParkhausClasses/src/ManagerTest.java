import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager m;
    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void SetAndGetPreis_Zero_Zero(){
        assertEquals(0, m.getPreis);
    }


    @Test
    public void SetAndGetZeiten_Zero_Zero(){
        assertTrue(Arrays.equals(new int[] {0, 0, 0, 0}, m.getZeiten));
    }




    @Test
    public void SetAndGetPreis_2_2(){
        m.setPreis(2.0);
        assertEquals(2.0, m.getPreis);
    }

    @Test
    public void SetAndGetZeiten_1000bis2200_1000bis2000(){
        m.setZeiten(new int[]{10, 0, 20, 0});
        assertTrue(Arrays.equals(new int[] {10, 0, 20, 0}, m.getZeiten));
    }


}