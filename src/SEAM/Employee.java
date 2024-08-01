package SEAM;

public class Employee extends Client {
    private String city;

    public Employee(String name, String idNumber, String city) {
        super(name, idNumber);
        this.city = city;
    }

    public String getCity() {
        return city;
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