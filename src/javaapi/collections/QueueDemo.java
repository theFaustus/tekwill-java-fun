package javaapi.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        //will behave as a queue
        ArrayDeque<String> shopConsumers = new ArrayDeque<>();

        shopConsumers.offer("Bob");
        shopConsumers.offer("Mike");
        shopConsumers.offer("Peter");
        shopConsumers.offer("John");
        System.out.println(shopConsumers);

        System.out.println(shopConsumers.poll());
        System.out.println(shopConsumers.poll());

        shopConsumers.offer("Glenn");
        System.out.println(shopConsumers);
        System.out.println(shopConsumers.size());

        while (!shopConsumers.isEmpty()) {
            System.out.println(shopConsumers.poll());
        }
        System.out.println(shopConsumers);

        //will behave as a stack
        ArrayDeque<String> stackOfPlates = new ArrayDeque<>();
        stackOfPlates.push("Plate 1");
        stackOfPlates.push("Plate 2");
        stackOfPlates.push("Plate 3");
        stackOfPlates.push("Plate 4");
        stackOfPlates.push("Plate 5");

        System.out.println(stackOfPlates);

        System.out.println("Guest 1 :" + stackOfPlates.pop());

        System.out.println(stackOfPlates);

        System.out.println("Guest 2 :" + stackOfPlates.pop());

        System.out.println(stackOfPlates);

        System.out.println("Guest 3 :" + stackOfPlates.pop());
        System.out.println("Guest 4 :" + stackOfPlates.pop());

        System.out.println(stackOfPlates);


        stackOfPlates.push("Plate 6");
        stackOfPlates.push("Plate 7");
        stackOfPlates.push("Plate 8");

        System.out.println(stackOfPlates);

        while (!stackOfPlates.isEmpty()) {
            System.out.println("Other guest : " + stackOfPlates.pop());
        }

        System.out.println(stackOfPlates);

        LinkedList<String> orders = new LinkedList<>();
        orders.add("Order - 1");
        orders.add("Order - 15");
        orders.push("Order - 2");
        orders.offer("Order - 4");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }

        orders.remove(0);

        String s1 = orders.peekFirst();
        String s = orders.peekLast();

        System.out.println(orders.pollLast());

        System.out.println(orders);

        while (!(orders.isEmpty())) {
            System.out.println(orders.pop());
        }

        System.out.println(orders);
    }
}
