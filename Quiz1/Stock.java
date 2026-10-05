package Quiz1;

public class Stock {
    private int quantity;
    private int shopNo;
    private Product product;

    public Stock(int quantity, int shopNo, Product product) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getShopNo() {
        return shopNo;
    }
    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void addStock() {
        System.out.println("Stock berhasil ditambahkan.");
    }
    public void modifyStock(int productId) {
        System.out.println("Stock dengan Product ID " + productId + " berhasil diubah.");
    }
    public void selectStockItem(int productId) {
        System.out.println("Stock dengan Product ID " + productId + " dipilih.");
    }
}
