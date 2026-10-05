package Jobsheet6;

public class Makanan extends MenuKafe {
    private String jenis;
    private int levelPedas;
    
    public Makanan(String nama, double harga, int jumlah, String jenis, int levelPedas) {
        super(nama, harga, jumlah);
        this.jenis = jenis;
        this.levelPedas = levelPedas;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public int getLevelPedas() {
        return levelPedas;
    }
    public void setLevelPedas(int levelPedas) {
        this.levelPedas = levelPedas;
    }
    public void tampilInfoMakanan() {
        System.out.println("Jenis       : " + jenis);
        System.out.println("Level Pedas : " + levelPedas);
        System.out.println("Total       : " + hitungTotal());
    }
}
