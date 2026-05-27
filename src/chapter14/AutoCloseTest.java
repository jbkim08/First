package chapter14;

class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}

public class AutoCloseTest {
    static void main() {
        //try-with-resources (생성객체를 자동종료 close 시켜줌)
        try (AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception(); //강제로 예외를 발생시킴
        } catch (Exception e) {
            System.out.println("예외처리!");
        }
    }
}
