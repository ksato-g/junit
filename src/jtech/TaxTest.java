package jtech;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxTest {

    @Test
    public void testTaxIn() {
//        fail("まだ実装されていません");
        Tax tax = new Tax();
        assertEquals(1080, tax.taxIn(1000));
    }

}
