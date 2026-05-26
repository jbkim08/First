package chapter13;

interface Joiner{
    String join(String text1, String text2);
}
public class Lamda_Return {
    static void main() {
        Joiner joiner = (s1,s2)->{
            String text = s1 + " - " + s2;
            return text;
        };
        System.out.println(joiner.join("치킨", "맥주"));
        System.out.println(joiner.join("학원", "공부"));
        //람다식에서 리턴과 중괄호를 한줄일때 생략
        Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;
        System.out.println(joiner2.join("치킨", "맥주"));
        System.out.println(joiner2.join("학원", "공부"));
    }
}
