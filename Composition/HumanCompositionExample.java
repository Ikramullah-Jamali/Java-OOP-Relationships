class Heart
{
    void pump()
    {
        System.out.println("Heart is pumpimg.");
    }
}
class Human
{
    //Heart heart= new Heart();
    void Breath()
    {
        Heart heart= new Heart();
        System.out.println("Human is breathig if:");
        heart.pump();
    }
}
public class HumanCompositionExample 
{
    public static void main(String[] args) 
    {
        Human human=new Human();
        human.Breath();
    }
}
