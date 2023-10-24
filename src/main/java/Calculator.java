import java.util.ArrayList;
import java.util.List;

public class Calculator implements Calculatable {
    private List<String> operations;
    public Calculator(){
        operations = new ArrayList<>();
    }
    @Override
    public Integer add(Integer number1, Integer number2) {
        int result = number1 + number2;
        operations.add(number1 + " + " + number2 + " = " + result);
        return result;
    }
    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int result = number1 - number2;
        operations.add(number1 + " - " + number2 + " = " + result);
        return result;
    }
    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int result = number1 * number2;
        operations.add(number1 + " * " + number2 + " = " + result);
        return result;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        int result = number1 / number2;
        operations.add(number1 + " / "  + number2 + " = " + result );
        return result;
    }

    @Override
    public String getHistory() {
        return operations.toString();
    }
}
