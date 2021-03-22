package com.example.hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String city;

        System.out.println("Hello. What is your name?");
        name = scanner.nextLine();
        System.out.println("It's nice to meet you, " + name + ". How old are you?");
        age = scanner.nextInt();
        System.out.println("I see that you are still quite young at only " + age);
        System.out.println("Where do you live?");
        city = scanner.next();
        System.out.println("Wow! I've always wanted to go to " + city + ". Thanks for chatting with me. Bye!");





    }
}
