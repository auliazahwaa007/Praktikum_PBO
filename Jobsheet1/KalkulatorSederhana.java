import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama : ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /) : ");
        operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        angka2 = sc.nextDouble();

        hasil = hitung(angka1, operator, angka2);

        System.out.println("Hasil : " + hasil);

        sc.close();
    }

    public static double hitung(double angka1, char operator, double angka2) {
        double hasil = 0;
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("Operator tidak valid!!");
        }
        return hasil;
    }
}
