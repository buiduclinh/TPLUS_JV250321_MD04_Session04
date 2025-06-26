import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình nhập vào một chuỗi từ bàn phím và
//        thay thế tất cả các ký tự số (0-9) trong chuỗi đó bằng ký tự *.
//        Chương trình sẽ sử dụng phương thức replaceAll()
//        hoặc replace() để thực hiện việc thay thế.
//        Kết quả là chuỗi đã thay thế các ký tự số sẽ được in ra.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        String newstr = str.replaceAll("[0-9]", "*");
        System.out.println(newstr);
    }
}