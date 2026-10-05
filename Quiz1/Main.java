package Quiz1;

public class Main {
    public static void main(String[] args) {

        // Membuat object Customer
        Customer customer1 = new Customer(
            1,
            "Budi",
            "Malang",
            "081234567890"
        );
        // Membuat object Product
        Product product1 = new Product(
            101,
            15000,
            "Makanan"
        );
        // Membuat object Order
        Order order1 = new Order(
            1001,
            30000,
            "25-09-2026",
            customer1
        );
        // Menambahkan product ke dalam order
        order1.addProduct(product1);

        // Menambahkan order ke customer
        customer1.addOrder(order1);

        // Membuat object Stock
        Stock stock1 = new Stock(
            50,
            1,
            product1
        );
        // Memanggil method
        customer1.addCustomer();
        product1.addProduct();
        order1.createOrder();
        stock1.addStock();

        // Menampilkan data
        System.out.println("\n=== DATA CUSTOMER ===");
        System.out.println("ID Customer : " + customer1.getCustomerId());
        System.out.println("Nama        : " + customer1.getCustomerName());
        System.out.println("Alamat      : " + customer1.getAddress());
        System.out.println("Telepon     : " + customer1.getPhone());

        System.out.println("\n=== DATA PRODUCT ===");
        System.out.println("ID Product  : " + product1.getProductId());
        System.out.println("Harga       : " + product1.getProductPrice());
        System.out.println("Jenis       : " + product1.getProductType());

        System.out.println("\n=== DATA ORDER ===");
        System.out.println("ID Order    : " + order1.getOrderId());
        System.out.println("Jumlah      : " + order1.getAmount());
        System.out.println("Tanggal     : " + order1.getOrderDate());

        System.out.println("\n=== DATA STOCK ===");
        System.out.println("Quantity    : " + stock1.getQuantity());
        System.out.println("Shop No     : " + stock1.getShopNo());
        System.out.println("Product ID  : " + stock1.getProduct().getProductId());
    }
}
