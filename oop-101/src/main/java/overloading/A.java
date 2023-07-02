package overloading;

public class A {

    public void print(){
        System.out.println("Hello");
    }

    public void print(String name){
        System.out.println("Hello "+name);
    }
}
