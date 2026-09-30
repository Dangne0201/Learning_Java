public class ViDuGoiStudentTuFileKhac {
    public static void main(String[] args) {
        // Student được khai báo bên trong learningJava.java.
        // Vì Student là public static, file này tạo được object qua learningJava.Student.
        learningJava.Student student = new learningJava.Student();

        student.name = "Chi";
        student.age = 19;

        student.introduce();
    }
}
