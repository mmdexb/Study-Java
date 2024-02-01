package train;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class trainoparator {
    ArrayList<train> trains=new ArrayList<>();

    trainoparator(ArrayList<train> trains){
        this.trains=trains;
    }

    public void initTrains(){
        LocalDate ld1=LocalDate.of(2023, 10, 12);
        trains.add(new train("G6044","Qingdao","Beijing",ld1,500,0,90.8));

        LocalDate ld2 = LocalDate.of(2023, 10, 15);
        trains.add(new train("G6045", "Beijing", "Shanghai", ld2, 600, 0, 120.5));

        LocalDate ld3 = LocalDate.of(2023, 10, 18);
        trains.add(new train("G6046", "Shanghai", "Guangzhou", ld3, 800, 0, 150.3));

        LocalDate ld4 = LocalDate.of(2023, 10, 22);
        trains.add(new train("G6047", "Guangzhou", "Chengdu", ld4, 1000, 0, 180.9));
    }

    public void showTrains(){
        for (train train : trains) {
            System.out.printf("列车号:%s,始发站:%s,终点站:%s,发车时间:%s,额定乘客:%d,目前乘客:%d,车票价格:%.2f\n",
            train.getID(),train.getStart(),train.getEnd(),train.getTime().format(DateTimeFormatter.ISO_LOCAL_DATE),train.getLimit_passanger(),train.getPassanger(),train.getPrice());
        }
    }

    public void showTrains(String train_id){
        for(train train :trains){
            if (train.getID().equals(train_id)) {
                System.out.printf("您查询的%s信息\n列车号:%s,始发站:%s,终点站:%s,发车时间:%s,额定乘客:%d,目前乘客:%d,车票价格:%.2f\n",
                train_id,train.getID(),train.getStart(),train.getEnd(),train.getTime().format(DateTimeFormatter.ISO_LOCAL_DATE),train.getLimit_passanger(),train.getPassanger(),train.getPrice());
                return;
                
            }
        }

        System.out.println("没有找到对应列车");
    }

    public void showTrains(LocalDate Ntime,String start){
        for(train train:trains){
            if((Ntime.isEqual(train.getTime())&&start.equals(train.getStart()))){
                System.out.printf("您查询的日期为%s从%s始发的列车信息如下\n列车号:%s,始发站:%s,终点站:%s,发车时间:%s,额定乘客:%d,目前乘客:%d,车票价格:%.2f\n",
                train.getTime().format(DateTimeFormatter.ISO_LOCAL_DATE),train.getStart(),train.getID(),train.getStart(),train.getEnd(),train.getTime().format(DateTimeFormatter.ISO_LOCAL_DATE),train.getLimit_passanger(),train.getPassanger(),train.getPrice());
                return;

            }
        }

        System.out.println("没有找到对应列车");

    }

    public int editTrainPassanger(int way,int number,String train_id){
        for (train train : trains) {
            if (train_id.equals(train.getID())) {
                System.out.println("找到此列车");
                if (way==2) {//1是添加 2是减少
                    
                    if (train.getPassanger()<number) {
                        System.out.println("列车人数少于退票人数");
                        return 2;
                    }
                    number=0-number;
                    train.setPassanger(train.getPassanger()+number);
                    System.out.println("列车信息修改完毕");
                    return 1;
                }else if(way==1){
                    if(train.getPassanger()+number>train.getLimit_passanger()){
                        System.out.println("列车空闲席位不足");
                        return 2;
                    }
                    train.setPassanger(train.getPassanger()+number);
                    System.out.println("列车信息修改完毕");
                    return 1;
                }
                
            }
        }

        System.out.println("未找到列车");
        return 2;

    }


}
