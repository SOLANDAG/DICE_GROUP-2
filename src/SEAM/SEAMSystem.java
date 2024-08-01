package SEAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SEAMSystem {
    private static SEAMSystem instance;
    private List<Client> clients;
    private List<Room> rooms;
    private List<Equipment> equipments;

    private SEAMSystem() {
        clients = new ArrayList<>();
        rooms = new ArrayList<>();
        equipments = new ArrayList<>();
        initializeRooms();
        initializeEquipments();
    }

    public static SEAMSystem getInstance() {
        if (instance == null) {
            instance = new SEAMSystem();
        }
        return instance;
    }

    private void initializeRooms() {
        for (int i = 1; i <= 3; i++) {
            rooms.add(new Room(i));
        }
    }

    private void initializeEquipments() {
        equipments.add(new Equipment("PROJECTOR"));
        equipments.add(new Equipment("TELEVISION"));
        equipments.add(new Equipment("PRINTER"));
        equipments.add(new Equipment("ROUTER"));
        equipments.add(new Equipment("LAPTOP"));
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void unregisterClient(Client client) {
        clients.remove(client);
        if (client.getRoom() != null) {
            client.getRoom().setOccupied(false);
        }
        if (client.getEquipment() != null) {
            client.getEquipment().setClaimedBy(null);
            client.getEquipment().setCondition("GOOD CONDITION");
        }
    }

    public void manageEquipment(Manager manager) {
        Scanner scanner = new Scanner(System.in);

        for (Equipment equipment : equipments) {
            System.out.println("CURRENT CONDITION OF " + equipment.getName() + ": " + equipment.getCondition());
            System.out.println("Enter new condition (Good Condition, Needs Repair, Bad Condition, Lost): ");
            String condition = scanner.nextLine();
            manager.recordCondition(equipment, condition);
        }
    }

    public Report generateReport() {
        Report report = new Report();
        report.setPurchaseList(generatePurchaseList());
        report.setConditionList(generateConditionList());
        return report;
    }

    private List<Equipment> generatePurchaseList() {
        List<Equipment> purchaseList = new ArrayList<>();
        for (Equipment equipment : equipments) {
            if (equipment.getCondition().equals("BAD CONDITION") || equipment.getCondition().equals("Lost")) {
                purchaseList.add(equipment);
            }
        }
        return purchaseList;
    }

    private Map<Equipment, String> generateConditionList() {
        Map<Equipment, String> conditionList = new HashMap<>();
        for (Equipment equipment : equipments) {
            conditionList.put(equipment, equipment.getCondition());
        }
        return conditionList;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
    public Equipment findEquipmentByName(String name) {
        for (Equipment equipment : equipments) {
            if (equipment.getName().equalsIgnoreCase(name)) {
                return equipment;
            }
        }
        return null;
    }
}