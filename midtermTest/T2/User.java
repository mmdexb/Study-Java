package midtermTest.T2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private Long id;  // 用户id 名
    private String gender;  //性别
    private LocalDate birthday;  //生日
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return "[id="+id+"  name="+name+"  gender="+gender+"  birthday="+birthday+"]\n";
    }

    public String getName() {
        return name;
    }
    public User(String id, String gender, String birthday,String name) {
        this.id = Long.parseLong(id);
        this.gender = gender;
        this.name=name;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
}
