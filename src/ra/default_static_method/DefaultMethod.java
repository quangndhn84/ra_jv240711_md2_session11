package ra.default_static_method;

public interface DefaultMethod {
    void test();

    //Default Method: Phương thức thực thi trong interface
    default int sumTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
