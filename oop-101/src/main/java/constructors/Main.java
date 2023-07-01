package constructors;

public class Main{
    public static void main(String[] args) {

        Student mohan = new Student();
        mohan.name="Mohan";
        mohan.address="CLK";
        mohan.state="ACTIVE";
        mohan.pauseCourse();
        mohan.changeBatch("Oct-2022");

        Student mohanCopy = new Student(mohan);

    }
}
