class Bicycle 
{
    protected int gear;
    protected int speed;
    public Bicycle(int startSpeed, int startGear) 
    {
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue) 
    {
        gear = newValue;
    }
    public void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
    public void speedUp(int increment) 
    {
        speed += increment;
    }
    public static void main(String[] args) 
    {
        Bicycle bike = new Bicycle(0, 1);
        bike.setGear(3); 
        bike.speedUp(10); 
        bike.applyBrake(5); 
        System.out.println("Current gear: " + bike.gear);
        System.out.println("Current speed: " + bike.speed);
    }
}