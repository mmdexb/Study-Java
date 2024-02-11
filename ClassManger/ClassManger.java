package ClassManger;

import java.util.ArrayList;

public class ClassManger {

    ArrayList<student> students=new ArrayList<>();
    StudentOperaterImpl1 op1=new StudentOperaterImpl1();
    StudentOperaterlmpl2 op2=new StudentOperaterlmpl2();

    public ClassManger(){
        initStu();
    }

    public void initStu(){
        students.add(new student("linus","男",50.3));
        students.add(new student("han","女", 80.1));
        students.add(new student("func","女", 40));
        students.add(new student("kang","男", 87));
        students.add(new student("liu","女", 97.1));

    }
  
    public void printInfo(int n) {
        if (n==1) {
            op1.printInfo(students);
            
        }else{
            op2.printInfo(students);
        }

    }

    public void printscore(int n){
        if(n==1){
            op1.printScore(students);
        }else{
            op2.printScore(students);
        }

    }

}
