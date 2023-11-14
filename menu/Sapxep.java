package menu;

import student.ManagerStudent;
import student.Student;

import java.util.Scanner;

public class Sapxep {
    public void sortList(ManagerStudent List){
        Scanner scanner = new Scanner(System.in);
        boolean c = true;
        while (c){
            System.out.println("---- Sắp xếp sinh viên theo điểm trung bình ----");
            System.out.println("Chọn chức năng theo số ( để tiếp tục )");
            System.out.println("1. Sắp xếp điểm trung bình tăng dần" + "\n" +
                    "2. Sắp xếp điểm trung bình giảm dần" + "\n" +
                    "3. Thoát");
            System.out.println("Chọn chức năng :");
            int choise = scanner.nextInt();
            switch (choise){
                case 1:
                    for (int i = 1; i < List.students.size(); i++) {
                        for (int j = 0; j < List.students.size() - i; j++) {
                            if (List.students.get(j).getMediumScore() > List.students.get(j + 1).getMediumScore()){
                                Student temp = List.students.get(j);
                                List.students.set(j,List.students.get(j + 1));
                                List.students.set(j + 1,temp);
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công !");
                    break;
                case 2:
                    for (int i = 1; i < List.students.size(); i++) {
                        for (int j = 0; j < List.students.size() - i; j++) {
                            if (List.students.get(j).getMediumScore() < List.students.get(j + 1).getMediumScore()){
                                Student temp = List.students.get(j);
                                List.students.set(j,List.students.get(j + 1));
                                List.students.set(j + 1,temp);
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công !");
                    break;
                case 3:
                    c = false;
                    break;
                default:
                    throw new IllegalStateException("Nhâp lại !");

            }
        }
    }
}
