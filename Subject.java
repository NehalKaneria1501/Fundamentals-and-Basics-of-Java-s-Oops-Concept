

public class Subject
{
    public static void main(String[]args)
    {
        int IELTS;
        int Bands=36/4;
        System.out.println("Your score");
        if(Bands>=25)
        {
            System.out.println("You can get offer letter from university"+Bands);
        }
        else if(Bands<=25)
        {
            System.out.println("You can take one skill retake"+Bands);
        }       
        else
        {
            System.out.println("Either you can move into your proffession in your nation");
        }
}
}