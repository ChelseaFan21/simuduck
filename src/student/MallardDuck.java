package student;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */
public class MallardDuck implements Duck {

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        // these properties are inherited from Duck
        // 
        this.setQuackBehavior(quackBehavior);
        this.setFlyBehavior(flyBehavior);
    }

    public final void display() {
        System.out.println("I'm a Mallard Duck");
    }

    public final void performQuack() {
        quackBehavior.quack();
    }

    public final void performFly() {
        flyBehavior.fly();
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null){
            throw new IllegalArgumentException("Please enter how the duck quacks.");
        }
        this.quackBehavior = quackBehavior;
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

}
