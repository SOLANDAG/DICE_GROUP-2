package SEAM;

public class Room {
    private int number;
    private boolean isOccupied;

    public Room(int number) {
        this.number = number;
        this.isOccupied = false;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean status) {
        this.isOccupied = status;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}