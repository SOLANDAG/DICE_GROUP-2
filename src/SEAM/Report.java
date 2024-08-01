package SEAM;

import java.util.List;
import java.util.Map;

public class Report {
    private List<Equipment> purchaseList;
    private Map<Equipment, String> conditionList;

    public List<Equipment> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Equipment> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public Map<Equipment, String> getConditionList() {
        return conditionList;
    }

    public void setConditionList(Map<Equipment, String> conditionList) {
        this.conditionList = conditionList;
    }

    public void generatePurchaseListReport() {
        System.out.println("EQUIPMNET TO BE PURCHASED: ");
        for (Equipment equipment : purchaseList) {
            System.out.println(equipment.getName() + " - " + equipment.getCondition());
        }
    }

    public void generateConditionListReport() {
        System.out.println("CONDITIONS OF ALL EQUIPMENT:");
        for (Map.Entry<Equipment, String> entry : conditionList.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue());
        }
    }
}