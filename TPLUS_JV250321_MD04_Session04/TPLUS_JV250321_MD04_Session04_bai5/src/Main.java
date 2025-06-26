import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 100;
        long start = System.currentTimeMillis();
        String s = "hello";
        for (int i = 0; i < number; i++) {
            s += "world";
        }
        long str = System.currentTimeMillis() -  start;
        System.out.println(str);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append("world");
        }
        long str2 = System.currentTimeMillis() -  start;
        System.out.println(str2);
        start = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < number; i++) {
            sb2.append("world");
        }
        long str3 = System.currentTimeMillis() -  start;
        System.out.println(str3);
    }
}