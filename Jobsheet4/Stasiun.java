package Jobsheet4;

public class Stasiun {
    private String kodeStasiun;
    private String namaStasiun;
    private String lokasi;

    public Stasiun(String kodeStasiun, String namaStasiun, String lokasi) {
        this.kodeStasiun = kodeStasiun;
        this.namaStasiun = namaStasiun;
        this.lokasi = lokasi;
    }
    public String getKodeStasiun() {
        return kodeStasiun;
    }
    public void setKodeStasiun(String kodeStasiun) {
        this.kodeStasiun = kodeStasiun;
    }
    public String getNamaStasiun() {
        return namaStasiun;
    }
    public void setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }
    public String getLokasi() {
        return lokasi;
    }
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public String getInfo() {
        return namaStasiun + " (" + kodeStasiun + ") - " + lokasi;
    }
}