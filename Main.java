class Main
{
    public static void main(String[]args)
    {
        Student pari=new Student(1,"Pari","Mississauga,On");
        Student pari2=new Student(2,"Pari","Mississauga,On");
        Student pari3=new Student(3,"Pari","Mississauga,On");
        System.out.println(pari.equals(pari2));
    }
}