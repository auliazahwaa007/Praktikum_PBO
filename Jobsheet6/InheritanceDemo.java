package Jobsheet6;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Dosen dosen1 = new Dosen();
        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";
        Dosen dosen2 = new Dosen("1234567890", "Park Jimin", 3000000, "1234");
        System.out.println(dosen2.getAllInfo());
    }
}