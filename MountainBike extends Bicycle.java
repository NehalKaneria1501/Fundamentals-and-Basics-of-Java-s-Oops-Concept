public class MountainBike implements  Bicycle 
{
    public int seatHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear) 
    {
        super(startSpeed, startGear); 
        this.seatHeight = startHeight; 
    }
    public static void main(String[] args) 
    {
        MountainBike bike = new MountainBike(5, 0, 1); 
        bike.setGear(3); 
        bike.speedUp(10); 
        bike.applyBrake(5); 
        System.out.println("Current gear: " + bike.gear); 
        System.out.println("Current speed: " + bike.speed); 
        System.out.println("Current seat height: " + bike.seatHeight); 
    }
}