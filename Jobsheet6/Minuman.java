package Jobsheet6;

public class Minuman extends MenuKafe {
    private String suhu;
    private String ukuran;

    public Minuman(String nama, double harga, int jumlah, String suhu, String ukuran) {
        super(nama, harga, jumlah);
        this.suhu = suhu;
        this.ukuran = ukuran;
    }
    public String getSuhu() {
        return suhu;
    }
    public void setSuhu(String suhu) {
        this.suhu = suhu;
    }
    public String getUkuran() {
        return ukuran;
    }
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    public void tampilInfoMinuman () {
        System.out.println("Suhu        : " + suhu);
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Total       : " + hitungTotal());
    }
}
