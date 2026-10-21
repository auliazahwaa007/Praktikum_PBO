package UTS1;

public class Admin extends User {

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Memperbarui detail kendaraan ID "
                + vehicleId + ".");
    }

    public Vehicle addVehicle() {
        Vehicle kendaraan = new Vehicle(101, "Toyota Avanza");
        System.out.println("Kendaraan berhasil ditambahkan.");
        return kendaraan;
    }

    public void retrieveComplain() {
        System.out.println("Mengambil data keluhan pengguna.");
    }

    public void verifyUser() {
        System.out.println("Memproses verifikasi pengguna.");
    }
}