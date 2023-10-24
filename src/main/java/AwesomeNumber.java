public class AwesomeNumber {
    private int firstNumber;
    public AwesomeNumber(){

    }
    public AwesomeNumber(int i) {
        this.firstNumber = i;
    }
    public static AwesomeNumber add(AwesomeNumber awesomeNumber1, AwesomeNumber awesomeNumber2){
        return  new AwesomeNumber(awesomeNumber1.getFirstNumber() + awesomeNumber2.getFirstNumber());
    }
    public static AwesomeNumber subtract(AwesomeNumber awesomeNumber1, AwesomeNumber awesomeNumber2){
        return new AwesomeNumber(awesomeNumber1.getFirstNumber() - awesomeNumber2.getFirstNumber());
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    @Override
    public String toString() {
        return "" +firstNumber;
    }
}
