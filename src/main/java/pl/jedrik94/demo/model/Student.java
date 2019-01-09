package pl.jedrik94.demo.model;

import java.util.Arrays;

public class Student {
    private int id;
    private String surname;
    private String name;
    private int age;
    private boolean active;
    private Address address;
    private String[] languages;

    public Student() {
    }

    public Student(String surname, String name, int age, boolean active) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public Student(String surname, String name, int age, boolean active, Address address, String[] languages) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.active = active;
        this.address = address;
        this.languages = languages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", address=" + address +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
