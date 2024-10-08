package ra.lambda;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng gián tiếp từ FunctionInterface
        //Cách 1;
        IFunctionalInterface if1 = new IFunctionalInterface() {
            @Override
            public int addTwoNumbers(int firstNumber, int secondNumber) {
                int total = firstNumber + secondNumber;
                return total;
            }
        };
        System.out.println("Tổng 2 số 5 và 10 là: " + if1.addTwoNumbers(5, 10));
        //Cách 2: Sử dụng biểu thức Lambda
        IFunctionalInterface if2 = (a, b) -> {
            int total = a + b;
            return total;
        };
        //Cách 3: Sử dụng biểu thức Lambda nhưng khối lệnh chỉ gồm 1 câu lệnh
        IFunctionalInterface if3 = (a, b) -> a + b;
        System.out.println("Tổng 2 số 10 và 20 là: " + if3.addTwoNumbers(10, 20));
    }


}
