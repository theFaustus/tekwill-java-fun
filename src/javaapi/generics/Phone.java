package javaapi.generics;

public class Phone extends ContainerElement {
    private String modelName;

    public Phone(String id, String modelName) {
        super(id);
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
