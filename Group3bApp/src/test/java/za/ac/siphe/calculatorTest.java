package za.ac.siphe;

import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {

    @Test
    public void add(){
        calculator calculates = new calculator();
        Assert.assertEquals(5, calculates.addition(2,3));

    }

    @Test
    public void mult(){

        calculator calculator1 = new calculator();
        Assert.assertEquals(6, calculator1.multply(2,3));
    }
}