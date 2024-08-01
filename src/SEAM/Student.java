package SEAM;

public class Student extends Client {
    private String school;

    public Student(String name, String idNumber, String school) {
        super(name, idNumber);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}