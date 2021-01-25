package javaapi.generics;

import java.util.ArrayList;
import java.util.List;

public class Container<T extends ContainerElement, T1 extends String> {
    private List<T> elements = new ArrayList<>();
    private T1 lotNumber;

    public static <E> void printContainerElementsColonSeparated(List<E> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1)
                System.out.print(list.get(i) + " : ");
            else
                System.out.print(list.get(i));
        }
        System.out.println("]");
    }

    public T1 getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(T1 lotNumber) {
        this.lotNumber = lotNumber;
    }

    public boolean add(T element) {
        return elements.add(element);
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
