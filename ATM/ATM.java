package ATM;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        String name="";
        String password="";
        
        int found=0;
        ArrayList<user> users=new ArrayList<>();
        user user1=new user("admin", "123456");
        users.add(user1);
        user user2=new user("chen", "1qaz2wsx");
        users.add(user2);
        user user3=new user("han", "136727");
        users.add(user3);
        Scanner scanner=new Scanner(System.in);
        Aoperater op=new Aoperater(users);

        while(found!=1){
            System.out.println("欢迎使用ATM系统");
            System.out.println("请登录");
            //提示输入账号密码
            System.out.println("账号");
            name=scanner.nextLine();
            System.out.println("密码");
            password=scanner.nextLine();
            for(int i=0;i<users.size();i++){
                if ((users.get(i).getName().equals(name))&&(users.get(i).getPassword().equals(password))) {
                    System.err.println("登陆成功");
                    found=1;
                }
            }
            if (found==0){
                System.out.println("账号或密码错误");
            }
        }
        while (true) {
            
        
        if(name.equals("admin")){
            System.out.println("1.展示所有用户");
            System.out.println("2.删除用户");
            System.out.println("0.退出");

            int choice;
            System.out.println("请输入你的选择");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    op.showUser();
                    break;
                case 2:
                    System.out.println("请输入你要删除的姓名");
                    String Delname=scanner.nextLine();
                    op.delUser(Delname);
                    break;
                case 0:
                    return ;
                default:
                    break;
            }

        }else{

            System.out.println("1.查询余额");
            System.out.println("2.取款");
            System.out.println("3.存款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("0.退出");

            int choice;
            System.out.println("请输入你的选择");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    op.showMoney(name);
                    break;
                case 2:
                    System.out.println("请输入你要取款的金额");
                    double change=0-scanner.nextDouble();
                    op.ChangeMoney(name, change);
                    break;
                case 3:
                    System.out.println("请输入你要存款的金额");
                    double change2=scanner.nextDouble();
                    op.ChangeMoney(name, change2);
                    break;
                case 4:
                    System.out.println("请输入对方姓名");
                    String name2=scanner.nextLine();
                    System.out.println("请输入转账金额");
                    double change3=scanner.nextDouble();
                    op.Trans(name, name2, change3);
                    break;
                case 5:
                    System.out.println("请输入您的新密码");
                    scanner.nextLine();
                    String newPassword=scanner.nextLine();
                    op.ChangePassword(name, newPassword);
                    break;
                case 0:
                    return ;
                default:
                    break;
            }



        }
        }

    }
        

}
    

class user{
    private String name;
    private String password;
    private double money;

    public user(){
        
    }

    public user(String name,String password){
        this.name=name;
        this.password=password;
        this.money=0.0;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
}

class Aoperater{
    private ArrayList<user> users=new ArrayList<>();

    public Aoperater(ArrayList<user> users) {
        this.users = users;
    }
    

    public void addUser(String name,String password){
        user newuser=new user(name,password);
        if( users.add(newuser)){
            System.err.println("添加成功");
            return ;
        }

        System.out.println("添加失败");

    }

    public void delUser(String name){
       if(users.remove(name)){
            System.out.println("删除成功");
            return ;
       }
       System.out.println("删除失败");

    }

    public void showUser(){
        for(int i=0;i< users.size();i++){
            user tempuser=new user();
            tempuser=users.get(i);
            System.out.println("*********************");
            System.out.printf("名称:%s\n",tempuser.getName());
            System.out.printf("账户余额:%.2f\n",tempuser.getMoney());
        }
    }

    public void showMoney(String name){
        for(int i=0;i<users.size();i++){
            if (users.get(i).getName().equals(name)) {
                System.out.printf("名称：%s\n",users.get(i).getName());
                System.out.printf("余额:%.2f\n",users.get(i).getMoney());
                return;
            }
        }
    }

    public void ChangeMoney(String name,double change){
        for(int i=0;i<users.size();i++){
            if (users.get(i).getName().equals(name)) {
                user tempUser=users.get(i);
                System.out.printf("名称：%s\n",users.get(i).getName());
                System.out.printf("余额:%.2f\n",users.get(i).getMoney());
                System.out.printf("您的账户将变动%.2f元\n",change);

                tempUser.setMoney(tempUser.getMoney()+change);
                return;
            }
        }
    }

    public void Trans(String name1, String name2, double change) {
        int i = -1;
        int k = -1;
        for (int index = 0; index < users.size(); index++) {
            if (users.get(index).getName().equals(name1)) {
                i = index;
                System.out.printf("您的名称：%s", users.get(i).getName());
                System.out.printf("您的余额:%.2f", users.get(i).getMoney() - change);
            } else if (users.get(index).getName().equals(name2)) {
                k = index;
                System.out.printf("对方名称：%s\n", users.get(k).getName());
                System.out.printf("对方余额:%.2f\n", users.get(k).getMoney() + change);
            }
        }

        if (i != -1 && k != -1) {
            users.get(i).setMoney(users.get(i).getMoney() - change);
            users.get(k).setMoney(users.get(k).getMoney() + change);
        } else {
            System.out.println("未找到相应用户");
        }
    }

    public void ChangePassword(String name,String newPassword){
        for(int i=0;i<users.size();i++){
            if (users.get(i).getName().equals(name)) {
                System.out.printf("您的名称：%s",users.get(i).getName());
                System.out.printf("您的新密码:%s",newPassword);

                users.get(i).setPassword(newPassword);
            }
        }
    }

    
}