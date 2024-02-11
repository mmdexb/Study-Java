package ATM_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardID;
    private double money;
    //创建lock锁对象
    private Lock lk=new ReentrantLock();
    public String getCardID() {
        return cardID;
    }
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }
    public Account() {
    }

    // //同步方法上锁
    // public synchronized void drawMoney(double money){
    //     String name=Thread.currentThread().getName();

    //     //同步代码块上锁
    //     // synchronized(this){
    //     //     if(this.money>=money){
    //     //         System.out.println(name+"来取钱"+money+"成功");
    //     //         this.money-=money;
    //     //         System.out.println(name+"取钱后剩余"+this.money);

    //     //     }else{
    //     //         System.out.println(name+"来取钱，余额不足");
    //     //     }
    //     // }

        
    //         if(this.money>=money){
    //             System.out.println(name+"来取钱"+money+"成功");
    //             this.money-=money;
    //             System.out.println(name+"取钱后剩余"+this.money);

    //         }else{
    //             System.out.println(name+"来取钱，余额不足");
    //         }

    // }
    
    //lock锁

    public void drawMoney(double money){
        String name=Thread.currentThread().getName();
        lk.lock();
            if(this.money>=money){
                System.out.println(name+"来取钱"+money+"成功");
                this.money-=money;
                System.out.println(name+"取钱后剩余"+this.money);

            }else{
                System.out.println(name+"来取钱，余额不足");
            }
        lk.unlock();
    }
}
