package hu.meiit.haladojava.calculator;

public class Expression {
    public static boolean IsOperator(String s)
    {
        for (Operator operator : Operator.values()) {
            if (s.equals(operator.getOperator())) {
                return true;
            }
        }
        return false;
    }

    public static Operator getOperatorName(String s) {

        for (Operator operator : Operator.values()) {
            if (s.equals(operator.getOperator())) {
                return operator;
            }
        }
        return null;
    }
}
