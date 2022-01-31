public class Formula{
    private Number x;
    private Number y;
    private Sign operator;
    public Number getX() {
        return x;
    }
    public Sign getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = Sign.fromString(operator);
    }
    public Number getY() {
        return y;
    }
    public void setY(Number y) {
        this.y = y;
    }
    public void setX(Number x) {
        this.x = x;
    }
}