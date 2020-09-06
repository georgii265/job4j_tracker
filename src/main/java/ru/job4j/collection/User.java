package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Он должен сравнить имена, если они равны, то сравнить возраст.
     * @param users
     * @return
     */
    @Override
    public int compareTo(User users) {
        int rsl = this.name.compareTo(users.name);
        if (rsl == 0) {
            rsl = Integer.compare(this.age, users.age);
        }

        return rsl;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
