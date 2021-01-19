package arraylist;

public class Book {
    int bookid ;
    int booknum;

    public Book(int a, int b){
        this.bookid = a;
        this.booknum = b;
    }
    public void showInfo(){
        System.out.println(this + " " + bookid + " " +  booknum );
    }
}
