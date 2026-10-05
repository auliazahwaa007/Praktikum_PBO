package Quiz1;

public class Karyawan {
    private int idKaryawan;
    private String namaKaryawan;
    private String jabatan;

    public Karyawan(int idKaryawan, String namaKaryawan, String jabatan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }
    public int getIdKaryawan() {
        return idKaryawan;
    }
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void tampilkanInfo() {
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama        : " + namaKaryawan);
        System.out.println("Jabatan     : " + jabatan);
    }
}