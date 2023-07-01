package accessmodifier.packageone;

public class Student {
    String name;
    private String address;
    public String email;
    String batch;
    double psp;
    String state;

    public Student(){
    }

    public Student(String name, String email){
        this.name=name;
        this.email=email;
    }

    //copy constructor.
    public Student(Student other){
        name=other.name;
        address=other.address;
        email=other.email;
        batch=other.batch;
        state=other.state;
    }

    void changeBatch(String newBatch){
        this.batch=newBatch;
    }

    void pauseCourse(){
        this.state="PAUSED";
    }
}
