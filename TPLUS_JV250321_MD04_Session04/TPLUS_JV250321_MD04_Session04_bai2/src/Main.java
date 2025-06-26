import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Chuỗi ban đầu:
//        Khởi tạo một chuỗi ban đầu là: "Hello, Java World!".
//                Thực hiện các thao tác:
//        Xóa các ký tự từ vị trí 5 đến 9 trong chuỗi.
//        Thay thế đoạn "World" bằng "Universe".
//                In kết quả:
//        In chuỗi ban đầu.
//        In chuỗi sau khi xóa.
//                In chuỗi sau khi thay thế.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your str:");
        String str = sc.nextLine();
        System.out.println("Enter your delete words:");
        String search = sc.nextLine();
        str = str.replace(search, "");
        System.out.println("Enter your sort:" + str.trim().replaceAll("\\s+", " "));
    }
}