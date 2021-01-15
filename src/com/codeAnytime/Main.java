package com.codeAnytime;

public class Main {

    public static void main(String[] args) {
	Teachers teachers = new Teachers("Mats",23,"mats@email.com",true);
		teachers.getName();
		teachers.getEmail();
		teachers.getAge();
		teachers.getClass();
		teachers.instructs();

		// book instans
		Books books = new Books(12345,"The love",340, 2);
		books.getIsbn();
		books.getName();
		books.getPages();
		books.getWeight();

		// students
		Students students = new Students("Ahmed",26,"mukhtar1100@hotmail.com","male");
		students.getName();
		students.getAge();
		students.getEmail();
		students.getGender();


    }
}
