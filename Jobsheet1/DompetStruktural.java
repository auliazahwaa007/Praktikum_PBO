public class DompetStruktural {
    public static void main(String[] args) {
        String merk, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        String warna, warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
        String bahan, bahan2, bahan3, bahan4, bahan5, bahan6, bahan7, bahan8, bahan9, bahan10;
        int jmlUang, jmlUang2, jmlUang3, jmlUang4, jmlUang5, jmlUang6, jmlUang7, jmlUang8, jmlUang9, jmlUang10;

        merk = "Miniso";
        warna = "Lilac";
        bahan = "Serat karbon";
        jmlUang = 700000;

        merk2 = "Connexion";
        warna2 = "Coklat";
        bahan2 = "Kanvas";
        jmlUang2 = 1250000;

        merk3 = "Oneda";
        warna3 = "Putih";
        bahan3 = "Kulit Sintetis";
        jmlUang3 = 930000;

        merk4 = "Hush Puppies";
        warna4 = "Biru";
        bahan4 = "Kanvas";
        jmlUang4 = 800000;

        merk5 = "Miniso";
        warna5 = "Pink";
        bahan5 = "Kulit Sintetis";
        jmlUang5 = 750000;

        merk6 = "Eiger";
        warna6 = "Army";
        bahan6 = "Kulit";
        jmlUang6 = 550000;

        merk7 = "Connexion";
        warna7 = "Hitam";
        bahan7 = "Kulit";
        jmlUang7 = 950000;

        merk8 = "Oneda";
        warna8 = "Cream";
        bahan8 = "Kanvas";
        jmlUang8 = 300000;

        merk9 = "Hush Puppies";
        warna9 = "Pink";
        bahan9 = "Serat karbon";
        jmlUang9 = 980000;

        merk10 = "Miniso";
        warna10 = "Biru";
        bahan10 = "Kulit Sintetis";
        jmlUang10 = 670000;

        jmlUang = tambahUang(jmlUang, 35000);
        jmlUang2 = tambahUang(jmlUang2, 200000);
        jmlUang3 = kurangiUang(jmlUang3, 45000);
        jmlUang4 = tambahUang(jmlUang4, 500000);
        jmlUang5 = kurangiUang(jmlUang5, 35000);
        jmlUang6 = kurangiUang(jmlUang6, 78000);
        jmlUang7 = tambahUang(jmlUang7, 530000);
        jmlUang8 = kurangiUang(jmlUang8, 65000);
        jmlUang9 = tambahUang(jmlUang9, 350000);
        jmlUang10 = kurangiUang(jmlUang10, 5000);

        System.out.println("===== DATA DOMPET =====");
        System.out.println("Dompet 1");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Bahan       : " + bahan);
        System.out.println("Jumlah Uang : " + jmlUang);

        System.out.println("Dompet 2");
        System.out.println("Merk        : " + merk2);
        System.out.println("Warna       : " + warna2);
        System.out.println("Bahan       : " + bahan2);
        System.out.println("Jumlah Uang : " + jmlUang2);

        System.out.println("Dompet 3");
        System.out.println("Merk        : " + merk3);
        System.out.println("Warna       : " + warna3);
        System.out.println("Bahan       : " + bahan3);
        System.out.println("Jumlah Uang : " + jmlUang3);

        System.out.println("Dompet 4");
        System.out.println("Merk        : " + merk4);
        System.out.println("Warna       : " + warna4);
        System.out.println("Bahan       : " + bahan4);
        System.out.println("Jumlah Uang : " + jmlUang4);

        System.out.println("Dompet 5");
        System.out.println("Merk        : " + merk5);
        System.out.println("Warna       : " + warna5);
        System.out.println("Bahan       : " + bahan5);
        System.out.println("Jumlah Uang : Rp" + jmlUang5);

        System.out.println("Dompet 6");
        System.out.println("Merk        : " + merk6);
        System.out.println("Warna       : " + warna6);
        System.out.println("Bahan       : " + bahan6);
        System.out.println("Jumlah Uang : Rp" + jmlUang6);

        System.out.println("Dompet 7");
        System.out.println("Merk        : " + merk7);
        System.out.println("Warna       : " + warna7);
        System.out.println("Bahan       : " + bahan7);
        System.out.println("Jumlah Uang : Rp" + jmlUang7);

        System.out.println("Dompet 8");
        System.out.println("Merk        : " + merk8);
        System.out.println("Warna       : " + warna8);
        System.out.println("Bahan       : " + bahan8);
        System.out.println("Jumlah Uang : Rp" + jmlUang8);

        System.out.println("Dompet 9");
        System.out.println("Merk        : " + merk9);
        System.out.println("Warna       : " + warna9);
        System.out.println("Bahan       : " + bahan9);
        System.out.println("Jumlah Uang : Rp" + jmlUang9);

        System.out.println("Dompet 10");
        System.out.println("Merk        : " + merk10);
        System.out.println("Warna       : " + warna10);
        System.out.println("Bahan       : " + bahan10);
        System.out.println("Jumlah Uang : Rp" + jmlUang10);
    }
    public static int tambahUang(int jmlUang, int increment){
        jmlUang += increment;
        return  jmlUang;
    }
    public static int kurangiUang(int jmlUang, int decrement){
        jmlUang -= decrement;
        return jmlUang;
    }
}
