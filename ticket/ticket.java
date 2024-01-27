package ticket;
import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用机票计算器");
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("请输入机票原价：");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("请输入类型：");
        String type = scanner.nextLine();

        System.out.println(cal(month, price, type));
    }

    public static double cal(int month, double price, String type) {
        if (month >= 5 && month <= 10) {
            if (type.equals("jingji")) {
                return price * 0.85;
            } else if (type.equals("toudeng")) {
                return price * 0.9;
            }
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            if (type.equals("jingji")) {
                return price * 0.65;
            } else if (type.equals("toudeng")) {
                return price * 0.7;
            }
        }
        return 0.0;
    }
}
