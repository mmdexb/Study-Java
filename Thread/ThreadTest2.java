package Thread;
import java.lang.Thread;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);

            if(i==2){
                Thread.sleep(5000);
            }
            
        }
    }
    
}
