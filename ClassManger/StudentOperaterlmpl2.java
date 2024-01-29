package ClassManger;

import java.util.ArrayList;

public class StudentOperaterlmpl2 implements StudentOperator{

    @Override
    public void printInfo(ArrayList<student> students) {
        int boy=0;
        int girl=0;

        for(student student:students){
            System.out.printf("姓名:%s 性别:%s 分数:%.2f\n",student.getName(),student.getGender(),student.getScore());
            if (student.getGender().equals("男")) {
                boy++;
            }else if (student.getGender().equals("女")) {
                girl++;
                
            }
        }
        System.out.printf("男生有:%d,女生有:%d\n",boy,girl);
        System.out.println("*************************************");
        
    }

    @Override
    public void printScore(ArrayList<student> students) {
        double max=students.get(0).getScore();
        double min=students.get(0).getScore();
        double sum=0.0;

        for (student student : students) {
            if (student.getScore()>max) {
                max=student.getScore(); 
            }

            if (student.getScore()<min) {
                min=student.getScore();          
            }

            sum+=student.getScore();
        }

        System.out.printf("最高分为:%.2f,最低分为:%.2f,平均分为(去除最高分最低分):%.2f\n",max,min,(sum-max-min)/(students.size()-2));
        
    }
    
    
}
