package Quiz1;
public class Product {
    private int productId;
    private float productPrice;
    private String productType;

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public float getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public void addProduct() {
        System.out.println("Product berhasil ditambahkan.");
    }
    public void modifyProduct() {
        System.out.println("Product berhasil diubah.");
    }
    public void selectProduct(int productId) {
        System.out.println("Product dengan ID " + productId + " dipilih.");
    }
}
