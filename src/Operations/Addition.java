package Operations;

public class Addition implements Operation {
    public double Calc(Number x, Number y) {        
        return x.doubleValue() + y.doubleValue();
    }
    
}
