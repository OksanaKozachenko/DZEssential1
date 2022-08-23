package Task2;

import java.util.Scanner;

public class Rectangle {
    //Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
    // В теле класса создать два поля, описывающие длины сторон double side1, double side2.
    // Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
    // и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
    // Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран
    // периметр и площадь.

    public static double areaCalculator (double side1, double side2){
        double area  = side1*side2;
        return area;
    };
    public static double perimeterCalculator (double side1, double side2) {
        double perimeter = side1 * 2 + side2 * 2;
        return perimeter;
    };

    public static void main(String[] args) {
        System.out.println ("Введіть довжину першої сторони: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println ("Введіть довжину другої сторони: ");
        Scanner bb = new Scanner(System.in);
        int b = bb.nextInt();

        System.out.println("Площа " + areaCalculator(a,b));
        System.out.println("Периметр " + perimeterCalculator(a,b));

    }
}


