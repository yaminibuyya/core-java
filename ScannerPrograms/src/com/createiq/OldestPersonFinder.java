package com.createiq;

import java.util.ArrayList;
import java.util.Scanner;

public class OldestPersonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        System.out.print("Enter the number of users: ");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer

            User user = new User(username, age);
            users.add(user);
        }

        User oldestPerson = findOldestPerson(users);
        System.out.println("The oldest person is: " + oldestPerson.getUsername() + " (" + oldestPerson.getAge() + " years old)");
    }

    public static User findOldestPerson(ArrayList<User> users) {
        User oldestPerson = null;
        int maxAge = Integer.MIN_VALUE;

        for (User user : users) {
            if (user.getAge() > maxAge) {
                maxAge = user.getAge();
                oldestPerson = user;
            }
        }

        return oldestPerson;
    }
}

class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}