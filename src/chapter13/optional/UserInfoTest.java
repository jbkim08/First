package chapter13.optional;

import java.util.ArrayList;
import java.util.Optional;

class UserInfo{
    private int id;
    private String name;
    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class UserInfoTest {
    static void main() {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Edward"));

        Optional<UserInfo> userInfo = getUserInfoById(12348, userInfoList);
        //ifPresent 는 유저를 찾은 경우만 실행
        userInfo.ifPresent(user -> System.out.println("유저 이름 : " + user.getName()) );
        //isPresent 는 있으면 참 없으면 거짓
        if(userInfo.isPresent()){
            System.out.println("유저 이름: " + userInfo.get().getName());
        } else {
            System.out.println("유저를 못찾았습니다.");
        }
        //orElse()로 기본객체를 생성
        UserInfo nameOrDefault = userInfo.orElse(new UserInfo(0000, "Guest"));
        System.out.println("유저 이름 : " + nameOrDefault.getName());


    }

    private static Optional<UserInfo> getUserInfoById(int id, ArrayList<UserInfo> list) {
        for (UserInfo userInfo : list){
            if(id == userInfo.getId()){
                return Optional.of(userInfo); //실제 객체의 값
            }
        }
        return Optional.empty(); //id에 해당하는 유저가 없음 null
    }
}
