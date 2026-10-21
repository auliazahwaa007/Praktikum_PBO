package UTS1;


public class MakananRingan extends Makanan {
    private String rasa;

    public MakananRingan(String nama, double harga, String rasa) {
        super(nama, harga);
        this.rasa = rasa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rasa: " + rasa);
    }

    public void dimakanSaatSantai() {
        System.out.println(getNama() + " cocok dimakan saat santai.");
    }
}

