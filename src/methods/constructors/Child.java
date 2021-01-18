package methods.constructors;


public class Child extends Parent {
    private int b;

    public Child() {
        this(1);
    }

    public Child(int i) {
        super(4);
//        super(); here we address our parents
//        int a = super.a;
//        super.foo();

//        this(); here we address ourselves
//        int b = this.b;
//        this.bar();
    }

    private void bar() {

    }
}
