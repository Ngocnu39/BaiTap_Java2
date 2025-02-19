package bt1_5;

public class TestInvoiceItem {

    public static void main(String[] args) {
        // Khởi tạo mặt hàng hóa đơn
        InvoiceItem item1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(item1); // In thông tin mặt hàng

        // Cập nhật số lượng và giá
        item1.setQuantity(999);
        item1.setUnitPrice(0.99);
        System.out.println(item1); // In lại thông tin mặt hàng

        // In thông tin chi tiết
        System.out.println("id is: " + item1.getId());
        System.out.println("desc is: " + item1.getDescription());
        System.out.println("qty is: " + item1.getQuantity());
        System.out.println("unitPrice is: " + item1.getUnitPrice());

        // Tính và in tổng giá trị
        System.out.printf("The total is: %.2f%n", item1.getTotalPrice());
    }
}

