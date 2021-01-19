package coporation;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money       = money;
    }
    public void showinfo(){
        System.out.println( studentName + '남은 돈은' + money);
    }
}
