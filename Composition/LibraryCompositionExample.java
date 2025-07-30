class Book5
{
    String bookname;
    String auther;

    Book5(String bookname,String auther)
    {
        this.bookname=bookname;
        this.auther=auther;
    }
    void display()
    {
        System.out.println("Book: "+bookname+" ,Auther: "+auther);
    }
}
class Library2
{
    Book5 book1=new Book5("maths","khan");
    Book5 book2=new Book5("physics","jamali");
    void show()
    {
        System.out.println("Books in Library:");
        book1.display();
        book2.display();
    }
      
}
public class LibraryCompositionExample 
{
    public static void main(String[] args) 
    {
        Library2 library=new Library2();
        library.show();
    }
}
