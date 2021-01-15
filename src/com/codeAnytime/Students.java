package com.codeAnytime;

public class Students {

    private String name;
    private int age;
    private String  email;
    private String gender;

    public String getName() {
        System.out.println("Name is " + name);
        return name;
    }

    public int getAge() {
        System.out.println("Age is " + age);
        return age;
    }

    public String getEmail() {
        System.out.println("Email is " + email);
        return email;
    }

    public String getGender() {
        System.out.println("Gender is " + gender);
        return gender;
    }

    public Students(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String reading(String name){
        System.out.println("Reading the book" + name);
        return name;
    }
    public int run(int number){
        System.out.println("Is running " + number + "mil per day");
        return 2;
    }
}
