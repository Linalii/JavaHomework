package hw.oopTask.sort;

import java.util.Objects;

public class Auto implements Comparable<Auto>{
    String brand;

    public Auto(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(brand, auto.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int compareTo(Auto o){
        return this.brand.compareTo(o.brand);
    }
}
