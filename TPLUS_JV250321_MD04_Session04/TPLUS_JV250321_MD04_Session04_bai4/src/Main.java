import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Chương trình nhập liệu:
//        Nhập một chuỗi bất kỳ từ bàn phím, đại diện cho một địa chỉ email.
//        Xử lý chuỗi:
//        Loại bỏ các khoảng trắng thừa nếu cần thiết.
//                Kiểm tra xem chuỗi có tuân theo định dạng email hợp lệ
//        hay không bằng cách sử dụng biểu thức chính quy (regex).
//                Một email hợp lệ cần tuân theo các tiêu chí:
//        Phần username: Có thể chứa các chữ cái, chữ số, dấu chấm (.),
//        hoặc dấu gạch dưới (_).
//                Ký tự @: Ngăn cách giữa phần username và domain.
//                Phần domain: Chứa chữ cái hoặc chữ số, có thể chứa dấu chấm (.).
//        Đuôi miền (TLD - Top-level Domain): Dài từ 2 đến 6 ký tự, chỉ chứa chữ cái.
//                Kết quả:
//        Nếu chuỗi nhập vào là một địa chỉ email hợp lệ, hiển thị "Email hợp lệ".
//                Nếu không hợp lệ, hiển thị "Email không hợp lệ".
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        String emails = "^[a-zA-Z]{6,}@[a-zA-Z0-9]{3,}\\.[a-z]{2,3}$";
        if(Pattern.matches(emails, email)){
            System.out.println(emails);
        }else {
            System.err.println(emails);
        }
    }
}