package fr.strangeurlevrai.book.lesson;

import java.util.ArrayList;

public class Lesson9 {

    public static void getLesson() {
        System.out.println("Neuvième leçon lancé");

        System.out.println("Leçon : Les ArrayList\n");
        //Arraylist , un tableau dynamique (Sans obligation)
        ArrayList list = new ArrayList();
        list.add("25");
        list.add(("Texte"));
        list.add(new Object());

        System.out.println(list);//donné la liste
        System.out.println(list.get(0));//prend le premier de la lsite

        list.remove(0);//enlevè de la liste
        System.out.println(list);

        list.clear();//nettoye la liste
        System.out.println(list);

        list.add("patate");
        list.add("30");// rajouter

        if (list.size() != 1) {//si sa taille n'ai pas de 1
            System.out.println(list.size());
        }
        if (list.contains(30)) {//contient 30
            System.out.println("Il contient bien le chiffre 30");
        }

        //Arraylist , un tableau dynamique (Sans obligation)
        ArrayList<Integer> integ = new ArrayList<>(); //interger pour les nombres / String pour les chaines de caractères
        integ.add(30);
        integ.add(15);
    }
}
