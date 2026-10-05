package Jobsheet4;
import java.time.LocalDate;
public class StasiunDemo {

    public static void main(String[] args) {

        Stasiun stasiun1 = new Stasiun("S001", "Stasiun Malang", "Malang");
        Stasiun stasiun2 = new Stasiun("S002", "Stasiun Surabaya", "Surabaya");

        PegawaiStasiun pegawai1 = new PegawaiStasiun("P001", "Yoon Jeonghan");
        PegawaiStasiun pegawai2 = new PegawaiStasiun("P002", "Hong Jisoo");

        Pelanggan pelanggan1 = new Pelanggan("PL001", "Park Jimin");
        pelanggan1.tambahTiket("TK001", LocalDate.of(2026, 9, 20), stasiun1, pegawai1);
        pelanggan1.tambahTiket("TK002", LocalDate.of(2026, 9, 21), stasiun2, pegawai2);
        System.out.println(pelanggan1.getInfo());

        Pelanggan pelanggan2 = new Pelanggan("PL002", "Jeon Jungkook");
        System.out.println(pelanggan2.getInfo());
    }
}