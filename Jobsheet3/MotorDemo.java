package Jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();
        Motor motor3 = new Motor();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(false);
        motor1.setKecepatan(50);

        motor2.setPlatNomor("N 1234 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(70);

        motor3.setPlatNomor("D 8343 CV");
        motor3.setIsMesinOn(false);
        motor3.setKecepatan(30);

        System.out.println("\nStatus Motor 1");
        motor1.displayStatus();

        System.out.println("\nStatus Motor 2");
        motor2.displayStatus();

        System.out.println("\nStatus Motor 3");
        motor3.displayStatus();
    }
}
    
    //     Motor motor1 = new Motor();
    //     motor1.displayStatus();
    //     motor1.platNomor = "B 0838 XZ";

    //     int kecepatanBaru = 50;
    //     if (!motor1.isMesinOn && kecepatanBaru > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     }
    //     else{
    //         motor1.kecepatan = kecepatanBaru;
    //     }
    //     motor1.displayStatus();

    //     Motor motor2 = new Motor();
    //     motor2.platNomor = "N 9840 AB";
    //     motor2.isMesinOn = true;
    //     kecepatanBaru = 40;
    //     if (!motor2.isMesinOn && kecepatanBaru > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     }
    //     else{
    //         motor2.kecepatan = kecepatanBaru;
    //     }
    //     motor2.displayStatus();

    //     Motor motor3 = new Motor();
    //     motor3.platNomor = "D 8343 CV";
    //     kecepatanBaru = 60;
    //     if (!motor3.isMesinOn && kecepatanBaru > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     }
    //     else{
    //         motor3.kecepatan = kecepatanBaru;
    //     }
    //     motor3.displayStatus();
    // }