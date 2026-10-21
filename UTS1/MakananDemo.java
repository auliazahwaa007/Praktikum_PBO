package UTS1;

public class MakananDemo {
    public static void main(String[] args) {

        System.out.println("=== MAKANAN BERAT ===");
        MakananBerat makananBerat =
                new MakananBerat("Nasi Putih", 5000, "Karbohidrat");

        makananBerat.tampilkanInfo();
        makananBerat.makanDenganNasi();

        System.out.println();

        System.out.println("=== MAKANAN RINGAN ===");
        MakananRingan makananRingan =
                new MakananRingan("Keripik Kentang", 10000, "Pedas");

        makananRingan.tampilkanInfo();
        makananRingan.dimakanSaatSantai();

        System.out.println();

        System.out.println("=== NASI GORENG ===");
        NasiGoreng nasiGoreng =
                new NasiGoreng(
                        "Nasi Goreng Spesial",
                        15000,
                        "Karbohidrat",
                        "Sedang",
                        true
                );

        nasiGoreng.tampilkanInfo();
        nasiGoreng.masak();
        nasiGoreng.makanDenganNasi();
    }
}
