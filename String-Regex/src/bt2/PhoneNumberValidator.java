package bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    // Phương thức kiểm tra tính hợp lệ của số điện thoại
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy kiểm tra tính hợp lệ
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

        // Biên dịch regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        // Trả về kết quả kiểm tra
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Danh sách số điện thoại để kiểm tra
        String[] testPhoneNumbers = {
                "(84)-(0978489648)",  // Hợp lệ
                "(a8)-(22222222)",    // Không hợp lệ
                "(84)-(22b22222)",    // Không hợp lệ
                "(84)-(9978489648)"   // Không hợp lệ
        };

        // Kiểm tra từng số điện thoại và in kết quả
        for (String phoneNumber : testPhoneNumbers) {
            System.out.println("Số điện thoại: " + phoneNumber + " - Hợp lệ: " + isValidPhoneNumber(phoneNumber));
        }

    }
}
