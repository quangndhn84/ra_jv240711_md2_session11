package ra.default_static_method;

public class Demo {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        System.out.println("Tổng 2 số 5 và 7 là: " + demo01.sumTwoNumbers(5, 7));
        Demo02 demo02 = new Demo02();
        System.out.println("Hiệu 2 số 10 và 3 là: " + StaticMethod.minusTwoNumbers(10, 3));
    }
}
