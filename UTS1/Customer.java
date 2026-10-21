package UTS1;

public class Customer extends User {

    private boolean verification_status = false;

    public boolean getVerificationStatus() {
        return verification_status;
    }

    public void applyVerification(String doc) {
        System.out.println("Pengajuan verifikasi dokumen: "
                + doc);
        System.out.println("Menunggu verifikasi admin.");
    }
}