package methods;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Mike", "Husky", "789456");
        System.out.println(dog.getName());
        dog.setName("Bob");
        System.out.println(dog.getName());
        System.out.println(dog.getIdNumber());
        dog.setIdNumber("6542132");
        String idNumber = dog.getIdNumber();
        System.out.println(dog.getIdNumber());
    }
}
