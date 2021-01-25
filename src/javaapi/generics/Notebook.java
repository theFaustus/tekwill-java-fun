package javaapi.generics;

public class Notebook extends ContainerElement {
    private String modelName;

    public Notebook(String id, String modelName) {
        super(id);
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
