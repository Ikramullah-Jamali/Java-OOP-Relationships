class AssociatedStudent2
{
    String studentName;
    int studentID;
    AssociatedStudent2(String studentName,int studentID)
    {
        this.studentName=studentName;
        this.studentID=studentID;
    }
    void display()
    {
        System.out.println("Student Name: "+studentName+", ID: "+studentID);
    }
}
class AssociatedCourse
{
    String CourseName;
    AssociatedCourse(String CourseName)
    {
        this.CourseName=CourseName;
    }
    void show()
    {
        System.out.println("Course Name: "+CourseName);
    }
}
public class CourseAssociationExample 
{
    public static void main(String[] args) 
    {
        AssociatedStudent2 student1=new AssociatedStudent2("Ikram", 11);
        AssociatedStudent2 student2=new AssociatedStudent2("kabeer", 12);
        AssociatedCourse course=new AssociatedCourse("BE software.");
        course.show();
        student1.display();
        student2.display();
        
    }
}
