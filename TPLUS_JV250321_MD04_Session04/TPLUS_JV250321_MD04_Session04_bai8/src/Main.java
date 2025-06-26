import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình nén chuỗi theo thuật toán Run-Length Encoding (RLE).
//            Thuật toán này sẽ nén một chuỗi bằng cách ghi lại số lần xuất hiện
//        liên tiếp của mỗi ký tự.
//
//
//
//        Yêu cầu:
//
//        Chương trình nhận vào một chuỗi chỉ chứa các ký tự chữ cái (a-z, A-Z).
//                Trả về chuỗi nén với định dạng:
//        Mỗi ký tự được theo sau bởi số lần xuất hiện liên tiếp của nó.
//                Nếu một ký tự chỉ xuất hiện một lần, vẫn phải ghi số 1 phía sau.
//        Ví dụ: Người dùng nhập vào aaabbc thì chương trình in ra a3b2c1.
//                Vì có 3 chữ a liên tiếp, 2 chữ b liên tiếp và 1 chữ c liên tiếp
//        Chương trình phải phân biệt chữ hoa và chữ thường (A ≠ a).
//        Không sử dụng thư viện có sẵn để nén chuỗi, chỉ dùng vòng lặp
//        và StringBuilder/StringBuffer.
//                Nếu chuỗi đầu vào rỗng, trả về chuỗi rỗng "".
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] ints = sc.nextLine().split(" ");
        StringBuilder newname = new StringBuilder();
        char current = name.charAt(0);
        int count = 1;
        for (int i = 0; i < ints.length; i++) {
            if(name.charAt(i) == current){
                count++;
            }else{
                newname.append(current).append(count);
                current = name.charAt(i);
                count = 1;
            }
        }
        newname.append(current).append(count);
    }
}