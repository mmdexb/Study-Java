package ClassManger;

public class student {
    private String name;
    private String gender;
    private double score;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public student(String name, String gender, double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public student(){

    }
    

    
}
