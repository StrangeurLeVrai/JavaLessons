package fr.strangeurlevrai.book.lesson;

public class Lesson1 {

    public static void getLesson(){
        System.out.println("Première leçon lancé");

        System.out.println("Leçon : Les Variables\n");


        //Les différentes variables et leur utilisation
        //variable int (Number)
        int age = 16;
        //Variable String (Chain of character)
        String pseudo = "StrangeurLeVrai";
        //Variable boolean (true or false)
        boolean hasPhone = true;  //sera utilisé ailleurs

        //Send Message dans la console
        System.out.println(pseudo + " " + age);
        System.out.println("Le pseudo et age change");

        //Modify variable age
        age = age + 1; //= ++ , -1 --
        pseudo = "Strangeur";
        System.out.println(pseudo + " " + age);


        //Moyenne d'int (entier)
        int note1 = 10;
        int note2 = 20;
        int note3= 5;

        int calcul = (note1 + note2 + note3)/3;
        System.out.println("La moyenne est de " + calcul);


    }
}
