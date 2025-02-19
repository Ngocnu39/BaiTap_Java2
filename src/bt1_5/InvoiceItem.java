package bt1_5;

public class InvoiceItem {
    private String id;          // ID của mặt hàng
    private String description; // Mô tả
    private int quantity;       // Số lượng
    private double unitPrice;   // Giá đơn vị

    // Constructor
    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    // Getter cho ID
    public String getId() {
        return id;
    }

    // Getter cho mô tả
    public String getDescription() {
        return description;
    }

    // Getter cho số lượng
    public int getQuantity() {
        return quantity;
    }

    // Setter cho số lượng
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    // Getter cho giá đơn vị
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter cho giá đơn vị
    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    // Tính tổng giá trị của mặt hàng
    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    // Phương thức toString để in thông tin mặt hàng
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + description +
                ",qty=" + quantity + ",unitPrice=" + unitPrice + "]";
    }
}

