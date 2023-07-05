public class Crow extends Bird implements Flyable{
    @Override
    public void fly() {
        FlyingBehaviour crowSparrowFlyingBehaviour = new CrowSparrowFlyingBehaviour();
        crowSparrowFlyingBehaviour.fly();
    }
}
