package hu.meiit.haladojava.calculator;

public class Executor {
    private Double operand1;
    private Double operand2;
    private String operator;

    public Executor(double operand1, double operand2, String operator)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public String calculate()
    {
        switch (Expression.getOperatorName(operator))
        {
            case ADD:
                return String.valueOf(operand1 + operand2);

            case SUBTRACT:
                return String.valueOf(operand1 - operand2);

            case MULTIPLY:
                return String.valueOf(operand1 * operand2);

            case DIVIDE:
                if (operand2 == 0) {
                    return App.errorResponse;
                }else {
                    return String.valueOf(operand1 / operand2);
                }
            default:
                return App.errorResponse;
        }
    }
}