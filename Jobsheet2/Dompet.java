package Jobsheet2;

public class Dompet {
    public String merk;
    public String warna;
    public String bahan;
    public double banyakUang;
    public int banyakKartu;
    // public boolean isStatusBuka;
    // public boolean isStatusTutup;

    // public boolean membukaDompet(boolean terbuka) {
    //     isStatusBuka = terbuka;
    //     isStatusTutup = !terbuka;
    //     return isStatusBuka;
    // }
    public void bukaDompet() {
        System.out.println("Dompet dibuka");
    }

    public void tutupDompet() {
        System.out.println("Dompet ditutup");
    }
    public void tambahUang(double jumlah) {
        banyakUang += jumlah;
        System.out.println("Menambah uang sebesar RP" + jumlah);
    }
    public void ambilUang(double jumlah) {
        banyakUang -= jumlah;
        System.out.println("Ambil uang sebesar Rp" + jumlah);
    }
    public void tambahKartu(int jumlah){
        banyakKartu += jumlah;
        System.out.println("Menambah " + jumlah + " kartu");
    }
    public void ambilKartu(int jumlah){
        banyakKartu -= jumlah;
        System.out.println("Ambil " + jumlah + " kartu");
    }
    // public boolean menutupDompet(boolean menutup) {
    //     isStatusTutup = menutup;
    //     isStatusBuka = !menutup;
    //     return isStatusTutup;
    // }
    public void info(){
        System.out.println("Merk            : " + merk);
        System.out.println("Bahan           : " + bahan);
        System.out.println("Warna           : " + warna);
        System.out.println("Banyak Uang     : " + banyakUang);
        System.out.println("Banyak Kartu    : " + banyakKartu);
        // System.out.println("Status Terbuka  : " + isStatusBuka);
        // System.out.println("Status Tertutup : " + isStatusTutup);
    }
}
