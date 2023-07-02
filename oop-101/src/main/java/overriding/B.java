package overriding;

public class B extends A{
    void doSomething(){
        super.doSomething();
        System.out.println("I am B");
    }
}
