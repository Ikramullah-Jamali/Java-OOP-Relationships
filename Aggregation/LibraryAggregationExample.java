class Book
{
    String bookname;
    String author;
    Book(String bookname,String author)
    {
        this.bookname=bookname;
        this.author=author;
    }
    void display()
    {
        System.out.println("Book: "+bookname+", Author: "+author);
    }
    
} 
class Library
{
    Book book1;
    Book book2;
    
    Library(Book book1,Book book2)
    {
        this.book1=book1;
        this.book2=book2;
    }
    void show()
    {
        System.out.println("Books in library:");
        book1.display();
        book2.display();
    }
}
public class LibraryAggregationExample
{
    public static void main(String[] args) 
    {
        Book b1=new Book("physics","rizwan");
        Book b2=new Book("chymistry","farhat");
        
        Library library=new Library(b1,b2);
        library.show();
    }
}
