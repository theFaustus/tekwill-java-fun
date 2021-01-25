package javaapi.generics;

import java.util.Objects;

public class Bar {
    String name;

    public Bar(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return Objects.equals(name, bar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}