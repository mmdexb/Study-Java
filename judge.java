import java.util.Scanner;
import java.util.Arrays;
public class judge {
    public static void main(String[] args){
        System.out.println("请输入教师人数");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []score=new int[n];
        score=getscore(n);
        System.out.printf("最终分数是%.2f",calscore(score, n));

    }

    public static int[] getscore(int n){
        int[] score=new int[n];
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<n;i++){
            System.out.printf("请输入第%d个老师的评分",i+1);
            score[i]=scanner.nextInt();
        }

        return score ;
    }

    public static double calscore(int[] score,int n){
        double finn=0.0;
        int sum=0;
        Arrays.sort(score);
        score[0]=0;
        score[n-1]=0;
        for(int i=0;i<n;i++){
            sum+=score[i];
        }
        finn=sum/(n-2);

        return finn;


    }
}
