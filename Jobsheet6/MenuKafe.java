package Jobsheet6;

public class MenuKafe {
    private String namaMenu;
    private double harga;
    private int jumlah;

    public MenuKafe(String namaMenu, double harga, int jumlah) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public String getNamaMenu() {
        return namaMenu;
    }
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    public double getHarga () {
        return harga;
    }
    public void setHarga (double harga) {
        this.harga = harga;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public void tampilkanInfo() {
        System.out.println("Nama        : " + namaMenu);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah      : " + jumlah);
    }
    public double hitungTotal() {
        return harga * jumlah;
    }
}
