package Radomcode;
import java.util.Random;
import java.util.Scanner;
public class Radomcode {

    public static void main(String[] args){
        Random r=new Random();
        Scanner scanner=new Scanner(System.in);
        int ra=r.nextInt(5)+1;
        System.out.println("以下是随机生成的验证码");
        String code=creatcode(ra);
        System.out.println(code);
        System.out.print("请输入：");
        String input=scanner.nextLine();

        if (input.equals(code)) {
            System.out.println("正确");
            
        }else{
            System.out.println("错误");
        }
        

        
    }
    
    public static String creatcode(int n){
        Random random=new Random();
        String str="";
        for(int i=0;i<n;i++){
            int rad=random.nextInt(3)+1;
            switch (rad) {
                case 1:
                    str=str+random.nextInt(10);
                    break;
                case 2:
                    str =str+(char)(random.nextInt(26)+65);
                    break;
                case 3:
                    str =str+(char)(random.nextInt(26)+97);
            }
            
        }
        return str;
    }
}
