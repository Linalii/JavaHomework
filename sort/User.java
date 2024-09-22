package hw.oopTask.sort;

import collection.comparator.Product;

import java.util.Objects;

public class User implements Comparable<User> {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int resultCompareByAge = Integer.compare(this.age, o.age);
        int resultCompareByName = this.name.compareTo(o.name);

        if (resultCompareByAge == 0) {
                return this.name.compareTo(o.name);
        }
        return resultCompareByAge;
    }
}
