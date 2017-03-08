package student;

public class RubberDuck implements Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        // these properties are inherited from Duck
        this.setQuackBehavior(quackBehavior);
        this.setFlyBehavior(flyBehavior);

    }

    public final void display() {
        System.out.println("I'm a Rubber Duck");
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        if(flyBehavior == null){
            throw new IllegalArgumentException("Enter how the duck flies.");
        }
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null){
            throw new IllegalArgumentException("Enter how the duck communicates");
        }
        this.quackBehavior = quackBehavior;
    }

    public final void performQuack() {
        quackBehavior.quack();
    }

    public final void performFly() {
        flyBehavior.fly();
    }

}
