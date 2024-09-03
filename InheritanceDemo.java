class Bicycle 
{
    int gear;
    int speed;
    Bicycle(int gear, int speed) 
    {
        this.gear = gear;
        this.speed = speed;
    }
    void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
    void speedUp(int increment) 
    {
        speed += increment;
    }
}
class MountainBike extends Bicycle
 {
    int seatHeight;
    MountainBike(int gear, int speed, int startHeight)
     {
        super(gear, speed);
        seatHeight = startHeight;
    }
    void setHeight(int newValue) 
    {
        seatHeight = newValue;
    }
}
public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Bike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
    }
}