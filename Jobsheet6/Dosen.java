package Jobsheet6;

public class Dosen extends Pegawai {
    public String nidn;
    
    // public Dosen() {
    //     System.out.println("Objek dari class Dosen dibuat");
    // }
    public  Dosen(String nip, String nama, double gaji, String nidn){
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN        : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN       : " + nidn;
        return info;
    }
}
// package Jobsheet6;

// public class Dosen extends Pegawai {

//     public String nidn;

//     public Dosen() {
//         System.out.println("Objek dari class Dosen dibuat");
//     }

//     public Dosen(String nip, String nama, double gaji, String nidn) {
//         this.nip = nip;
//         this.nama = nama;
//         this.gaji = gaji;
//         this.nidn = nidn;

//         System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
//     }

//     public String getInfo() {
//         return "NIDN        : " + this.nidn + "\n";
//     }

//     public String getAllInfo() {
//         String info = super.getInfo();
//         info += "NIDN       : " + nidn;
//         return info;
//     }
// }

//         // info += "NIP        : " + super.nip + "\n";
//         // info += "Nama       : " + super.nama + "\n";
//         // info += "Gaji       : " + super.gaji + "\n";
//         // info += "NIDN       : " + super.nidn + "\n";
//         // info += "NIP        : " + nip + "\n";
//         // info += "Nama       : " + nama + "\n";
//         // info += "Gaji       : " + gaji + "\n";
//         // info += "NIP        : " + this.nip + "\n";
//         // info += "Nama       : " + this.nama + "\n";
//         // info += "Gaji       : " + this.gaji + "\n";
//         // info += "NIDN       : " + this.nidn + "\n";



