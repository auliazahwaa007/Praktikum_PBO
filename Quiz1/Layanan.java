package Quiz1;

public class Layanan {
    private String serviceName;
    private double servicePrice;
    private Karyawan karyawan;

    public Layanan(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public double getServicePrice() {
        return servicePrice;
    }
    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }
    public Karyawan getKaryawan() {
        return karyawan;
    }
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }
}