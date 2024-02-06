package Delivery;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<plane> planes = new LinkedList<plane>();
        planeOpterator op=new planeOpterator(planes);

        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用ZSDY放行管理系统");

        while(true){

        
            System.out.printf("1.添加飞机进入队列\n2.放行飞机\n3.展示当前放行队列\n");
            System.out.println("0.退出");
            System.out.println("请输入您的选择:");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
                case 1:
                    System.out.println("请输入飞机的呼号:");
                    String sign=sc.nextLine();
                    System.out.println("请输入飞机的起飞机场:");
                    String dep=sc.nextLine();
                    System.out.println("请输入飞机的到达机场:");
                    String arr=sc.nextLine();
                    System.out.println("请输入飞机的跑道:");
                    String rwy=sc.nextLine();

                    planes.add(new plane(sign,dep,arr,rwy));

                break;
                case 2:
                    op.remove();
                    break;
                case 3:
                    op.showline();
                    break;
                case 0:
                    System.out.println("欢迎下次使用");
                    return ;
                    
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
        


    }
    
}
