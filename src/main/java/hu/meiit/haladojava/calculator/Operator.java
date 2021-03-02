package hu.meiit.haladojava.calculator;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String operator;

    Operator(String operator)
    {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }


}
