class Book
{
    String bookTitle="Math";
}
class Student
{
    Book book=new Book();
    void study()
    {
        System.out.println("I am studying "+book.bookTitle);
    }
}
public class StudentAssociationExample 
{
    public static void main(String[] args) 
    {
        Student student=new Student();
        student.study();
    }
}
