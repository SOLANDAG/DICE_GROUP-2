package SEAM;

public class Client extends User {
    private Room room;
    private Equipment equipment;

    public Client(String name, String idNumber) {
        super(name, idNumber);
    }

    public void assignRoom(Room room) {
        this.room = room;
    }
    
    public void assignEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {   
        this.room = room;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
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
