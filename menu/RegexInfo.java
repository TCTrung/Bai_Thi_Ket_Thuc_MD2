package menu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexInfo {
    Scanner scanner = new Scanner(System.in);
//^(Nam|Nữ|Khác)$
public static String gioiTinh(Scanner scanner) {
    String sex;
    boolean hopLe = false;
    String regex = "^(Nam|Nữ|Khác)$";
    do {
        sex = scanner.nextLine();
        Matcher matcher = Pattern.compile(regex).matcher(sex);
        if (matcher.matches()) {
            hopLe = true;
        } else {
            System.out.println("Giới tính không hợp lệ. Vui lòng nhập lại.");
        }
    } while (!hopLe);
    return sex;
}
    public static String nhapDiem(Scanner scanner) {
        String score;
        boolean hopLe = false;
        String regex = "^(10\\.0|([0-9](\\.[0-9])?))$";
        do {
            score = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(score);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Điểm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return score;
    }

    public static String nhaptuoi(Scanner scanner) {
        String tuoi;
        boolean hopLe = false;
        String regex = "^(1[8-9]|[2-7][0-9]|80)$";
        do {
            tuoi = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(tuoi);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Tuổi không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return tuoi;
    }
    public static String nhapCode(Scanner scanner) {
        String code;
        boolean hopLe = false;
        String regex = "^[A-Z]\\d{3}$";
        do {
            System.out.println("Nhập mã sinh viên(bắt đầu chữ Hoa + 3 số): ");
            code = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(code);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Mã không hợp lệ không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return code;
    }
    public static String nhapTen(Scanner scanner) {
        String hoTen;
        boolean hopLe = false;
        String regex = "^[A-Z][a-z]*( [A-Z][a-z]*)*$";
        do {
            System.out.println("Nhập họ & tên: ");
            hoTen = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(hoTen);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Họ và tên không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return hoTen;
    }

}
