interface Bicycle 
{
    void canSpeedUp();
    void canApplyBrake();
}
class MountainBike implements Bicycle 
{
    @Override
    public void canSpeedUp() 
    {
        System.out.println("Speeding up mountain bike");
    }
    @Override
    public void canApplyBrake() 
    {
        System.out.println("Applying brake on mountain bike");
    }
}
public class AnonymousInnerClassDemo 
{
    public static void main(String[] args) 
    {
        Bicycle mountainBike = new MountainBike();
        mountainBike.canApplyBrake();
        mountainBike.canSpeedUp();
        Bicycle bicycle = new Bicycle() 
        {
            @Override
            public void canSpeedUp() 
            {
                System.out.println("Speeding up generic bicycle");
            }
            @Override
            public void canApplyBrake() 
            {
                System.out.println("Applying brake on generic bicycle");
            }
        };
        bicycle.canApplyBrake();
        bicycle.canSpeedUp();
    }
}