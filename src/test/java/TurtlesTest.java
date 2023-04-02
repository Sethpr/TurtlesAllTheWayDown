import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void factorialTestRecursive() {
        Assert.assertEquals(1, Turtles.factorialR(1));
        Assert.assertEquals(120, Turtles.factorialR(5));
        Assert.assertEquals(479001600, Turtles.factorialR(12));
    }

    @Test
    public void factorialTestLoop() {
        Assert.assertEquals(1, Turtles.factorial(1));
        Assert.assertEquals(120, Turtles.factorial(5));
        Assert.assertEquals(479001600, Turtles.factorial(12));
    }


}