package SEAM;

public class Manager extends User {
    public Manager(String name, String idNumber) {
        super(name, idNumber);
    }

    public void recordCondition(Equipment equipment, String condition) {
        equipment.setCondition(condition);
    }

    public Report generateReport() {
        return new Report();
    }
}