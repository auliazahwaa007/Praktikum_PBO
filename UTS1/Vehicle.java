package UTS1;

public class Vehicle {

    private int vehicleId;
    private String vehicleName;

    public Vehicle(int vehicleId, String vehicleName) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
    }

    public void tampilkanInfo() {
        System.out.println("ID Kendaraan: " + vehicleId);
        System.out.println("Nama Kendaraan: " + vehicleName);
    }
}