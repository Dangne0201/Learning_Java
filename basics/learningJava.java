import java.util.Scanner;

public class learningJava {
    public static void main(String[] args) {
        ViDuGoiStudentTuFileKhac.main(args); // Bài 10 minh họa cách dùng Student từ file riêng
    }

    // Class Student được public để class ở file khác có thể dùng.
    public static class Student {
        public String name;
        public int age;

        public void introduce() {
            System.out.println("Mình tên là " + name + ", " + age + " tuổi.");
        }
    }

/*
// Bài cũ: HelloWorld

static class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

// =======================
// Bài 1: Quy tắc khai báo biến
/*
static class Bai01QuyTacKhaiBaoBien {
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

/*
// =======================
// Bài 2: Các phép toán trong Java

static class Bai02CacPhepToan {
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
*/

/*
// =======================
// Bài 3: Nhập dữ liệu từ bàn phím bằng Scanner

    // Mỗi bài là một class lồng bên trong class chính.
    static class Bai03NhapDuLieuScanner {
        public static void main(String[] args) {
            // Scanner giúp chương trình đọc dữ liệu người dùng nhập từ bàn phím.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập tên đầy đủ: ");
            String fullName = scanner.nextLine(); // Đọc cả dòng, có thể chứa dấu cách

            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();          // Đọc một số nguyên

            System.out.print("Nhập chiều cao (m): ");
            double height = scanner.nextDouble(); // Đọc một số thập phân

            // nextInt()/nextDouble() chỉ đọc dữ liệu đến trước dấu xuống dòng.
            // Đọc bỏ phần xuống dòng còn lại trước khi gọi nextLine() tiếp theo.
            scanner.nextLine();

            System.out.print("Nhập môn Java bạn đang học: ");
            String topic = scanner.nextLine();

            System.out.println("\n--- Thông tin vừa nhập ---");
            System.out.println("Tên: " + fullName);
            System.out.println("Tuổi: " + age);
            System.out.println("Chiều cao: " + height + " m");
            System.out.println("Đang học: " + topic);

            // Lưu ý: nhập chữ thay vì số ở tuổi/chiều cao sẽ gây lỗi.
            // Không đóng scanner ở đây vì nó đang đọc System.in của chương trình.
        }
    }
*/

/*
// =======================
// Bài 4: Một số hàm Math thường dùng

    static class Bai04HamMath {
        public static void main(String[] args) {
            // Math có sẵn trong Java nên không cần import thư viện.
            // Gọi hàm theo dạng Math.tenHam(...).

            // 1. Giá trị tuyệt đối: Math.abs(x)
            double negativeNumber = -12.5;
            double absoluteValue = Math.abs(negativeNumber);

            // 2. Tìm số lớn hơn và nhỏ hơn trong hai số
            int firstNumber = 8;
            int secondNumber = 15;
            int largerNumber = Math.max(firstNumber, secondNumber);
            int smallerNumber = Math.min(firstNumber, secondNumber);

            // 3. Lũy thừa và căn bậc hai
            double baseNumber = 2.0;
            double exponent = 3.0;
            double power = Math.pow(baseNumber, exponent);

            double numberForSquareRoot = 81.0;
            double squareRoot = Math.sqrt(numberForSquareRoot);

            // 4. Làm tròn số
            double numberToRound = 4.6;
            long rounded = Math.round(numberToRound); // Làm tròn đến số nguyên gần nhất

            double numberToRoundDown = 4.9;
            double roundedDown = Math.floor(numberToRoundDown); // Làm tròn xuống

            double numberToRoundUp = 4.1;
            double roundedUp = Math.ceil(numberToRoundUp); // Làm tròn lên

            // 5. Tính diện tích hình tròn: PI * bán kính mũ 2
            double radius = 3.0;
            double radiusExponent = 2.0;
            double radiusSquared = Math.pow(radius, radiusExponent);
            double circleArea = Math.PI * radiusSquared;

            // 6. Tạo số ngẫu nhiên từ 1 đến số mặt của xúc xắc
            // Math.random() cho số từ 0.0 (có thể) đến nhỏ hơn 1.0.
            int firstDiceValue = 1;
            int numberOfDiceSides = 6;
            double randomValue = Math.random();
            int diceRoll = (int) (randomValue * numberOfDiceSides) + firstDiceValue;

            System.out.println("Số cần tìm giá trị tuyệt đối: " + negativeNumber);
            System.out.println("Giá trị tuyệt đối: " + absoluteValue);
            System.out.println("Hai số đem so sánh: " + firstNumber + " và " + secondNumber);
            System.out.println("Số lớn hơn: " + largerNumber);
            System.out.println("Số nhỏ hơn: " + smallerNumber);
            System.out.println(baseNumber + " mũ " + exponent + " = " + power);
            System.out.println("Căn bậc hai của " + numberForSquareRoot + " = " + squareRoot);
            System.out.println("Làm tròn " + numberToRound + " gần nhất: " + rounded);
            System.out.println("Làm tròn " + numberToRoundDown + " xuống: " + roundedDown);
            System.out.println("Làm tròn " + numberToRoundUp + " lên: " + roundedUp);
            System.out.println("Bán kính hình tròn: " + radius);
            System.out.println("Diện tích hình tròn: " + circleArea);
            System.out.println("Kết quả gieo xúc xắc: " + diceRoll);

            // Lưu ý: Math.pow và Math.sqrt trả về double.
            // Math.sqrt số âm trả về NaN (không phải một số thực hợp lệ).
        }
    }
*/

/*
// =======================
// Bài 5: Câu điều kiện trong Java

    static class Bai05CauDieuKien {
        public static void main(String[] args) {
            // 1. if: chỉ chạy phần bên trong nếu điều kiện đúng
            int temperature = 32;

            if (temperature >= 30) {
                System.out.println("Trời nóng.");
            }

            // 2. if-else: chọn một trong hai nhánh
            int age = 17;

            if (age >= 18) {
                System.out.println("Đủ 18 tuổi trở lên.");
            } else {
                System.out.println("Chưa đủ 18 tuổi.");
            }

            // 3. if-else if-else: kiểm tra nhiều trường hợp theo thứ tự
            int score = 78;

            if (score >= 90) {
                System.out.println("Xếp loại: A");
            } else if (score >= 80) {
                System.out.println("Xếp loại: B");
            } else if (score >= 70) {
                System.out.println("Xếp loại: C");
            } else {
                System.out.println("Xếp loại: cần cố gắng thêm");
            }

            // 4. Kết hợp điều kiện bằng && (và), || (hoặc), ! (phủ định)
            int requiredAge = 18;
            boolean hasTicket = true;
            boolean meetsAgeRequirement = age >= requiredAge;

            if (meetsAgeRequirement && hasTicket) {
                System.out.println("Được vào xem phim.");
            } else {
                System.out.println("Chưa đủ điều kiện vào xem phim.");
            }

            boolean isRaining = false;
            boolean isHot = temperature >= 30;

            if (isHot || isRaining) {
                System.out.println("Hôm nay thời tiết có thể gây bất tiện.");
            }

            if (!isRaining) {
                System.out.println("Hôm nay trời không mưa.");
            }

            // Lưu ý thường gặp:
            // - Điều kiện trong if phải cho ra true hoặc false.
            // - Dùng == để so sánh; dấu = là phép gán giá trị.
            // - Trong chuỗi else if, kiểm tra trường hợp cụ thể/lớn hơn trước.
            // - Dùng { } để gom các câu lệnh thuộc cùng một nhánh.
        }
    }
*/

/*
// =======================
// Bài 6: Câu lệnh switch

    static class Bai06Switch {
        public static void main(String[] args) {
            // 1. Dùng switch để chọn một trường hợp theo giá trị số nguyên
            int selectedMenu = 2;
            String selectedAction;

            switch (selectedMenu) {
                case 1:
                    selectedAction = "Bắt đầu học";
                    break;
                case 2:
                    selectedAction = "Xem bài học";
                    break;
                case 3:
                    selectedAction = "Thoát chương trình";
                    break;
                default:
                    selectedAction = "Lựa chọn không hợp lệ";
                    break;
            }

            System.out.println("Lựa chọn " + selectedMenu + ": " + selectedAction);

            // 2. switch cũng có thể kiểm tra giá trị String
            String trafficLight = "yellow";
            String instruction;

            switch (trafficLight) {
                case "green":
                    instruction = "Được đi";
                    break;
                case "yellow":
                    instruction = "Đi chậm và chú ý";
                    break;
                case "red":
                    instruction = "Dừng lại";
                    break;
                default:
                    instruction = "Màu đèn không hợp lệ";
                    break;
            }

            System.out.println("Đèn " + trafficLight + ": " + instruction);

            // Lưu ý thường gặp:
            // - Mỗi case là một giá trị cần so sánh với biến trong switch.
            // - break kết thúc switch sau khi chạy xong case phù hợp.
            //   Quên break có thể khiến chương trình chạy tiếp các case phía dưới.
            // - default chạy khi không case nào khớp; đây là phần tùy chọn.
            // - Dùng if khi cần điều kiện dạng khoảng, ví dụ score >= 80.
        }
    }
*/

/*
// =======================
// Bài 7: Vòng lặp for và while

    static class Bai07VongLapForWhile {
        public static void main(String[] args) {
            // 1. for: thường dùng khi biết trước số lần lặp
            // Cấu trúc: for (khởi tạo; điều kiện; bước cập nhật)
            for (int count = 1; count <= 5; count++) {
                System.out.println("for - lần thứ " + count);
            }

            // Dùng for để tính tổng các số từ 1 đến 5
            int sum = 0;

            for (int number = 1; number <= 5; number++) {
                sum = sum + number;
            }

            System.out.println("Tổng từ 1 đến 5: " + sum);

            // 2. while: lặp khi điều kiện còn đúng
            int countdown = 3;

            while (countdown > 0) {
                System.out.println("while - còn " + countdown);
                countdown--;
            }

            System.out.println("Bắt đầu!");

            // while có thể không chạy lần nào nếu điều kiện ban đầu sai
            int startingNumber = 5;

            while (startingNumber < 3) {
                System.out.println("Dòng này sẽ không được in");
                startingNumber++;
            }

            // Lưu ý thường gặp:
            // - for gồm khởi tạo; điều kiện; bước cập nhật, ngăn cách bằng dấu ;
            // - while cần tự cập nhật biến trong thân vòng lặp.
            // - Nếu điều kiện không bao giờ sai, vòng lặp có thể chạy mãi.
            // - Kiểm tra dấu <, <=, >, >= để tránh lặp thiếu hoặc thừa lần.
        }
    }
*/

/*
// =======================
// Bài 8: Mảng một chiều

    static class Bai08Mang {
        public static void main(String[] args) {
            // 1. Tạo mảng có 3 phần tử; các phần tử int ban đầu bằng 0
            int numberOfScores = 3;
            int[] scores = new int[numberOfScores];

            // Chỉ số phần tử bắt đầu từ 0
            scores[0] = 85;
            scores[1] = 92;
            scores[2] = 78;
            System.out.println("Điểm trong mảng tạo bằng new: "
                    + scores[0] + ", " + scores[1] + ", " + scores[2]);

            // 2. Khai báo và gán sẵn các phần tử
            int[] testScores = {85, 92, 78, 100};
            String[] subjects = {"Toán", "Văn", "Java"};

            int firstScore = testScores[0];
            int lastScore = testScores[testScores.length - 1];

            // Có thể thay đổi giá trị phần tử sau khi tạo mảng
            testScores[2] = 80;

            System.out.println("Điểm đầu tiên: " + firstScore);
            System.out.println("Điểm cuối cùng ban đầu: " + lastScore);
            System.out.println("Điểm thứ ba sau khi cập nhật: " + testScores[2]);
            System.out.println("Môn học đầu tiên: " + subjects[0]);
            System.out.println("Số môn học: " + subjects.length);

            // 3. Duyệt mảng bằng for khi cần biết vị trí phần tử
            int totalScore = 0;

            for (int index = 0; index < testScores.length; index++) {
                int currentScore = testScores[index];
                totalScore = totalScore + currentScore;
                System.out.println("Điểm ở vị trí " + index + ": " + currentScore);
            }

            double averageScore = (double) totalScore / testScores.length;
            System.out.println("Điểm trung bình: " + averageScore);

            // 4. Duyệt bằng for-each khi chỉ cần lấy từng giá trị
            for (int currentScore : testScores) {
                System.out.println("Một điểm trong mảng: " + currentScore);
            }

            // Lưu ý thường gặp:
            // - Mảng có độ dài cố định sau khi được tạo.
            // - Chỉ số bắt đầu từ 0; chỉ số cuối là length - 1.
            // - Truy cập testScores[testScores.length] sẽ vượt phạm vi mảng.
            // - length là thuộc tính của mảng, không có dấu ngoặc như length().
            // - Dùng for-each để đọc lần lượt giá trị; dùng for thường khi cần vị trí.
        }
    }
*/

/*
// =======================
// Bài 9: Class và object

    static class Bai09ClassVaObject {
        public static void main(String[] args) {
            // new tạo một object từ class Student.
            Student firstStudent = new Student();
            firstStudent.name = "An";
            firstStudent.age = 20;

            Student secondStudent = new Student();
            secondStudent.name = "Bình";
            secondStudent.age = 21;

            // Mỗi object có dữ liệu riêng, dù được tạo từ cùng một class.
            firstStudent.introduce();
            secondStudent.introduce();
        }
    }
*/

// =======================
// Bài 10: Dùng class Student từ file khác
// Ví dụ chạy thật nằm trong basics/ViDuGoiStudentTuFileKhac.java.
}


