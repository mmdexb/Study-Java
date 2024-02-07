package midtermTest.T2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        //stream流解析一下

        List<User> users = Arrays.stream(userStrs.split("#"))
                .map(str -> {
                    String[] parts = str.split(":");
                    return new User(parts[0],parts[2], parts[3],parts[1]);
                })
                .collect(Collectors.toList());

        users.forEach(user -> System.out.println(user));

        //添加到哈希表
        Map<String, Integer> result=new HashMap<>();
        for (User user2 : users) {
            String name=user2.getName();
            if(result.containsKey(name)){
                result.put(name, result.get(name)+1);
            }else{
                result.put(name, 1);
            }
            
        }

        result.forEach((k,v)->{
            System.out.println(k+"出现了"+v+"次\n");
        });


    }
}
