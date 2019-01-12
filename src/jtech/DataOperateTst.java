package jtech;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataOperateTst {

//    @Test
    public void test2() {
//        fail("まだ実装されていません");
        DataOperate strope = new DataOperate();
        assertEquals("一致しません", "OK", strope.str("xyz"));
    }

//    @Test
    public void test() {
//      fail("まだ実装されていません");
      DataOperate strope = new DataOperate();
      assertEquals(1058, strope.tax(980), 0.3);
  }
    
    @Test
    public void test3(){
        DataOperate strope = new DataOperate();
        assertEquals(1058, strope.tax(980), 0.3);
        assertSame(10, strope.num());
        assertNotSame(20, strope.num());
        assertSame("01", strope.str2());
        assertSame("01", strope.str2("01"));
        assertNotSame("02", strope.str2());
        assertNotSame("02", strope.str2("01"));
        
    }

}
