import Operations.Addition;
import Operations.Division;
import Operations.Multiplication;
import Operations.Operation;
import Operations.Subtraction;

public class LocalCalculator implements Calculator{
    public double Calc(Formula formula) throws Exception {
        Operation operation;

        switch (formula.getOperator()){
            case PLUS:
                operation = new Addition();
                break;
            case MINUS:
                operation = new Subtraction();
                break;
            case STAR:
                operation = new Multiplication();
                break;
            case SLASH:
                operation = new Division();
                break;
            default:
                throw new Exception();
        }
        
        return operation.Calc(formula.getX(), formula.getY());
    }
    
}
