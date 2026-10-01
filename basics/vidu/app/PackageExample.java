package vidu.app; // Thuộc package vidu.app, tương ứng thư mục vidu/app

import vidu.model.StudentProfile; // Cho phép dùng tên StudentProfile bên dưới

public class PackageExample {
    public static void showExample() {
        // Tạo dữ liệu trước, sau đó truyền vào hàm tạo.
        String studentName = "An";
        StudentProfile profile = new StudentProfile(studentName);

        // getName() là public nên class từ package khác có thể gọi.
        System.out.println("Tên lấy từ class trong package vidu.model: " + profile.getName());
    }
}
