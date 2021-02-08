package inheritance.classes;

public class SuperHero extends Person {
    private String nickname;

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public void live() {
        System.out.println("SuperHero is living...");
    }
}
