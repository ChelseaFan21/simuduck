package student;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck(new Quack(), new FlyWithWings());
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck(new MuteQuack(), new FlyNoWay());
        model.display();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
