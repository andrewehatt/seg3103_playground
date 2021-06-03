//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputationTest {
    Computation computation = new Computation();

    public ComputationTest() {
    }

    @Test
    public void add() {
        int addResult = this.computation.add(1, 1);
        Assertions.assertEquals(2, addResult);
    }


    @Test
    public void addSpecialCase() {
	int addResult = this.computation.add(-2147483648, 1);
	Assertions.assertEquals(-2147483647);
    }

    @Test
    public void substract() {
	int subResult = this.computation.subtract(3,1);
	Assertions.assertEquals(2, subResult);
    }

    @Test
    public void divide() {
        double divideResult = this.computation.divide(1.0D, 2.0D);
        Assertions.assertEquals(0.5D, divideResult, 0.0D);
    }

    @Test
    public void catchesException() {
        this.computation.catchesException();
    }

    @Test
    public void multiply() {
        Assertions.assertEquals(10, this.computation.multiply(5, 2));
        Assertions.assertEquals(0, this.computation.multiply(100, 0));
    }

    @Test
    public void justALoop() {
        Assertions.assertEquals(2, this.computation.justALoop());
    }
}
