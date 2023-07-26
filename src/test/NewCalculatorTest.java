package test;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;
import static org.junit.Assert.assertEquals;
public class NewCalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    } 

    @Test
    public void testNewCalculatorHasAnAccumaltorOfZeor(){
        calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }
    @Test
    public void testSettingAccumulator() {
        calculator = new Calculator();
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }

    
} 