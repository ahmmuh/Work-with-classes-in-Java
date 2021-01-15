package com.codeAnytime;

public class Teachers {
    private String name;
    private int age;
    private String email;
    private boolean hasClass;

    public String getName() {
        System.out.println("The name of the teacher is " + name);
        return name;
    }

    public int getAge() {
        System.out.println("age is " + age);
        return age;
    }

    public String getEmail() {
        System.out.println("Email is " + email);
        return email;
    }

    public boolean isHasClass() {
        System.out.println("Teacher has " + hasClass);
        return hasClass;
    }

    public Teachers(String name, int age, String email, boolean hasClass) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasClass = hasClass;
    }

    public void instructs(){
        System.out.println("The teacher is in the class");
    }
}
