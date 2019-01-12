package jtech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TryJunitTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClassです");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AfterClassです");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Beforeです");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Afterです");
    }

    @Test
    public void testTryJunit() {
//        fail("まだ実装されていません");
        System.out.println("Test1です");
        assertEquals(1,TryJunit.cnt);
    }

    @Test
    public void testMain() {
//        fail("まだ実装されていません");
        System.out.println("Test2です");
        String[] str = {"main","メソッド"};
        TryJunit.main(str);
        TryJunit tj = new TryJunit();
        assertEquals(4,tj.sub());
    }

}
