import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

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

    @Test
    public void gcdTestR() {
        Assert.assertEquals(2, Turtles.gcdR(4,2));
        Assert.assertEquals(24, Turtles.gcdR(1440, 408));
        Assert.assertEquals(1, Turtles.gcdR(89, 7));
    }

    @Test
    public void gcdTest() {
        Assert.assertEquals(2, Turtles.gcd(4,2));
        Assert.assertEquals(24, Turtles.gcd(1440, 408));
        Assert.assertEquals(1, Turtles.gcd(89, 7));
    }

    @Test
    public void testSpeed() throws InterruptedException {
        Instant start;
        Instant stop;

        start = Instant.now();
        Turtles.gcd(1440, 408);
        stop = Instant.now();

        System.out.println("Non recursive with 1440 and 408: " + Duration.between(start, stop).toMillis());

        //Thread.sleep(500);

        start = Instant.now();
        Turtles.gcdR(1440, 408);
        stop = Instant.now();

        System.out.println("Recursive with 1440 and 408: " + Duration.between(start, stop).toMillis());

        //Thread.sleep(500);

        start = Instant.now();
        Turtles.gcd(74687, 41911);
        stop = Instant.now();

        System.out.println("Non recursive with 74687 and 41911: " + Duration.between(start, stop).toMillis());

        //Thread.sleep(500);

        start = Instant.now();
        Turtles.gcdR(74687, 41911);
        stop = Instant.now();

        System.out.println("Recursive with 74687 and 41911: " + Duration.between(start, stop).toMillis());
    }
}