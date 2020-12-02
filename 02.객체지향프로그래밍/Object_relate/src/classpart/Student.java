package classpart;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    Subject korea;
    Subject math;

    public Student(){
        korea = new Subject();
        math = new Subject();
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
