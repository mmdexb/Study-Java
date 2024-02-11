package Thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list=new ArrayList<>();

    
    public synchronized void put(){
        try {
            String name=Thread.currentThread().getName();
            if(list.size()==0){
                list.add(name+"做的包子");
                System.out.println(name+"做了包子");
                Thread.sleep(2000);
    
                //唤醒别人然后等待自己
                this.notifyAll();
                this.wait();
                
            }else{
                //有包子 不做了
                //唤醒别人 等待自己
                this.notifyAll();
                this.wait();
    
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
    }

    public synchronized void get(){
        
        
        try {
            String name=Thread.currentThread().getName();
            if(list.size()==1){
                System.out.println(name+"吃了"+list.get(0));
                list.clear();
                Thread.sleep(1000);
                //唤醒别人然后等待自己
                this.notifyAll();
                this.wait();
    
            }else{
                //没包子 不吃了
                //唤醒别人 等待自己
                this.notifyAll();
                this.wait();            
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }



    
}