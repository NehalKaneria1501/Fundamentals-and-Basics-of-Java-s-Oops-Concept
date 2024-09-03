interface Bicycle 
{
    void canSpeedUp();
    void canApplyBreak();
}
class MountainBike implements Bicycle 
{
    @Override
    public void canSpeedUp() 
    {
        System.out.println("Speeding up mountain bike");
    }
    @Override
    public void canApplyBreak() 
    {
        System.out.println("Applying brake on mountain bike");
    }
}
public class AnonymousInnerClassDemo 
{
    public static void main(String[] args) 
    {
        Bicycle mountainBike = new MountainBike();
        mountainBike.canApplyBreak();
        mountainBike.canSpeedUp();
        Bicycle bicycle = new Bicycle() 
        {
            @Override
            public void canSpeedUp() 
            {
                System.out.println("Speeding up generic bicycle");
            }
            @Override
            public void canApplyBreak() 
            {
                System.out.println("Applying brake on generic bicycle");
            }
        };
        bicycle.canApplyBreak();
        bicycle.canSpeedUp();
    }
}