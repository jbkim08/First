package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

class UserInfo{
    private String name;
    private int age;
    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class UserInfoMapTest {
    static void main() {
        UserInfo userKim = new UserInfo("김영희", 30);
        UserInfo userLee = new UserInfo("이철수", 40);
        UserInfo userSong = new UserInfo("송영수", 55);
        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(userKim);
        userInfoList.add(userLee);
        userInfoList.add(userSong);

        //40세 이상 유저만 스트림
        userInfoList.stream()
                .filter(user -> user.getAge() >= 40)
                .map(userInfo -> userInfo.getName())
                .forEach(s -> System.out.println(s));
    }
}
