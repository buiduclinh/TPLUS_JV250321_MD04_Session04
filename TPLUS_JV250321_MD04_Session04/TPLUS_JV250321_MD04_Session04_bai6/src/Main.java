import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình Java để kiểm tra tính hợp lệ của một mật khẩu. Mật khẩu hợp lệ phải thỏa mãn các yêu cầu sau:
//
//        Ít nhất 8 ký tự.
//        Có ít nhất một chữ cái viết hoa.
//        Có ít nhất một chữ cái viết thường.
//        Có ít nhất một ký tự số.
//                Có ít nhất một ký tự đặc biệt (ví dụ: @, #, $, !, %).
//        Chương trình sẽ yêu cầu người dùng nhập một mật khẩu và kiểm tra xem mật khẩu đó có hợp lệ không dựa trên các yêu cầu trên. Sau đó, thông báo cho người dùng biết mật khẩu hợp lệ hay không.
//
//
//
//                Yêu cầu:
//
//        Nhập vào mật khẩu cần kiểm tra
//        Kiểm tra tính hợp lệ của mật khẩu vừa nhập
//        Output
//        Nếu mật khẩu hợp lệ, in ra thông báo: “Mật khẩu hợp lệ”
//        Nếu mật khẩu không hợp lệ, in ra thông báo: “Mật khẩu không hợp lệ”
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passwords = sc.nextLine();
        String password1 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}";
        if(Pattern.matches(password1, passwords)){
            System.out.println(password1);
        }else {
            System.err.println(password1);
        }
    }
}