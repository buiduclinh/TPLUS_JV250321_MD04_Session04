import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình tạo một chuỗi ngẫu nhiên gồm chữ cái (A-Z, a-z)
//        và số (0-9) có độ dài n. Chương trình nhận đầu vào
//        là số nguyên n (1 ≤ n ≤ 1000) và
//        trả về một chuỗi ngẫu nhiên có độ dài đúng n.
//
//
//
//        Yêu cầu:
//
//        Chương trình nhận một số nguyên n từ người dùng nhập vào.
//        Trả về một chuỗi ngẫu nhiên có độ dài đúng bằng n, chứa chữ cái in hoa,
//        chữ cái in thường và số.
//                Không được sử dụng thư viện có sẵn để tạo chuỗi ngẫu nhiên hoàn chỉnh,
//                chỉ dùng Random hoặc Math.random().
//                Chương trình phải chạy hiệu quả ngay cả với n = 1000
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n < 1 || n > 1000) {
            System.err.println("Invalid input");
        } else {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "abcdefghijklmnopqrstuvwxyz"
                    + "0123456789";
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                int index = (int)(Math.random() * chars.length());
                sb.append(chars.charAt(index));
            }
            System.out.println(sb.toString());
        }
    }
}