package Operations;

public class Multiplication implements Operation {
    public double Calc(Number x, Number y) {        
        return x.doubleValue() + y.doubleValue();
    }
    
}
