package hu.meiit.haladojava.calculator;

import java.util.regex.Pattern;

public class Formater {

    private final String input;

    public Formater(InputString inputString)
        {
            this.input = inputString.ScanInputString();
        }

        public String[] splitting()
        {
            if(input.contains(" "))
            {
                String[] splitted = input.split(" ");
                if((splitted.length == 3) && (Expression.IsOperator(splitted[1]))) {
                    return splitted;
                }else
                    return null;
            }else if(input.contains(Operator.ADD.getOperator())) {
                return splittingWithoutSpace(Operator.ADD);
            }else if (input.contains(Operator.SUBTRACT.getOperator())) {
                return splittingWithoutSpace(Operator.SUBTRACT);
            }else if (input.contains(Operator.MULTIPLY.getOperator())) {
                return splittingWithoutSpace(Operator.MULTIPLY);
            }else if (input.contains(Operator.DIVIDE.getOperator())) {
                return splittingWithoutSpace(Operator.DIVIDE);
            }else {
                return null;
            }
        }

        private String[] splittingWithoutSpace(Operator operator)
        {
            String[] splitted;
            splitted = input.split(Pattern.quote(operator.getOperator()));
            if(splitted.length==2){
                return new String[]{splitted[0], operator.getOperator(),splitted[1]};
            }else
                return null;
        }
    }

