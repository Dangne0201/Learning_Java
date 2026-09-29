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
javac -encoding UTF-8 basics/learningJava.java
java '-Dfile.encoding=UTF-8' -cp basics CacPhepToan
```

Máy hiện có JDK 17. File nguồn luôn là `basics/learningJava.java`; class đang chạy được đặt tên theo bài học. Khi class hiện hành thay đổi, thay `CacPhepToan` bằng tên class mới trong lệnh chạy và cấu hình Code Runner trong `.vscode/settings.json`. Class không dùng `public` vì tên class `public` trong Java phải trùng với tên file. Cấu hình VS Code đặt UTF-8 cho các cách chạy Java đã thiết lập. Các tệp `.class` được tạo khi biên dịch là tệp chạy sinh ra tự động; Git đã bỏ qua chúng.
