package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "12345";
        m2.nama = "Akmalia Rima";
        m2.alamat = "Bangil, Pasuruan";
        m2.kelas = "2F";

        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023432";
        m3.nama = "Nindya Auliya";
        m3.alamat = "Kediri, Jateng";
        m3.kelas = "2F";

        m3.displayBiodata();
    }
}
