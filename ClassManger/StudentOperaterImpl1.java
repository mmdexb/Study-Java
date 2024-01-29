package ClassManger;
import java.util.ArrayList;

public class StudentOperaterImpl1 implements StudentOperator {

    @Override
    public void printInfo(ArrayList<student> students) {
        for (student student : students) {
            System.out.printf("姓名:%s 性别:%s 分数:%.2f\n",student.getName(),student.getGender(),student.getScore());
            
        }
        System.out.println("*************************************");
    }

    @Override
    public void printScore(ArrayList<student> students) {
        double sum=0.0;
        for(student student:students){
            sum+=student.getScore();
        }

        System.out.printf("平均分为(不去除最高分与最低分): %.2f\n",sum/(students.size()));
        
    }
    


    
}
