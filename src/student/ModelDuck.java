package student;

public class ModelDuck implements Duck {
    
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.setQuackBehavior(quackBehavior);
        this.setFlyBehavior(flyBehavior);
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
    
    public student.FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        if(flyBehavior == null){
            throw new IllegalArgumentException("Please enter the ducks fly behavior");
        }
        this.flyBehavior = flyBehavior;
    }
    
    public student.QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null){
            throw new IllegalArgumentException("Please enter how the duck communicates");
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
