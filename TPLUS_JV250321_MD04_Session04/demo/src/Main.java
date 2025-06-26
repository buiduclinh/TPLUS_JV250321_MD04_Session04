import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//******************QUẢN LÝ NGƯỜI DÙNG****************
//        1. Nhập thông tin người dùng
//        2. Chuẩn hóa họ tên
//        3. Kiểm tra email hợp lệ
//        4. Kiểm tra số điện thoại hợp lệ
//        5. Kiểm tra mật khẩu hợp lệ
//        6. Thoát
//        Lựa chọn của bạn:
//        Lưu ý:
//• Thông tin người dùng gồm: Họ và tên, email, điện thoại và mật khẩu
//• Số điện thoại có định dạng số điện thoại di động tại Việt Nam
//• Email có định dạng email theo quy định
//• Mật khẩu có tối thiểu 8 ký tự, gồm ký tự anphabet viết thường, viết hoa, ký tự
//        số và ký tự đặc biệt
        String name = "";
        String password = "";
        String email = "";
        String phone = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("name:");
                    name = sc.nextLine();
                    System.out.println("password:");
                    password = sc.nextLine();
                    System.out.println("email:");
                    email = sc.nextLine();
                    System.out.println("phone:");
                    phone = sc.nextLine();
                    break;
                case 2:
                    String sortname = name.trim().replaceAll("\\s+","");
                    String [] ints = sortname.split(" ");
                    StringBuilder names = new StringBuilder();
                    for (int i = 0; i < ints.length; i++) {
                        names.append(Character.toUpperCase(ints[i].charAt(0))).append(ints[i].substring(1).toLowerCase()).append(" ");
                    }
                    System.out.println(names.toString().trim());
                    break;
                case 3:
                    String emails = "^[a-zA-Z]{6,}@[a-zA-Z0-9]{3,}\\.[a-z]{2,3}$";
                    if(Pattern.matches(emails, email)){
                        System.out.println(emails);
                    }else {
                        System.err.println(emails);
                    }
                    break;
                case 4:
                    String phone1 = "(\\+84|090|091|094|097|087|035)[0-9]{7}";
//                            "^[0-9]{10}$";
                    if(Pattern.matches(phone1, phone)){
                        System.out.println(phone1);
                    }else {
                        System.err.println(phone1);
                    }
                    break;
                case 5:
                    String password1 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}";
                    if(Pattern.matches(password1, password)){
                        System.out.println(password1);
                    }else {
                        System.err.println(password1);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");
            }
        } while (true);
    }
}