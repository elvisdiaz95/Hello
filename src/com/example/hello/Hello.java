package com.example.hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        //Las lineas en blanco mas de una se ve raro. Deja una sola si quieres dividir algo.
        Scanner scanner = new Scanner(System.in);
        //Las variables siempre ponle un valor inicial. String name = "". int age = 0 ....
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




        //Las lineas en blanco mas de una se ve raro. Deja una sola si quieres dividir algo.
    }
}
