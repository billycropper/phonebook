import calculator.Calc;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void addTest(){
        //Given
        Calc calc = new Calc();
        int expect = 5;

        //When
        int actual = calc.add(2,3);

        //Then
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void subtractTest(){
        Calc calc = new Calc();
        int expect = -20;

        int actual = calc.subtract(20,40);

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void multiplyTest(){
        Calc calc = new Calc();
        double expect = 50;

        double actual = calc.multiply(5,10);

        Assert.assertEquals(expect,actual, .001);
    }

    @Test
    public void squareTest(){
        Calc calc = new Calc();
        int expect = 25;

        int actual = calc.square(5);

        Assert.assertEquals(expect,actual);
    }



}
