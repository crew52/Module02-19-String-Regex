package bt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    // Phương thức kiểm tra tính hợp lệ của tên lớp
    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ
        String regex = "^[CAP][0-9]{4}[GHIK]$";

        // Biên dịch Regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);

        // Trả về kết quả kiểm tra
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Các tên lớp cần kiểm tra
        String[] testClassNames = {"C0223G", "A0323K", "M0318G", "P0323A"};

        // Kiểm tra từng tên lớp
        for (String className : testClassNames) {
            System.out.println("Tên lớp: " + className + " - Hợp lệ: " + isValidClassName(className));
        }
    }
}
