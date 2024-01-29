package ClassManger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<student> students=new ArrayList<>();
        ClassManger manger =new ClassManger();

        System.out.println("请输入方案号(1/2):");
        int n=scanner.nextInt();
        manger.printInfo(n);
        manger.printscore(n);
        

    }
    
}
