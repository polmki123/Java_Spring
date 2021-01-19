package classpart;

public class StudentTest {
    public static void main(String[] args) 
    {
        System.out.println(Student.serialNum); // static 변수 이기때문에 따로 선언하지 않아도 바로 사용할 수 있다.
        Student studentLee = new Student();

        studentLee.studentName = "Lee";
    }
}
