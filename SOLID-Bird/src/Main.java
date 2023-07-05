public class Main {
    public static void main(String[] args) {
        Crow crow = new Crow();
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();
        Pigeon pigeon = new Pigeon();
        Sparrow sparrow = new Sparrow();

        crow.fly();
        pigeon.fly();
        sparrow.fly();

        System.out.println("-----------------------------------------------");

        crow.eat();
        pigeon.eat();
        sparrow.eat();
        ostrich.eat();
        penguin.eat();
    }
}