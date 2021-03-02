package hu.meiit.haladojava.calculator;


public class App 
{
    public static final String errorResponse = "-";

    public static void main( String[] args )
    {
        String result = errorResponse;

        try {
            InputString inputString = new InputString();
            Formater formater = new Formater(inputString);
            String[] getValues = formater.splitting();
            if(getValues != null){
                Double operand1 = Checker.stringToDouble(getValues[0]);
                Double operand2 = Checker.stringToDouble(getValues[2]);
                if ((operand1 == null) || (operand2 == null)){
                    result = errorResponse;
                }else {
                    Executor executor = new Executor(operand1, operand2, getValues[1]);
                    result = executor.calculate();
                }
            }
        }catch (Exception ex) {}

        System.out.print(result);
    }
}
