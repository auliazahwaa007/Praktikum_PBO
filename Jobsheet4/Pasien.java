package Jobsheet4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsulltasi;

    public String getNoRekamMedis(){
        return getNoRekamMedis();
    }
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsulltasi = new ArrayList<Konsultasi>();
    }
    public String getInfo() {
        String info = "";
        info += "No Rekam Medis           : " + this.noRekamMedis + "\n";
        info += "Nama                     : " + this.nama + "\n";

        if (!riwayatKonsulltasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatKonsulltasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";
        
        return info;
    }
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal (tanggal);
        konsultasi.setdokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsulltasi.add(konsultasi);
    }
}