package overriding;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.doSomething();

        A a=new B();
        a.doSomething();
    }
}
