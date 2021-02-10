package inheritance.interfaces;

public class SuperHero extends Person implements Runner {
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

    @Override
    public void run() {
        System.out.println("Super Hero runs");
    }
}
