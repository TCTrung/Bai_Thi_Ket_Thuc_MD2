package student;

import java.util.ArrayList;

public class ManagerStudent {
    public ArrayList<Student> students;
    public ManagerStudent() {this.students = new ArrayList<Student>();}
    public void addStudent(Student student) {this.students.add(student);}
    public void removeStudent(Student student) {this.students.remove(student);}
    public void showListStudent(){
        int i = 1;
        for (Student student : students) {
            System.out.println("Sinh viên " + i + " là : "+"\n"+ student);
            i++;
        }
    }

}
