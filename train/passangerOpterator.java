package train;
import java.util.ArrayList;

public class passangerOpterator {
    ArrayList<passanger> ps=new ArrayList<>();

    passangerOpterator(ArrayList<passanger> ps){
        this.ps=ps;
    }

    public void adduser(String name,String id){
        for (passanger passanger : ps) {
            if(id.equals(passanger.getID())){
                System.out.println("存在该用户");
            }
        }

        ps.add(new passanger(name,id,null));
        System.out.println("用户创建成功");
    }
    
    public void showuser(String train_id){
        int found=0;
        for (passanger passanger : ps) {
            if(train_id.equals(passanger.getTrain_id())){
                System.out.printf("姓名:%s 身份证号:%s\n",passanger.getName(),passanger.getID());
                found=1;
            }
        }

        if (found==0) {
            System.out.println("没有找到相关乘客");
            
        }

    }

    public void setuser(String trainID,String id){
        for (passanger passanger : ps) {
            if(id.equals(passanger.getID())){
                passanger.setTrain_id(trainID);
                System.out.println("购票成功");
                return ;

            }
            
            
        }

        System.out.println("未找到此乘客");
    }

    public void setuser(String trainID,String id,int way){
        for (passanger passanger : ps) {
            if(id.equals(passanger.getID())){
                passanger.setTrain_id(null);
                System.out.println("退票成功");
                return ;

            }
            
            
        }

        System.out.println("未找到此乘客");
    }

    
}
