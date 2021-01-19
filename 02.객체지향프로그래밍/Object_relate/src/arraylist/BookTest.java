package arraylist;

public class BookTest {
    public static void main(String[] args) {
        Book book[] = new Book[4];
        Book book2[] = new Book[4];
    
        for( int i = 0; i < book.length; i++){
            book[i] = new Book(i, i+3);
        }

        System.arraycopy(book, 0, book2, 0, book.length);

        book[0].bookid = 7; // 이렇게 진행할 경우 얕은 복사가 진행되게 된다.

        for ( Book _book : book )
        {
            _book.showInfo();
        }
        
        System.out.println("======================");
        for ( Book _book : book2 )
        {
            _book.showInfo();
        }
    }
}
