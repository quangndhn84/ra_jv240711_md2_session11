package ra.default_static_method;

public class Demo01 implements DefaultMethod {
    @Override
    public void test() {

    }

    @Override
    public int sumTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber + 10;
    }
}
