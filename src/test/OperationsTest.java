package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class OperationsTest {
    private Calculator calculator;

    @Before
    public void createCalcWithTwoValues(){
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(20));
         calculator.enter();
         calculator.setAccumulator(new BigDecimal(4));
    }

    @Test
    public void testAddExectuion(){
        calculator.execute("+");
        assertEquals(new BigDecimal(24), calculator.getAccumulator());
    }
      @Test
    public void testSubtractExectuion(){
        calculator.execute("-");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }
    // Multiply & Divide tests to add
    @Test
    public void testMultiplyExecution(){
        calculator.execute("*");
        assertEquals(new BigDecimal(80), calculator.getAccumulator());
    }
     @Test
    public void testDivideExecution(){
        calculator.execute("/");
        assertEquals(new BigDecimal(5), calculator.getAccumulator());
    }
}
