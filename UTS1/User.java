package UTS1;

public class User {

    public void loginUser(int userId, String password) {
        System.out.println("User dengan ID " + userId
                + " berhasil login.");
    }

    public void recoverPassword() {
        System.out.println("Proses pemulihan password.");
    }

    public void logOut() {
        System.out.println("User berhasil logout.");
    }
}