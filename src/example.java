public class example
{
    public static void main(String[] args)
    {
        Student jen = new Student();
        jen.name = "Jen";
        jen.age = 21;

        Student beth = new Student();
        beth.name = "Beth";
        beth.age = 15;

        System.out.println("Jen is " + jen.age);
        System.out.println("Beth is " + beth.age);

        ageSwap(jen, beth);

        System.out.println("Jen is " + jen.age);
        System.out.println("Beth is " + beth.age);
    }

    private static void ageSwap(Student a,
                                Student b)
    {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    static class Student
    {
        String name;
        int age;
    }
}