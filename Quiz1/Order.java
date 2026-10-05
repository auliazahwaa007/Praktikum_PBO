package Quiz1;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private float amount;
    private String orderDate;

    private Customer customer;
    private ArrayList<Product> products;

    public Order(int orderId, float amount, String orderDate, Customer customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void createOrder() {
        System.out.println("Order berhasil dibuat.");
    }
    public void editOrder(int orderId) {
        System.out.println("Order dengan ID " + orderId + " berhasil diubah.");
    }
}
