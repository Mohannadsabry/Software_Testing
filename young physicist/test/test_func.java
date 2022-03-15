import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_func {
    @Test
    public void test0(){
        assertTrue(Main.in_eq(0,0,0)==true);
    }
    @Test
    public void test1(){
        assertTrue(Main.in_eq(3,0,0)==false);
    }
    @Test
    public void test2(){
        assertTrue(Main.in_eq(0,3,0)==false);
    }
    @Test
    public void test3(){
        assertTrue(Main.in_eq(0,0,3)==false);
    }
    public void test4(){
        assertTrue(Main.in_eq(-3,0,3)==false);

    }
    @Test
    public void test5(){
        assertTrue(Main.in_eq(4,0,-3)==false);
    }
    @Test
    public void test6(){
        assertTrue(Main.in_eq(-4,3,0)==false);
    }
    @Test
    public void test7(){
        assertTrue(Main.in_eq(3,-4,0)==false);
    }
    @Test
    public void test8(){
        assertTrue(Main.in_eq(0,3,-4)==false);
    }
    @Test
    public void test9(){
        assertTrue(Main.in_eq(0,-3,4)==false);
    }

}
