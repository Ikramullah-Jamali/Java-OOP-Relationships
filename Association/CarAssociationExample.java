class Engine
{
    void start()
    {
        System.out.println("car is starting.");
    }
}
class Car
{
    Engine engine=new Engine();
    void move()
    {
        engine.start();
        System.out.println("Car is moving");
    }
    //engine.start();

}
public class CarAssociationExample 
{
    public static void main(String[] args) 
    {
        Car car=new Car();
        car.move();
    }
}
