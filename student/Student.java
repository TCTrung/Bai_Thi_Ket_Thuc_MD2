package student;

public class Student {
    private String codeStudent;
    private String nameStudent;
    private int ageStudent;
    private String sexStudent;
    private String addressStudent;
    private double mediumScore;

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getSexStudent() {
        return sexStudent;
    }

    public void setSexStudent(String sexStudent) {
        this.sexStudent = sexStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    public Student(){}

    public Student(String codeStudent, String nameStudent, int ageStudent,
                   String sexStudent, String addressStudent, double mediumScore) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.sexStudent = sexStudent;
        this.addressStudent = addressStudent;
        this.mediumScore = mediumScore;
    }

    public String toString() {
        return "Mã sinh viên: " + this.codeStudent + "," +
                "Tên sinh viên: " + this.nameStudent + "," +
                "Tuổi: " + this.ageStudent + "," +
                "Giới tính: " + this.sexStudent + "," +
                "Địa chỉ: " + this.addressStudent + "," +
                "Điểm trung bình: " + this.mediumScore + "\n";
    }
}
