package javaapi.generics;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String power;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null){
//            return false;
//        }
//
//        if(this == obj){
//            return true;
//        }
//
//        Car obj1 = (Car) obj;
//        return this.brand.equals(obj1.brand) && this.model.equals(obj1.model);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(this.power, car.power);
    }

    @Override
    public int hashCode() {
        //        return 31 * brand.length() + 2 + model.length() + 1; bad/broken implementation, easily generates hashcode collisions
        return Objects.hash(brand, model, power);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
