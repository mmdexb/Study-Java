import java.util.Scanner;
public class movie {
    public static void main(String[] args) {
        movieinfo[] movies=new movieinfo[4];
        movies[0]=new movieinfo(123, "一步之遥", 2004, 12, 8.9, 700);
        movies[1]=new movieinfo(124, "大话西游", 1995, 7, 6.1, 2610);
        movies[2]=new movieinfo(125, "让子弹飞", 2001, 2, 9.9, 180);
        movies[3]=new movieinfo(126, "emento", 2000, 10, 4.1, 1020);

        movieopertor op=new movieopertor(movies);
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎使用电影信息系统");

        while(true){
            System.out.println("1.显示所有电影");
            System.out.println("2.按id查询电影");
            System.out.println("请输入你的选择:");
            int choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    op.showAllmovies();
                    break;
                case 2:
                    System.out.println("请输入查询的id");
                    int id=scanner.nextInt();
                    op.findMovieByid(id);
                    break;

                default:
                    
                    break;
            }

        }

    }

    


}

class movieinfo{
    private int id;
    private String name;
    private int year;
    private int month;

    private double score;
    private double viewer;

    public movieinfo(){

    }

    public movieinfo(int id,String name,int year,int month,double score,int viewer){
        this.id=id;
        this.name=name;
        this.month=month;
        this.year=year;
        this.score=score;
        this.viewer=viewer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public double getScore() {
        return score;
    }

    public double getViewer() {
        return viewer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setViewer(int viewer) {
        this.viewer = viewer;
    }

    

}

class movieopertor{
    private movieinfo[] movies;

    public movieopertor(movieinfo[] movies){
        this.movies=movies;
    }

    public void showAllmovies(){
        System.out.println("电影信息如下");
        for(int i=0;i<movies.length;i++){
            movieinfo m=movies[i];
            System.out.printf("名称:%s\n id:%d\n 上映时间:%d年%d月\n 评分:%.2f\n 票房:%.2f万\n",m.getName(),m.getId(),m.getYear(),m.getMonth(),m.getScore(),m.getViewer());

        }
    }

    public void findMovieByid(int id){
        int found=0;
        for(int i=0;i<movies.length;i++){
            if (movies[i].getId()==id) {
                System.out.printf("找到id为%d的电影\n",id);
                movieinfo m=movies[i];
                System.out.printf("名称:%s\n id:%d\n 上映时间:%d年%d月\n 评分:%.2f\n 票房:%.2f万\n",m.getName(),m.getId(),m.getYear(),m.getMonth(),m.getScore(),m.getViewer());
                found=1;
            }
        }

        if(found==0){
            System.err.printf("没有找到id为%d的电影\n",id);
        }
    }


}