package ra.optional;

import ra.stream.Student;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Student student = getStudent1();
//        if (student != null) {
//            System.out.println("Mã sinh viên là: " + student.getStudentId());
//        }
        Optional<Student> optStudent = Optional.ofNullable(student);
        if (optStudent.isPresent()) {
            System.out.println("Mã sinh viên là: " + student.getStudentId());
        }
        optStudent.ifPresent(student1 -> System.out.println("Tên sinh viên là: " + student1.getStudentName()));
        Student student2 = getStudent1();
        Optional<Student> optStudent2 = Optional.of(Optional.ofNullable(student2).orElse(new Student()));
    }

    public static Student getStudent1() {
        return new Student("SV001", "Nguyễn Văn A", 20);
    }

    public static Optional<Student> getStudent2() {
        return Optional.ofNullable(null);
    }
}
