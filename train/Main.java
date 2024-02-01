package train;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<passanger> ps=new ArrayList<>();
        ArrayList<train> trains=new ArrayList<>();

        passangerOpterator po=new passangerOpterator(ps);
        trainoparator to=new trainoparator(trains);

        System.out.println("欢迎使用火车订票系统");
        to.initTrains();;
        while(true){
            System.out.println("1.展示列车信息");
            System.out.println("2.按起始站和日期查询列车");
            System.out.println("3.按列车号查询列车");
            System.out.println("4.用户注册");
            System.out.println("5.订票");
            System.out.println("6.退票");
            System.out.println("7.按列车号查询列车乘客");
            System.out.println("0.退出");
            
            System.out.println("请输入你的选择");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    to.showTrains();
                    break;
                case 2:
                    int year;
                    int month;
                    int day;
                    System.out.println("请输入查询的日期");
                    System.out.println("年 月 日");
                    year=scanner.nextInt();
                    month=scanner.nextInt();
                    day=scanner.nextInt();
                    LocalDate ldt=LocalDate.of(year, month,day);
                    scanner.nextLine();
                    System.out.println("请输入始发站");
                    String start=scanner.nextLine();
                    to.showTrains(ldt, start);
                    break;
                case 3:
                    System.out.println("请输入列车号");
                    String train_id=scanner.nextLine();
                    to.showTrains(train_id);
                    break;
                case 4:
                    System.out.println("请输入注册人姓名");
                    String name=scanner.nextLine();
                    System.out.println("请输入注册人身份证号");
                    String ID=scanner.nextLine();
                    po.adduser(name, ID);
                    break;
                case 5:
                    System.out.println("请输入身份证号");
                    String id=scanner.nextLine();
                    System.out.println("请输入订票车次");
                    String tid=scanner.nextLine();

                    if(to.editTrainPassanger(1, 1, tid)==1){
                        po.setuser(tid, id);
                    }

                    break;
                case 6:
                    System.out.println("请输入身份证号");
                    String id2=scanner.nextLine();
                    System.out.println("请输入退票车次");
                    String tid2=scanner.nextLine();

                    if(to.editTrainPassanger(2, 1, tid2)==1){
                        po.setuser(tid2, id2,1);
                    }

                    break;
                case 7:
                    System.out.println("请输入列车号");
                    String tid3=scanner.nextLine();
                    po.showuser(tid3);
                    break;
                case 0:
                    return ;
                default:
                    break;
            }
            

        }
        
    }
    
}
