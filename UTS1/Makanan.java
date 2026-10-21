package UTS1;

public class Makanan {
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Harga: Rp" + harga);
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

