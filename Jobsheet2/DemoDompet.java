package Jobsheet2;

public class DemoDompet {
    public static void main(String[] args) {
        Dompet dompet1 = new Dompet();

        dompet1.merk = "Connexion";
        dompet1.bahan = "Kulit";
        dompet1.warna = "Hitam";
        dompet1.banyakUang = 1250000;
        dompet1.banyakKartu = 3;
        
        //dompet1.membukaDompet(true);
        dompet1.info();
        dompet1.bukaDompet();
        dompet1.tambahUang(50000);
        dompet1.ambilUang(300000);
        dompet1.tambahKartu(2);
        dompet1.ambilKartu(1);
        dompet1.tutupDompet();
        System.out.println();

        Dompet dompet2 = new Dompet();
        dompet2.merk = "Miniso";
        dompet2.bahan = "Kulit Sintetis";
        dompet2.warna = "Lilac";
        dompet2.banyakUang = 750000;
        dompet2.banyakKartu = 4;
        
        //dompet2.membukaDompet(true);
        dompet2.info();
        dompet2.bukaDompet();
        dompet2.tambahUang(50000);
        dompet2.ambilUang(100000);
        dompet2.tambahKartu(3);
        dompet2.ambilKartu(2);
        dompet2.tutupDompet();
        System.out.println();
    }
}
