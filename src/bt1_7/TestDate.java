package bt1_7;

public class TestDate {
    public static void main(String[] args) {
        // Tạo và in ngày đầu tiên
        Date date1 = new Date(1, 2, 2014);
        System.out.println(date1); // In ra: 01/02/2014

        // Tạo và in ngày thứ hai
        Date date2 = new Date(9, 12, 2099);
        System.out.println(date2); // In ra: 09/12/2099

        // In tháng, ngày, năm
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
        System.out.println("Year: " + date2.getYear());

        // Tạo và in ngày thứ ba
        Date date3 = new Date(3, 4, 2016);
        System.out.println(date3); // In ra: 03/04/2016
    }
}
