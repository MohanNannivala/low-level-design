package accessmodifier.packagetwo;

import accessmodifier.packageone.*;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        //student.address = "Hello"; //will not work since it is private
        student.email = "mohan.n.s@oracle.com";
        //student.name = "mohan.n.s"; //will not work since it is default
    }
}
