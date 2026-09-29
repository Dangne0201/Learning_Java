/*
Bài cũ: HelloWorld

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

// =======================
// Bài 1: Quy tắc khai báo biến
/*
public class QuytacKhaibaoBien {
    public static void main(String[] args) {
        // Cấu trúc: kiểu dữ liệu + tên biến + giá trị ban đầu;

        // 1. Các kiểu dữ liệu thường dùng
        int age = 20;                         // Số nguyên thường dùng
        long population = 8_000_000_000L;     // Số nguyên lớn; thêm L ở cuối
        double price = 19.99;                 // Số thập phân thường dùng
        float temperature = 36.5f;            // Số thập phân kiểu float; thêm f ở cuối
        char grade = 'A';                     // Một ký tự, đặt trong nháy đơn
        boolean isLearningJava = true;        // Chỉ nhận true hoặc false
        String studentName = "An";            // Chuỗi ký tự, đặt trong nháy kép

        // 2. Khai báo trước, gán giá trị sau
        int numberOfLessons;
        numberOfLessons = 1;
        // Phải gán giá trị trước khi dùng biến cục bộ.

        // 3. Thay đổi giá trị của biến
        age = 21;

        // 4. Biến không cho phép đổi giá trị sau khi gán
        final double PI = 3.14159;

        // 5. Lưu ý thường gặp
        // - Java phân biệt chữ hoa/chữ thường: age và Age là hai tên khác nhau.
        // - Tên biến không có dấu cách, không bắt đầu bằng số và không dùng từ khóa Java.
        //   Ví dụ không hợp lệ: 1age, student name, class.
        // - Thường viết tên biến theo camelCase: studentName, numberOfLessons.
        // - char dùng nháy đơn ('A'); String dùng nháy kép ("An"). String viết hoa chữ S.
        // - Số nguyên lớn cần hậu tố L; số thực kiểu float cần hậu tố f.
        // - Số thập phân mặc định là double, ví dụ 19.99.
        // - Biến cục bộ phải được gán giá trị trước khi đọc hoặc in ra.
        // - Dấu = dùng để gán giá trị; final ngăn biến được gán lại.
        //   Ví dụ sau sẽ báo lỗi nếu bỏ comment: PI = 3.14;
        // - Giá trị gán phải phù hợp với kiểu dữ liệu; ví dụ không thể gán 19.99 cho int.

        // Dấu + trong các dòng dưới ghép phần chữ với giá trị biến.
        System.out.println("Tuổi: " + age);
        System.out.println("Dân số: " + population);
        System.out.println("Giá: " + price);
        System.out.println("Nhiệt độ: " + temperature);
        System.out.println("Xếp loại: " + grade);
        System.out.println("Đang học Java: " + isLearningJava);
        System.out.println("Tên học viên: " + studentName);
        System.out.println("Số bài đã học: " + numberOfLessons);
        System.out.println("Số PI: " + PI);
    }
}
*/

// =======================
// Bài 2: Các phép toán trong Java

class CacPhepToan {
    public static void main(String[] args) {
        // 1. Các phép toán số học
        int firstNumber = 10;
        int secondNumber = 3;

        int sum = firstNumber + secondNumber;                  // Cộng: 13
        int difference = firstNumber - secondNumber;           // Trừ: 7
        int product = firstNumber * secondNumber;              // Nhân: 30
        int integerDivision = firstNumber / secondNumber;      // Chia số nguyên: 3
        int remainder = firstNumber % secondNumber;            // Chia lấy dư: 1
        double decimalDivision = 10.0 / secondNumber;          // Chia số thập phân: 3.333...

        // 2. Thứ tự tính toán và dấu ngoặc
        int normalOrder = 2 + 3 * 4;           // Nhân trước, kết quả là 14
        int withParentheses = (2 + 3) * 4;     // Trong ngoặc trước, kết quả là 20

        // 3. Gán kết hợp với phép toán
        int points = 10;
        points += 5;    // Tương đương points = points + 5; kết quả là 15
        points -= 2;    // Tương đương points = points - 2; kết quả là 13
        points *= 3;    // Tương đương points = points * 3; kết quả là 39
        points /= 2;    // Chia số nguyên, kết quả là 19
        points %= 4;    // Lấy phần dư, kết quả cuối cùng là 3

        // 4. Tăng và giảm một đơn vị
        int count = 5;
        count++;        // Tăng count lên 1, thành 6
        count--;        // Giảm count đi 1, trở lại 5

        // 5. Phép so sánh: kết quả luôn là true hoặc false
        boolean isEqual = firstNumber == secondNumber;
        boolean isNotEqual = firstNumber != secondNumber;
        boolean isGreater = firstNumber > secondNumber;
        boolean isLess = firstNumber < secondNumber;
        boolean isAtLeast = firstNumber >= 10;
        boolean isAtMost = secondNumber <= 3;

        // 6. Phép logic trên các giá trị boolean
        boolean isAdult = 20 >= 18;
        boolean hasTicket = true;
        boolean canEnterWithBoth = isAdult && hasTicket;  // &&: cả hai đều true
        boolean canEnterWithEither = isAdult || hasTicket; // ||: ít nhất một vế true
        boolean isNotAdult = !isAdult;                    // !: đảo true thành false

        // In kết quả để quan sát các phép toán
        System.out.println("Cộng: " + sum);
        System.out.println("Trừ: " + difference);
        System.out.println("Nhân: " + product);
        System.out.println("Chia số nguyên 10 / 3: " + integerDivision);
        System.out.println("Chia số thập phân 10.0 / 3: " + decimalDivision);
        System.out.println("Số dư 10 % 3: " + remainder);
        System.out.println("Thứ tự phép tính: " + normalOrder);
        System.out.println("Có ngoặc: " + withParentheses);
        System.out.println("Điểm sau các phép gán kết hợp: " + points);
        System.out.println("Giá trị count sau tăng rồi giảm: " + count);
        System.out.println("10 có bằng 3 không? " + isEqual);
        System.out.println("10 có khác 3 không? " + isNotEqual);
        System.out.println("10 lớn hơn 3 không? " + isGreater);
        System.out.println("10 nhỏ hơn 3 không? " + isLess);
        System.out.println("10 có ít nhất bằng 10 không? " + isAtLeast);
        System.out.println("3 có nhiều nhất bằng 3 không? " + isAtMost);
        System.out.println("Cần cả người lớn và vé: " + canEnterWithBoth);
        System.out.println("Chỉ cần một trong hai: " + canEnterWithEither);
        System.out.println("Không phải người lớn: " + isNotAdult);

        // Lưu ý thường gặp:
        // - Dấu = dùng để gán; == dùng để so sánh hai giá trị.
        // - Chia hai số nguyên sẽ bỏ phần thập phân: 10 / 3 cho kết quả 3.
        //   Muốn có phần thập phân, ít nhất một số phải là double/float: 10.0 / 3.
        // - Không chia số nguyên cho 0; Java sẽ báo lỗi khi chạy.
        // - % là phép chia lấy phần dư, không phải phép tính phần trăm.
        // - + giữa hai số là cộng; nếu có String thì + có thể dùng để nối chuỗi.
        // - == với String không dùng để so sánh nội dung; sẽ học cách so sánh chuỗi sau.
    }
}


