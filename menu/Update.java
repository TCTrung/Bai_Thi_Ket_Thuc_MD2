package menu;

import student.ManagerStudent;
import student.Student;

import java.util.Scanner;

public class Update {
    public void updateStudent(ManagerStudent List){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên muốn sửa :");
        String code = input.nextLine();
        boolean ch = false;
        for (Student student : List.students) {
            if (student.getCodeStudent().equals(code)) {
                boolean ca = true;
                while (ca) {
                    System.out.println("1.Sửa mã sinh viên." + "\n" +
                            "2.Sửa họ và tên." + "\n" +
                            "3.Sửa tuổi." + "\n" +
                            "4.Sửa giới tính." + "\n" +
                            "5.Sửa địa chỉ." + "\n" +
                            "6.Sửa điểm trung bình." + "\n" +
                            "0.Thoát.");
                    System.out.println("Nhập lựa chọn :");
                    int c = input.nextInt();
                    input.nextLine();
                    switch (c) {
                        case 1:
                            System.out.println("Nhập mã mới :");
                            String codeNew = input.nextLine();
                            student.setCodeStudent(codeNew);
                            System.out.println("Success !");
                            break;
                        case 2:
                            System.out.println("Nhập họ tên mới :");

                            String nameNew = input.nextLine();
                            student.setNameStudent(nameNew);
                            System.out.println("Success !");
                            break;
                        case 3:
                            System.out.println("Nhập tuổi mới :");
                            int ageNew = Integer.parseInt(input.nextLine());
                            student.setAgeStudent(ageNew);
                            System.out.println("Success !");
                            break;
                        case 4:
                            System.out.println("Nhập giới tính mới :");
                            String sexNew = input.nextLine();
                            student.setSexStudent(sexNew);
                            System.out.println("Success !");
                            break;
                        case 5:
                            System.out.println("Nhập địa chỉ mới :");
                            String addressNew = input.nextLine();
                            student.setAddressStudent(addressNew);
                            System.out.println("Success !");
                            break;
                        case 6:
                            System.out.println("Nhập điểm mới :");
                            double scoreNew = input.nextDouble();
                            student.setMediumScore(scoreNew);
                            System.out.println("Success !");
                            break;
                        case 0:
                            ca = false;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + c);
                    }
                }
                ch = true;
                break;
            }
        }
        if (!ch){
            System.out.println("Không có sinh viên này !");
        }
    }
}
