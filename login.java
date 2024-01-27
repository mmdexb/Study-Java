import java.util.Scanner;

public class login {
    public static void main(String[] args){
        user[] users=new user[4];
        users[0]=new user("admin","123456");
        users[1]=new user("user","1qaz2wsx");
        users[2]=new user("user1","wssb");
        users[3]=new user("user2","136707");




        Scanner scanner =new Scanner(System.in);
        int count=0;
        while(count!=3){
            System.out.println("请输入账号");
            String name=scanner.nextLine();
            System.out.println("请输入密码");
            String password=scanner.nextLine();

            operater op=new operater(users);
            if(op.check(name,password)==1){
                break;
                
            }else{
                System.out.println("登录失败！");
                count++;
            }

        }
        System.out.println("结束");


    }
}

class user{
    private String name;
    private String password;

    public user(String name,String password){
        this.name=name;
        this.password=password;

    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}

class operater{
    private user[] users;

    public operater(user[] users){
        this.users=users;
    }

    public int check (String name,String password){
        for(int i=0;i<users.length;i++){
            if ((users[i].getName().equals(name))&&(users[i].getPassword().equals(password))) {
                System.out.println("登录成功！");
                return 1;
            }
        }


        return 0;

    }
}
