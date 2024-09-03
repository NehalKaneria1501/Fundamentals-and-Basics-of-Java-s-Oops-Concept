public class Bicycle 
{
    protected int gear;
    protected int speed;
    public Bicycle(int startSpeed, int startGear) 
    {
        speed = startSpeed;
        gear = startGear;
    }
    public void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
    public void speedUp(int increment) 
    {
        speed += increment;
    }
}
public class MountainBike extends Bicycle 
{
    private int seatHeight;
    public MountainBike(int startSpeed, int startGear, int startSeatHeight) 
    {
        super(startSpeed, startGear);
        seatHeight = startSeatHeight;
    }
    @Override
    public void applyBrake(int decrement) 
    {
        speed -= decrement * 2; 
    }
    public void setSeatHeight(int height) 
    {
        seatHeight = height;
    }
    public int getSeatHeight() 
    {
        return seatHeight;
    }
}
public class MethodOverridingDemo 
{
    public static void main(String[] args) 
    {
        Bicycle bicycle = new Bicycle(10, 1);
        System.out.println("Bicycle gear is: " + bicycle.gear);
        System.out.println("Bicycle speed is: " + bicycle.speed);
        bicycle.applyBrake(1);
        System.out.println("Bicycle speed after applying brakes is: " + bicycle.speed);
        Bicycle mountainBike = new MountainBike(50, 50, 3);
        System.out.println("MountainBike Gear is: " + mountainBike.gear);
        System.out.println("MountainBike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("MountainBike speed after applying brake is: " + mountainBike.speed);
        ((MountainBike) mountainBike).speedUp(10); 
        System.out.println("Bike speed after speeding up is: " + mountainBike.speed);
        MountainBike mountainBikeObj = (MountainBike) mountainBike; 
        System.out.println("MountainBike seat height is: " + mountainBikeObj.getSeatHeight());
    }
}