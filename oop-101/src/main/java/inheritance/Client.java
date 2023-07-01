package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setName("Naman");
        instructor.setDescription("Cool");
        instructor.saySomething();

        User user = new User();
        user.setName("Mohan");

        Mentor mentor = new Mentor();
        mentor.setName("Abhimanyu");
        mentor.setEmail("abhimanyu@gmail.com");
        mentor.setDescription("Boss");

    }
}
