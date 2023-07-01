package accessmodifier;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        //student.address = "Hello"; //will not work since it is private
        student.email = "mohan.n.s@oracle.com";
    }
}
