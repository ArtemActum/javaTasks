package HomeWork2.Task4_OOP;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String city;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.gender = "Не указан";
        this.city = "Не указан";
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "Не указан";
        this.city = "Не указан";
    }


    public Person(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
