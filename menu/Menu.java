package menu;

import File.PrintFile;
import student.ManagerStudent;
import student.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void Start() throws Exception {
        ManagerStudent ListStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);
        try {

            boolean check = true;
            while (check) {

                System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Xem danh sách sinh viên." + "\n" +
                        "2. Thêm mới." + "\n" +
                        "3. Cập nhật." + "\n" +
                        "4. Xóa." + "\n" +
                        "5. Sắp xếp." + "\n" +
                        "6. Đọc từ file." + "\n" +
                        "7. Ghi từ file." + "\n" +
                        "8. Thoát."
                );
                System.out.println("Chọn chức năng :");
                int select = scanner.nextInt();
                scanner.nextLine();
                switch (select) {
                    case 1:
                        ListStudent.showListStudent();
                        break;
                    case 2:
                        CreatNewStudent c = new CreatNewStudent();
                        c.creatNew(ListStudent);
                        break;
                    case 3:
                        Update update = new Update();
                        update.updateStudent(ListStudent);
                        break;
                    case 4:
                        System.out.println("Nhập mã học sinh muốn xóa :");
                        String code = scanner.nextLine();
                        boolean chh = false;
                        for (Student student : ListStudent.students) {
                            if (student.getCodeStudent().equals(code)) {
                                ListStudent.removeStudent(student);
                                System.out.println("Xóa thành công !");
                                chh = true;
                                break;
                            }
                        }
                        if (!chh) {
                            System.out.println("Không có học sinh này !");
                        }
                        break;
                    case 5:
                        Sapxep a = new Sapxep();
                        a.sortList(ListStudent);
                        break;
                    case 6:
                        readFile(ListStudent);
                        System.out.println("Đọc thành công !");
                        break;

                    case 7:
                        PrintFile printFile = new PrintFile();
                        printFile.writeFile(ListStudent);
                        System.out.println("Ghi thành công !");
                        break;

                    case 8:
                        check = false;
                        break;
                    default:
                        System.out.println("Nhập lại lựa chọn !");
                        Start();

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile(ManagerStudent List) throws IOException {
        String line = null;
        FileReader fileReader = new FileReader("fileStudent.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            String[] temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            int age = Integer.parseInt(temp[2]);
            String gender = temp[3];
            String address = temp[4];
            double score = Double.parseDouble(temp[5]);

            Student data = new Student(id, name, age, gender, address, score);
            List.addStudent(data);
        }
        bufferedReader.close();
    }
}

