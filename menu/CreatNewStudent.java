package menu;

import student.ManagerStudent;
import student.Student;

import java.util.Scanner;

public class CreatNewStudent {
    public void creatNew(ManagerStudent List) {
        Scanner scanner = new Scanner(System.in);
        boolean as = false;
        System.out.println("---- Tạo mới ----");
        String code = RegexInfo.nhapCode(scanner);
        for (Student student : List.students) {
            if (student.getCodeStudent().equals(code)) {
                as = true;
                System.out.println("Mã sinh viên đã tồn tại !");
            }
        }
        if (!as) {
            String name = RegexInfo.nhapTen(scanner);
            System.out.println("Nhập tuổi(18-80) :");
            int age = Integer.parseInt(RegexInfo.nhaptuoi(scanner));
            System.out.println("Nhập giới tính(Nam/Nữ/khác) :");
            String sex = RegexInfo.gioiTinh(scanner);
            System.out.println("Nhập địa chỉ :");
            String address = scanner.nextLine();
            System.out.println("Nhập điểm trung bình(dạng 00.0) :");
            double mediumScore = Double.parseDouble(RegexInfo.nhapDiem(scanner));

            Student student1 = new Student(code, name, age, sex, address, mediumScore);
            List.addStudent(student1);
            System.out.println("Thêm mới thành công !");
        }
    }
}
