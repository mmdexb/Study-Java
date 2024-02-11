package ATM_Thread;


public class Main {
    public static void main(String[] args) {

        Account acc=new Account("1367072295",100000);
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
        

        // Account acc2=new Account("1367072296",100000);
        // new DrawThread(acc2,"小刘").start();
        // new DrawThread(acc2,"小张").start();
    }

    
}
