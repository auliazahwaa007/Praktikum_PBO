package Jobsheet4;

import java.time.LocalDate;

public class Tiket {
    private String kodeTiket;
    private LocalDate tanggal;
    private Stasiun stasiun;
    private PegawaiStasiun pegawai;

    public String getKodeTiket() {
        return kodeTiket;
    }
    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }
    public LocalDate getTanggal() {
        return tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    public Stasiun getStasiun() {
        return stasiun;
    }
    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }
    public PegawaiStasiun getPegawai() {
        return pegawai;
    }
    public void setPegawai(PegawaiStasiun pegawai) {
        this.pegawai = pegawai;
    }
    public String getInfo() {
        String info = "";
        info += "\tKode Tiket: " + kodeTiket;
        info += ", Tanggal: " + tanggal;
        info += ", Stasiun: " + stasiun.getInfo();
        info += ", Pegawai: " + pegawai.getInfo();
        info += "\n";
        return info;
    }
}