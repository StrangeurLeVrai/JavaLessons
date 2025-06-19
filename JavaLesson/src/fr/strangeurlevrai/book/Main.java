package fr.strangeurlevrai.book;

import fr.strangeurlevrai.book.lesson.*;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sommaire \nLeçon 1 : Variables\nLeçon 2 : Conditions\nLeçon 3 : Tableaux\nLeçon 4 : Boucles\nLeçon 5 : Fonctions\nLeçon 6 : Les Objets\nLeçon 7 : héritage & interface\nLeçon 8 : Enumérations\nLeçon 9 : ArrayList9");
        System.out.println("Entrez le numéro de la lesson : ");

        int numero = scanner.nextInt(); //Prend les nombre donné dans le tableau de commandes

        System.out.println("Vous avez entré le numéro de la leçon " + numero +"\n");

        scanner.close();

        readLesson(numero);
        System.out.println("\nLe code est commenté en entier, donc n'hésiter pas a le regarder");
    }

    private static void readLesson(int numero){
        switch (numero){
            case 1:
                Lesson1.getLesson();
                break;
            case 2:
                Lesson2.getLesson();
                break;
            case 3:
                Lesson3.getLesson();
                break;
            case 4:
                Lesson4.getLesson();
                break;
            case 5:
                Lesson5.getLesson();
                break;
            case 6:
                Lesson6.getLesson();
                break;
            case 7:
                Lesson7.getLesson();
                break;
            case 8:
                Lesson8.getLesson();
                break;
            case 9:
                Lesson9.getLesson();
                break;
            default: System.out.println("Cette leçon n'existe pas");
        }

    }

}
