package File;

import student.ManagerStudent;
import student.Student;

import java.io.*;
import java.util.ArrayList;

public class PrintFile {
    private File file = new File("file.csv");

    public void writeFile(ManagerStudent List) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student : List.students) {
                line += student.toString();
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
