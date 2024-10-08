package ra.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn D", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn E", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn C", 25);
        Student student6 = new Student("SV006", "Nguyễn Văn F", 19);
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
        listStudents.add(student6);
        System.out.println("1. In ra các sinh viên có tuổi lớn hơn 20");
        /*
         * Stream:
         * B1: Chuyển sang Stream: sử dụng phương thức stream()
         * B2: Thực hiện các thao tác trung gian
         * B2; Thực hiện các thao tác đầu cuối
         * */
        listStudents.stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
        System.out.println("2. In ra 2 sinh viên đầu tiên:");
        listStudents.stream().limit(2).forEach(System.out::println);
        System.out.println("3. In ra 2 sinh viên bắt đầu từ sinh viên thứ 3:");
        listStudents.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("4. In ra tất cả tuổi sinh viên với giá trị x 2");
        listStudents.stream().map(student -> student.getAge() * 2).forEach(System.out::println);
        System.out.println("5. In ra các sinh viên được sắp xếp theo tuổi tăng dần");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("6. In ra các sinh viên được sắp xếp theo tuổi giảm dần:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        System.out.println("7. Sắp xếp các sinh viên theo tuổi tăng dần, những sinh viên bằng tuổi thì sắp xếp theo tên giảm dần:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge)
                        .thenComparing(Comparator.comparing(Student::getStudentName).reversed()))
                .forEach(System.out::println);
        System.out.println("8. Tạo ra 1 danh sách sinh viên gồm những sinh viên có tuổi nhỏ hơn 20");
//        List<Student> studentUnder20 = listStudents.stream().filter(student -> student.getAge()<20).collect(Collectors.toList());
        List<Student> studentUnder20 = listStudents.stream().filter(student -> student.getAge() < 20).toList();
        studentUnder20.stream().forEach(System.out::println);
        System.out.println("9. Kiểm tra trong danh sách sinh viên có sinh viên nào lớn hơn 21 tuổi không:");
        System.out.println(listStudents.stream().anyMatch(student -> student.getAge() > 24));
        System.out.println("10. Kiểm tra trong danh sách tất cả sinh viên có lớn hơn hoặc bằng 18 tuổi không:");
        System.out.println(listStudents.stream().allMatch(student -> student.getAge() >= 18));
        System.out.println("11. In ra số sinh viên có tuổi lớn hơn hoặc bằng 22:");
        System.out.println(listStudents.stream().filter(student -> student.getAge() >= 22).count());
        System.out.println("12. Tuổi lớn nhất: " + listStudents.stream().max(Comparator.comparing(Student::getAge)));
        System.out.println("13. Tuổi nhỏ nhất: " + listStudents.stream().min(Comparator.comparing(Student::getAge)));
        System.out.println("14: Thống kê các sinh viên theo tuổi:");
        IntSummaryStatistics iss = listStudents.stream().mapToInt(Student::getAge).summaryStatistics();
        System.out.println("Tuổi trung bình: " + iss.getAverage());
        System.out.println("15: Sử dụng reduce tính tổng các sinh viên: ");
        int sumAge = listStudents.stream().reduce(0, (total, student) -> total + student.getAge(), Integer::sum);
        System.out.println(sumAge);

        System.out.println("THÔNG TIN CÁC SINH VIÊN:");
        //Lambda + referenceMethod
//        listStudents.forEach(student-> System.out.println(student));
        listStudents.forEach(System.out::println);
    }
}
