class Brain
{
    void think()
    {
        System.out.println("Thinking.");
    }
}
class Person
{
    String name;
    Brain brain;
    Person(String name)
    {
        this.name=name;
        this.brain=new Brain();
    }
    void usebrain()
    {
        System.out.println(name+" is using brain.");
        brain.think();
    }
}
public class PersonAssociationExample
{
    public static void main(String [] args)
    {
        Person person=new Person("khan");
        person.usebrain();
    }
}