import java.util.Scanner;

public class ViDuGoiStudentTuFileKhac {
    public static void main(String[] args) {
        // Student được khai báo bên trong learningJava.java.
        // Vì Student là public static, file này tạo được object qua learningJava.Student.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học viên: ");
        String enteredName = scanner.nextLine();

        System.out.print("Nhập môn học yêu thích: ");
        String enteredFavoriteSubject = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int enteredAge = scanner.nextInt();

        // Truyền dữ liệu vào hàm tạo để khởi tạo các thuộc tính của object.
        learningJava.Student student = new learningJava.Student(
                enteredName,
                enteredFavoriteSubject,
                enteredAge);

        // Phương thức void tự in ra màn hình và không trả dữ liệu về.
        student.introduce();

        // Phương thức trả về String; file gọi quyết định sẽ dùng kết quả thế nào.
        String introduction = student.getIntroduction();
        System.out.println("Lời giới thiệu nhận về: " + introduction);

        // Phương thức trả về boolean.
        boolean isAdult = student.isAdult();
        System.out.println("Đã đủ 18 tuổi: " + isAdult);

        // Phương thức nhận một int và trả về một int.
        int yearsFromNow = 5;
        int ageInFiveYears = student.calculateAgeIn(yearsFromNow);
        System.out.println("Tuổi sau " + yearsFromNow + " năm: " + ageInFiveYears);
    }
}

// Class top-level khác ở file này, cùng package với learningJava.
class AccessModifierExample {
    public static void showAccessLevels() {
        learningJava.AccessSample sample = new learningJava.AccessSample();

        System.out.println("public truy cập được: " + sample.publicValue);
        System.out.println("protected truy cập được trong cùng package: " + sample.protectedValue);
        System.out.println("Không ghi modifier, cùng package truy cập được: " + sample.packageValue);

        // Không thể truy cập sample.privateValue trực tiếp từ class này.
        // Dùng phương thức public do AccessSample cung cấp để đọc giá trị đó.
        int privateValue = sample.getPrivateValue();
        System.out.println("Đọc private qua getter public: " + privateValue);
    }

    // Method nay o class/file khac, minh hoa cach dung object da dong goi.
    // Getter dung de doc du lieu; setter dung de yeu cau thay doi du lieu.
    public static void showEncapsulation() {
        String initialName = "Mai";
        int initialAge = 20;
        learningJava.EncapsulatedStudent student =
                new learningJava.EncapsulatedStudent(initialName, initialAge);

        System.out.println("Tên ban đầu: " + student.getName());
        System.out.println("Tuổi ban đầu: " + student.getAge());

        String updatedName = "Hà";
        student.setName(updatedName);
        int updatedAge = 21;
        student.setAge(updatedAge);
        System.out.println("Sau khi cập nhật: " + student.getName()
                + ", " + student.getAge() + " tuổi");

        // Setter tu kiem tra va tu choi tuoi am, nen age van giu gia tri 21.
        int invalidAge = -3;
        student.setAge(invalidAge);
        System.out.println("Sau khi thử nhập tuổi âm: " + student.getAge());

        // Không thể viết student.age = 25; vì age là private.
    }

}
