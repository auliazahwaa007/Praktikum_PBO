package Quiz1;

public class Main2 {
    public static void main(String[] args) {

        // Membuat object pelanggan
        Pelanggan pelanggan1 = new Pelanggan(
            "Budi",
            "081234567890"
        );

        // Membuat object karyawan
        Karyawan karyawan1 = new Karyawan(
            1,
            "Andi",
            "Mekanik"
        );

        // Membuat object layanan
        Layanan layananMobil = new Layanan(
            "Servis Mobil",
            0
        );

        Layanan layananMotor = new Layanan(
            "Servis Sepeda Motor",
            0
        );

        // Menentukan karyawan yang menangani layanan
        layananMobil.setKaryawan(karyawan1);
        layananMotor.setKaryawan(karyawan1);

        // Membuat 2 mobil
        Kendaraan mobil1 = new Kendaraan(
            "N 1234 AB",
            "Toyota",
            "Avanza",
            "Mobil",
            pelanggan1
        );

        Kendaraan mobil2 = new Kendaraan(
            "N 5678 CD",
            "Honda",
            "Civic",
            "Mobil",
            pelanggan1
        );

        // Membuat 2 sepeda motor
        Kendaraan motor1 = new Kendaraan(
            "N 1111 EF",
            "Honda",
            "Vario",
            "Sepeda Motor",
            pelanggan1
        );

        Kendaraan motor2 = new Kendaraan(
            "N 2222 GH",
            "Yamaha",
            "NMAX",
            "Sepeda Motor",
            pelanggan1
        );

        // Menambahkan kendaraan ke pelanggan
        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(mobil2);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan1.tambahKendaraan(motor2);

        // Memilih layanan
        mobil1.setLayanan(layananMobil);
        mobil2.setLayanan(layananMobil);
        motor1.setLayanan(layananMotor);
        motor2.setLayanan(layananMotor);

        // Menampilkan informasi pelanggan
        System.out.println("======================================");
        System.out.println("        BENGKEL MAJU");
        System.out.println("======================================");

        System.out.println("Nama Pelanggan  : " + pelanggan1.getNama());
        System.out.println("Nomor Telepon   : " + pelanggan1.getNomorTelepon());

        System.out.println("\n===== DATA KENDARAAN =====");

        double totalBiaya = 0;

        for (Kendaraan kendaraan : pelanggan1.getKendaraan()) {

            double biayaLayanan;

            if (kendaraan.getTipeKendaraan().equalsIgnoreCase("Mobil")) {
                biayaLayanan = 50000;
            } else {
                biayaLayanan = 20000;
            }

            totalBiaya += biayaLayanan;

            System.out.println("\nPlat Nomor      : " + kendaraan.getPlatNomor());
            System.out.println("Merek           : " + kendaraan.getMerek());
            System.out.println("Model           : " + kendaraan.getModel());
            System.out.println("Tipe Kendaraan  : " + kendaraan.getTipeKendaraan());
            System.out.println("Layanan         : " +
                    kendaraan.getLayanan().getServiceName());
            System.out.println("Biaya Layanan   : Rp" +
                    String.format("%.0f", biayaLayanan));
            System.out.println("Karyawan        : " +
                    kendaraan.getLayanan().getKaryawan().getNamaKaryawan());
        }

        System.out.println("\n======================================");
        System.out.println("TOTAL PERKIRAAN BIAYA : Rp" +
                String.format("%.0f", totalBiaya));
        System.out.println("======================================");
    }
}
