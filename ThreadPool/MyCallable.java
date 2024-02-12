package ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n=n;
    }

    @Override
    public String call(){
        int sum=0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
            
        }

        return Thread.currentThread().getName()+"===>1-"+n+"的和是"+sum;
    }
    
}
