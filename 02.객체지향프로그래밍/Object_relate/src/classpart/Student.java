package classpart;

public class Student {
    public static int serialNum = 100;
    private int studentId;
    public String studentName;
    public String address;

    Subject korea;
    Subject math;

    public Student(){
        korea = new Subject();
        math = new Subject();
    }
    
    public Student(String name){
        this.studentName = name;
        serialNum++;
        studentId = serialNum;

    }
    public static int Nameup(){
        return 
    }
    // 이름은 같지만 매개변수가 다른 경우에 이를 오버로딩이라 한다. 
    public Student(String name, int id){
        studentId = id;
        studentName = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

}
