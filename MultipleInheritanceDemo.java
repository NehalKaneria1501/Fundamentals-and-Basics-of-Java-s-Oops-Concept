public interface Bicycle 
{
    void setGear(int gear);
    void speedUp(int increment);
    void applyBrake(int decrement);
}
public interface Vehicle 
{
    void canDrive();
}
public class TwoWheeler 
{
    public void canRotateTwoWheels() 
    {
        System.out.println("Two wheels rotating...");
    }
}
public class MountainBike extends TwoWheeler implements Bicycle, Vehicle 
{
    private int seatHeight;
    private int gear;
    private int speed;
    public MountainBike(int startHeight, int startSpeed, int startGear) 
    {
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }
    @Override
    public void setGear(int gear) 
    {
        this.gear = gear;
    }
    @Override
    public void speedUp(int increment) 
    {
        speed += increment;
    }
    @Override
    public void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
    @Override
    public void canDrive() 
    {
        System.out.println("Mountain bike can drive.");
    }
    public int getSeatHeight() 
    {
        return seatHeight;
    }
    public int getGear() 
    {
        return gear;
    }
    public int getSpeed() 
    {
        return speed;
    }
    public static void main(String[] args) 
    {
        MountainBike bike = new MountainBike(5, 0, 1);
        bike.setGear(3);
        bike.speedUp(10);
        bike.applyBrake(5);
        System.out.println("Current gear: " + bike.getGear());
        System.out.println("Current speed: " + bike.getSpeed());
        System.out.println("Current seat height: " + bike.getSeatHeight());
        bike.canRotateTwoWheels();
        bike.canDrive();
    }
}