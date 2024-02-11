package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.lang.Thread;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> call =new MyCallable(100);
        FutureTask<String> f1= new FutureTask<>(call);//任务对象，实现runable对象；可以在线程执行完毕后，可以用get获取与结果
        new Thread(f1).start();

        Callable<String> call2 =new MyCallable(200);
        FutureTask<String> f2= new FutureTask<>(call2);//任务对象，实现runable对象；可以在线程执行完毕后，可以用get获取与结果
        new Thread(f2).start();

        String rs=f1.get();
        System.out.println(rs);

        String rs2=f2.get();
        System.out.println(rs2);

    }
    
}
