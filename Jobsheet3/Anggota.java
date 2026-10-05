package Jobsheet3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double uang) {
        if (jumlahPinjaman + uang <= limitPeminjaman) {
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(double uang) {
        if (uang >= jumlahPinjaman * 0.1) {
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}

//     private String nomorKTP;
//     private String nama;
//     private double limitPeminjaman;
//     private double jumlahPinjaman;

//     public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
//         this.nomorKTP = nomorKTP;
//         this.nama = nama;
//         this.limitPeminjaman = limitPeminjaman;
//         this.jumlahPinjaman = 0;
//     }

//     public String getNomorKTP() {
//         return nomorKTP;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getLimitPinjaman() {
//         return limitPeminjaman;
//     }

//     public double getJumlahPinjaman() {
//         return jumlahPinjaman;
//     }

//     public void pinjam(double uang) {
//         if (jumlahPinjaman + uang <= limitPeminjaman) {
//             jumlahPinjaman += uang;
//         } else {
//             System.out.println("Maaf, jumlah pinjaman melebihi limit");
//         }
//     }

//     public void angsur(double uang) {
//         jumlahPinjaman -= uang;
//     }