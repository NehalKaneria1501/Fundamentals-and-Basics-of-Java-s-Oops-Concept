public class Convet
{
    public static void main(String[]args)
    {
        double Kilometers=7.5;
        double Miles=convertsKilometersToMiles(kilometers);
        System.out.println(kilometers+"kilometers is equals to"+miles+"miles");
        public static double convertsKilometersToMiles(double Kilometers)
        {
            final CONVERSION_FACTOR=0.621371;
            return kilometers*CONVERSION_FACTOR;
        }
    }
}