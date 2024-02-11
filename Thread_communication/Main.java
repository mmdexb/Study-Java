package Thread_communication;

import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        //3个生产者线程负责生产包子 每个线程只能生产1个包子放在桌子上
        //2个消费者线程负责吃包子 每人每次只能在桌子上拿一个包子
        Desk desk=new Desk();

        //创建3个生产者线程
        new Thread(()->{

            while(true){
                desk.put();
            }
            
        },"厨师1").start();

        new Thread(()->{
            while(true){
                desk.put();
            }
        },"厨师2").start();

        new Thread(()->{
            while(true){
                desk.put();
            }
        },"厨师3").start();


        //创建2个消费者线程
        new Thread(()->{
            while(true){
                desk.get();
            }
        },"消费者1").start();

        new Thread(()->{
            while(true){
                desk.get();
            }
        },"消费者2").start();
    }
}


    
