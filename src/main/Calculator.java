package main;

import java.math.BigDecimal;


public class Calculator {
    private OperandStack values = new OperandStack();
    public BigDecimal getAccumulator(){
    
        return values.peek();
    }
    public void setAccumulator(BigDecimal value) {
        values.replaceTop(value);
    }
    public void enter() {
        values.push(getAccumulator());
    }
    public void drop() {
        values.pop(); 
    }
    public void add() {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(value1.add(value2));
    }
    public void subtract() {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(value2.subtract(value1));
    }
}
