package Delivery;

import java.util.LinkedList;
import java.util.Scanner;

public class planeOpterator {
    Scanner scanner=new Scanner(System.in);
    LinkedList<plane> planes =new LinkedList<>();

    public planeOpterator(LinkedList<plane> planes){
        this.planes=planes;
    }


    public void add(String sign,String arr,String dep,String rwy){
        plane temp=new plane(sign, dep, arr, rwy);
        planes.addLast(temp);
    }

    public void remove(){
        plane temp=planes.getFirst();
        System.out.println("您要放行的飞机信息如下");
        System.out.printf("呼号:%s\n起飞机场:%s\n到达机场:%s\n使用跑道:%s\n",temp.getSign(),temp.getDep(),temp.getArr(),temp.getRwy());
        System.out.println("输入y确认放行");
        String choice=scanner.nextLine();
        if (choice.equals("y")) {
            planes.removeFirst();
            System.out.println("放行成功");
            
        }else{
            System.out.println("取消放行");
        }


    }
    
    public void showline(){
        if(planes.isEmpty()){
            System.out.println("暂无数据");
        }else{

            for (plane plane : planes) {
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");

                System.out.printf("|    |*****************************\n");
                System.out.printf("|    |呼号:%s\n",plane.getSign());
                System.out.printf("|————|起飞机场:%s\n",plane.getDep());
                System.out.printf("|    |到达机场:%s\n",plane.getArr());
                System.out.printf("|    |使用跑道:%s\n",plane.getRwy());
                System.out.printf("|    |****************************\n");

                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
        }
    }
}
