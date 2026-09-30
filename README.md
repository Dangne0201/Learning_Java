# Học Java

Repo này dùng để học Java từ đầu. Người học tự chọn chủ đề và Codex hỗ trợ giải thích, viết ví dụ, xem bài làm. Ví dụ mã nguồn hiện hành nằm trong `basics/`; các bài cũ được comment lại trong cùng file.

Người học tự chọn thứ tự và chủ đề. Codex hỗ trợ giải thích, viết ví dụ nhỏ và xem bài làm theo yêu cầu. Xem `AGENTS.md` để biết cách hướng dẫn.

## Hỏi Codex

Ví dụ: **“T muốn học biến trong Java. Giải thích từ đầu rồi viết vài ví dụ nhỏ cho t.”**

Khi muốn Codex hỗ trợ bài tập, gửi đề và phần mình đã làm; nói rõ nếu chỉ muốn gợi ý hoặc muốn xem lời giải mẫu.

## Chạy bài Java hiện tại trên Windows

Mở Terminal tại thư mục dự án rồi chạy:

```powershell
chcp 65001
cd basics
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out *.java
java '-Dfile.encoding=UTF-8' -cp out learningJava
```

Máy hiện có JDK 17. Các bài học chính nằm trong `basics/learningJava.java`; ví dụ Bài 10 dùng thêm `basics/ViDuGoiStudentTuFileKhac.java` để minh họa việc một file Java thực sự gọi class từ file khác. Hai file được biên dịch cùng nhau, còn các file `.class` được đặt trong `basics/out` để tách khỏi mã nguồn. Cấu hình Run Code và Java Extension đều dùng thư mục này làm nơi chứa file biên dịch. Cấu hình VS Code đặt UTF-8 cho các cách chạy đã thiết lập.
