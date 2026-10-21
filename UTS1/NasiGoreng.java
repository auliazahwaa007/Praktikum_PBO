package UTS1;


public class NasiGoreng extends MakananBerat {
    private String tingkatKepedasan;
    private boolean pedas;

    public NasiGoreng(String nama, double harga,
                      String karbohidrat,
                      String tingkatKepedasan,
                      boolean pedas) {
        super(nama, harga, karbohidrat);
        this.tingkatKepedasan = tingkatKepedasan;
        this.pedas = pedas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tingkat Kepedasan: " + tingkatKepedasan);
        System.out.println("Pedas: " + (pedas ? "Ya" : "Tidak"));
    }

    public void masak() {
        System.out.println("Nasi goreng sedang dimasak.");
        System.out.println("Tingkat kepedasan: " + tingkatKepedasan);
    }
}

