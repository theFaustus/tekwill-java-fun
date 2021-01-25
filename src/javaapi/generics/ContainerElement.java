package javaapi.generics;

public class ContainerElement {
    protected String id;

    public ContainerElement(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContainerElement{" +
                "id='" + id + '\'' +
                '}';
    }
}
