package chapter11;

public record StudentInfo(int id, String name) {
    static void main() {
        StudentInfo s1 = new StudentInfo(12345, "최치원");
        StudentInfo s2 = new StudentInfo(12345, "최치원");
        //레코드는 입력된 필드값으로 생성자,toString,Get메소드 등 모두 자동생성
        System.out.println(s1.equals(s2));
        System.out.println(s1.name());
        System.out.println(s1.id());
        System.out.println(s1);
    }
}
