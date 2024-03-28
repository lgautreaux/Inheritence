/**
 * Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            System.out.println("Before exception");
            int value = arr[-1]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception: " + exception);
        }
        System.out.println("After exception");
    

    Student student = new Student();
    student.name = "Logan";
    student.gpa = 4.0f;

    Instructor instructor= new Instructor("Benny");
    instructor.name = "James";
    instructor.Salary = 50000;

    User user = new User("Jimmy");
    user.name = "Demetrick";

System.out.println(student instanceof Student);
System.out.println(student instanceof User);

    }


}
