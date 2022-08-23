package Task3;

import java.io.InputStream;
import java.util.Scanner;

public class BookMain {
    // Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main). 
    // Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и 
    // метод void show (). Реализуйте возможность добавления в книгу названия книги, имени автора и содержания. 
    // Выведите на экран при помощи метода show() название книги, имя автора и Содержание. 

    public static void main(String[] args) {
        System.out.println("Введіть автора:");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Введіть назву:");
        Scanner bb = new Scanner(System.in);
        String t = bb.nextLine();
        System.out.println("Введіть зміст:");
        Scanner cc = new Scanner(System.in);
        String c = cc.nextLine();

        show(a, t, c);
    }
    private static void show(String a, String t, String c) {
        System.out.print("Автор книги " + a + ", назва книги " + t + ", зміст - " +c);
    }
}








