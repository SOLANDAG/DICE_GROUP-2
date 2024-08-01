package SEAM;

public class Equipment {
    private String name;
    private String condition;
    private Client claimedBy;

    public Equipment(String name) {
        this.name = name;
        this.condition = "GOOD CONDITION";
        this.claimedBy = null;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Client getClaimedBy() {
        return claimedBy;
    }

    public void setClaimedBy(Client claimedBy) {
        this.claimedBy = claimedBy;
    }
}