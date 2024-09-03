public class Cuboid 
{
    int width;
    int height;
    int depth;
    public Cuboid(int width, int height, int depth)
     {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Cuboid(int width, int height) 
    {
        this.width = width;
        this.height = height;
        this.depth = 10; 
    }
    public Cuboid(int dimension) 
    {
        this.width = dimension;
        this.height = dimension;
        this.depth = dimension;
    }
    public Cuboid() 
    {
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }
    public int volume()
     {
        return width * height * depth;
    }
    public static void main(String[] args) 
    {
        int volume;
        Cuboid stdCuboid = new Cuboid(10, 20, 15);
        volume = stdCuboid.volume();
        System.out.println("Volume of a simple cuboid is: " + volume);
        Cuboid cuboidWidthDefaults = new Cuboid(10, 20);
        volume = cuboidWidthDefaults.volume();
        System.out.println("Volume of cuboid with default depth is: " + volume);
        Cuboid cube = new Cuboid(10);
        volume = cube.volume();
        System.out.println("Volume of cube is: " + volume);
        Cuboid defaultCuboid = new Cuboid();
        volume = defaultCuboid.volume();
        System.out.println("Volume of defaultCuboid is: " + volume);
    }
}