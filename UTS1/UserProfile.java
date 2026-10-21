package UTS1;

public class UserProfile {

    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    private User user;

    public UserProfile(int user_id, String password,
                       String name, int age,
                       String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
        this.user = new User();
    }

    public int getUserId() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email_id;
    }

    public void editProfile() {
        System.out.println("Profil " + name
                + " berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Dokumen pengguna: " + doc);
    }
}

