class Teacher
{
    String teacherName;
    Teacher(String teacherName)
    {
        this.teacherName=teacherName;
        
    }
    void display()
    {
        System.out.println("Teacher Name: "+teacherName);
    }
}
class Course
{
    Teacher teacher;
    Course(Teacher teacher)
    {
        this.teacher=teacher;
    }
    void show()
    {
        System.out.println("Course Info:");
        teacher.display();
    }
}
public class CourseAggregationExample  
{
    public static void main(String[] args) 
    {
        Teacher teacher=new Teacher("Sir: Naveen");
        Course course=new Course(teacher);
        course.show();
    }
}
