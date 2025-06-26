import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình nhập vào một chuỗi văn bản và một từ cần tìm trong chuỗi đó.
//                Chương trình sẽ kiểm tra xem từ cần tìm có xuất hiện trong chuỗi hay không,
//                nếu có, chương trình sẽ in ra vị trí đầu tiên của từ trong chuỗi.
//        Nếu từ không xuất hiện trong chuỗi, chương trình sẽ thông báo cho người dùng.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String val = sc.nextLine();
        String sortname = val.trim().replaceAll("\\s+", "");
        String[] ints = sortname.split(" ");
        System.out.println("Enter searching String:");
        String search = sc.nextLine();
        int pos = val.indexOf(search);
        if (pos >= 0) {
            System.out.println("Found at position (1‑based): " + (pos + 1));
        } else {
            System.out.println("Not found!");
        }
    }
}