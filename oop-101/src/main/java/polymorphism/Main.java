package polymorphism;

import java.util.List;

public class Main {

    //using this function we can change password of student, mentor and TA since all are users.
    public static void changePasswordOfAllUser(List<User> users){
        for(User user:users){
            /*
            To avoid the run time exception compiler will not allow you to call the child attribute and methods.
             */
            user.changePassword();

            /*
            if we need to call the child attributes or methods we can typecast.
             */
            if(user instanceof Student){
                Student student= (Student) user;
                student.changeBatch();
            }

        }
    }

    public static void main(String[] args) {

        User user = new TA();
        //user.expertise ="Java"; //throws error (Compile time error)

        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users=List.of(
                user1,
                user2,
                user3,
                user);

        changePasswordOfAllUser(users);
    }
}
