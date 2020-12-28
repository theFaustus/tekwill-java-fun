package flowcontrol.ifconstruction;

public enum Grade {
    F(10), D(60), C(80), B(90), A(100);

    public final int numericValue;

    Grade(int numericValue) {
        this.numericValue = numericValue;
    }
}
