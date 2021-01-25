package javaapi.generics;

public class Monitor extends ContainerElement {
    private String modelName;

    public Monitor(String id, String modelName) {
        super(id);
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
