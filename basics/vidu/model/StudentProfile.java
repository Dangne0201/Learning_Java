package vidu.model; // Dòng package phải đứng trước khai báo class

public class StudentProfile {
    private String name; // private chỉ cho class StudentProfile truy cập trực tiếp

    public StudentProfile(String name) {
        this.name = name;
    }

    public String getName() {
        // Class ở package khác không đọc name trực tiếp, nên dùng phương thức public.
        return name;
    }
}
