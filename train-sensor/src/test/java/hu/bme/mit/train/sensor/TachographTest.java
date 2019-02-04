package hu.bme.mit.train.sensor;

import org.junit.Test;
import static org.junit.Assert.*;

public class TachographTest {

    @Test
    public void test1() {
        Tachograph t = new Tachograph();
        t.add(1,2,3);
        assertFalse(t.table.isEmpty());
    }
}


