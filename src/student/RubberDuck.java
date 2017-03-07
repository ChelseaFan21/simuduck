package student;

public class RubberDuck implements Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        // these properties are inherited from Duck
        this.setQuackBehavior(quackBehavior);
        this.setFlyBehavior(flyBehavior);

    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    public student.FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        if(flyBehavior == null){
            throw new IllegalArgumentException("Enter how the duck flies.");
        }
        this.flyBehavior = flyBehavior;
    }

    public student.QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null){
            throw new IllegalArgumentException("Enter how the duck communicates");
        }
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
