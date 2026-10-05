package Jobsheet6;

public class MenuKafeDemo {
    public static void main(String[] args) {
        Minuman minuman1 = new Minuman("Leci Tea", 20000, 2, "es", "Large");
        System.out.println("===== DATA MINUMAN =====");
        minuman1.tampilkanInfo();
        minuman1.tampilInfoMinuman();


        Makanan makanan1 = new Makanan("Nasi Goreng", 35000, 2, "Main Course", 3);
        System.out.println("===== DATA MAKANAN =====");
        makanan1.tampilkanInfo();
        makanan1.tampilInfoMakanan();


        //Modifikasi
        System.out.println("\n===== SETELAH MODIFIKASI =====");
        minuman1.setNamaMenu("Es Teh Leci");
        minuman1.setHarga(10000);
        minuman1.setJumlah(3);
        minuman1.setSuhu("Dingin");
        minuman1.setUkuran("Medium");

        System.out.println("=== Minuman Setelah Diubah ===");
        minuman1.tampilkanInfo();
        minuman1.tampilInfoMinuman();


        makanan1.setNamaMenu("Nasi Goreng Spesial");
        makanan1.setHarga(25000);
        makanan1.setJumlah(3);
        makanan1.setJenis("Makanan Utama");
        makanan1.setLevelPedas(5);

        System.out.println("=== Makanan Setelah Diubah ===");
        makanan1.tampilkanInfo();
        makanan1.tampilInfoMakanan();
    }  
}