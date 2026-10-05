package Jobsheet4;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Tiket> daftarTiket;

    public String getIdPelanggan() {
        return this.idPelanggan;
    }
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarTiket = new ArrayList<Tiket>();
    }
    public String getInfo() {
        String info = "";
        info += "ID Pelanggan            : " + this.idPelanggan + "\n";
        info += "Nama                    : " + this.nama + "\n";
        if (!daftarTiket.isEmpty()) {
            info += "Daftar Tiket :\n";
            for (Tiket tiket : daftarTiket) {
                info += tiket.getInfo();
            }
        } else {
            info += "Belum ada tiket";
        }

        info += "\n";
        return info;
    }
    public void tambahTiket(String kodeTiket, LocalDate tanggal, Stasiun stasiun, PegawaiStasiun pegawai) {
        Tiket tiket = new Tiket();
        tiket.setKodeTiket(kodeTiket);
        tiket.setTanggal(tanggal);
        tiket.setStasiun(stasiun);
        tiket.setPegawai(pegawai);
        daftarTiket.add(tiket);
    }
}