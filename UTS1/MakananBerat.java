package UTS1;


public class MakananBerat extends Makanan {
    private String karbohidrat;

    public MakananBerat(String nama, double harga, String karbohidrat) {
        super(nama, harga);
        this.karbohidrat = karbohidrat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Karbohidrat: " + karbohidrat);
    }

    public void makanDenganNasi() {
        System.out.println(getNama() + " merupakan makanan berat.");
    }
}

