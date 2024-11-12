package org.example;

public class Main {
    public static void main(String[] args) {
        int customerAge = 6;
        int gender = 2;

        if (gender == 1) {
            if (customerAge >= 6 && customerAge <= 18) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა სკოლის მოსწავლის ვარდისფერი ბარათი");
            } else if (customerAge >= 19 && customerAge <= 24) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა სტუდენტის ვარდისფერი ბარათი");
            } else if (customerAge >= 25 && customerAge <= 64) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა ბიზნეს ვარდისფერი ბარათი");
            } else if (customerAge >= 65) {
                System.out.println("შენ შეგიძლია გახსნა საპენსიო ვარდისფერი ბარათი");
            } else {
                System.out.println("6 წლამდე ასაკის ბავშვი ვერ გახსნის ბარათს");
            }
        }

        else {
            if (customerAge >= 6 && customerAge <= 18) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა სკოლის მოსწავლის ლურჯი ბარათი");
            } else if (customerAge >= 19 && customerAge <= 24) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა სტუდენტის ლურჯი ბარათი");
            } else if (customerAge >= 25 && customerAge <= 64) {
                System.out.println("გილოავ, შენ შეგიძლია გახსნა ბიზნეს ლურჯი ბარათი");
            } else if (customerAge >= 65) {
                System.out.println("შენ შეგიძლია გახსნა საპენსიო ლურჯი ბარათი");
            } else {
                System.out.println("6 წლამდე ასაკის ბავშვი ვერ გახსნის ბარათს");
            }
        }
        }

}