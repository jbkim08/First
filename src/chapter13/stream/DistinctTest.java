package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student{
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    //학생의 아이디가 같으면 같은 학생으로 정의
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
public class DistinctTest {
    static void main() {
        Student studentLee = new Student(100, "이윤선");
        Student studentMoon = new Student(200, "문찬옥");
        Student studentLee2 = new Student(100, "이윤선");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentLee);
        studentList.add(studentMoon);
        studentList.add(studentLee2);

        studentList.stream()
                .distinct()
                .forEach(s-> System.out.println(s.getName()));
    }
}
