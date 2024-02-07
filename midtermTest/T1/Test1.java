package midtermTest.T1;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<People> peoples =new ArrayList<>();
        Random rand=new Random();

        for(int i=1;i<=100;i++){
            int code=rand.nextInt(200)+1;
            while(true){
                int found=0;
                for (People people : peoples) {
                    if (people.getCode()==code) {
                        found=1;
                    }
                }
                if(found==0){
                    break;
                }
                code =rand.nextInt(200)+1;
            }
            People temp=new People(code, i);
            peoples.add(temp);
        }

        System.out.println(peoples);

        while(peoples.size()!=1){
            ArrayList<People> temPeoples=new ArrayList<>();

            for(int i=1;i<peoples.size();i+=2){
                temPeoples.add(peoples.get(i));
            }
            peoples=temPeoples;

        }

        System.out.println(peoples.get(0));

        

    }
    
}
