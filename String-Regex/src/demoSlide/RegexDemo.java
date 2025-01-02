package demoSlide;

import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        // Biên dịch chuỗi Regex (regex) thành một đối tượng có thể sử dụng để khớp mẫu.
        Pattern pattern = Pattern.compile(regex);
        // Khởi tạo matcher để kiểm tra chuỗi email với mẫu Regex đã biên dịch.
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ!");
        }

//        Pattern p = Pattern.compile(".s");
//        Matcher m = p.matcher("as");
//        boolean b = m.matches(); // Kết quả: true
//        System.out.println(b);
//
//        boolean b2 = Pattern.compile(".s").matcher("as").matches(); // Kết quả: true
////
//        boolean b3 = Pattern.matches(".s", "as"); // Kết quả: true
    }
}
