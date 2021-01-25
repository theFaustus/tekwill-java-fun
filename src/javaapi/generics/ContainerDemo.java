package javaapi.generics;

import java.util.Arrays;
import java.util.List;

public class ContainerDemo {
    public static void main(String[] args) {
        Container<Monitor, String> monitorContainer = new Container<>();
        monitorContainer.add(new Monitor("1", "DFGD-879"));
        monitorContainer.add(new Monitor("1", "DSADFGD-5678"));
        monitorContainer.add(new Monitor("1", "DFXCV-12379"));
        monitorContainer.setLotNumber("789456132-SDDSFSDFSDF");
        System.out.println(monitorContainer.getLotNumber());
        monitorContainer.printElements();

        Container<Notebook, String> notebookContainer = new Container<>();
        notebookContainer.add(new Notebook("1", "NDFGD-879"));
        notebookContainer.add(new Notebook("1", "NDSADFGD-5678"));
        notebookContainer.add(new Notebook("1", "NDFXCV-12379"));
        notebookContainer.setLotNumber("SFGERTDFGDFGDFG-345345345");
        System.out.println(notebookContainer.getLotNumber());
        notebookContainer.printElements();
        notebookContainer.setElements(Arrays.asList(new Notebook("1", "ABD-56756"), new Notebook("1", "NANA-567")));

        List<Notebook> elements = notebookContainer.getElements();
        for (Notebook element : elements) {
            System.out.println(element);
        }


        Container.printContainerElementsColonSeparated(notebookContainer.getElements());
        Container.printContainerElementsColonSeparated(monitorContainer.getElements());

        Container<Phone, String> phonesContainer = new Container<>(); //bounded to only ContainerElement
//        Container<Potato, String> potatosContainer = new Container<>(); //not allowed as it is not a ContainerElement (Potato not sharing a IS-a relationship with ContainerElement)

    }
}
