package com.mykh.project.model;

public class User {
    private int id;
    private String name;
    private Integer age;
    private double availableMoney;
    private boolean isAdmin;


    public User() {
    }

    public User(int id, String name, Integer age, double availableMoney, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.availableMoney = availableMoney;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
