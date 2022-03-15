import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_1 {
    @Test
    public void test0(){
        assertTrue(Main.divided(6)==true);
    }
    @Test
    public void test1(){
        assertTrue(Main.divided(2)==false);
    }
    @Test
    public void test2(){
        assertTrue(Main.divided(9)==true);
    }

}
