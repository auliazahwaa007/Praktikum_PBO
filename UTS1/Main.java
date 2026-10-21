package UTS1;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== USER PROFILE ===");
        UserProfile profile = new UserProfile(
                101,
                "password123",
                "Andi",
                19,
                "andi@gmail.com",
                "KTP.pdf"
        );

        System.out.println("ID: " + profile.getUserId());
        System.out.println("Nama: " + profile.getName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Email: " + profile.getEmail());
        profile.editProfile();
        profile.showDocuments();

        System.out.println();

        System.out.println("=== CUSTOMER ===");
        Customer customer = new Customer();
        customer.loginUser(101, "password123");
        customer.applyVerification("KTP.pdf");
        System.out.println("Status verifikasi: "
                + customer.getVerificationStatus());
        customer.logOut();

        System.out.println();

        System.out.println("=== ADMIN ===");
        Admin admin = new Admin();
        admin.loginUser(1, "admin123");
        admin.updateVehicleDetails(101);

        Vehicle kendaraan = admin.addVehicle();
        kendaraan.tampilkanInfo();

        admin.retrieveComplain();
        admin.verifyUser();
        admin.recoverPassword();
        admin.logOut();
    }
}

