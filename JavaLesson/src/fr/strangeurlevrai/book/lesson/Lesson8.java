package fr.strangeurlevrai.book.lesson;

import fr.strangeurlevrai.book.other.Day;

public class Lesson8 {

    public static void getLesson() {
        System.out.println("Huitième leçon lancé");

        System.out.println("Leçon : Les Enumération\n");
        System.out.println("Attention!!!\nCette class est relié a l'enum Day dans le package Other\n");

        Day moment = Day.MATIN; //apllique a la variable moment MATIN
        System.out.println(moment);

        moment = Day.SOIR;
        System.out.println("Nous sommes actuellement le " + moment.name().toLowerCase() + " ,il est actuellement " + moment.getHour() + " h, " +moment.getMessage());

        for(Day moments : Day.values()){
            if(!moments.equals(Day.SOIR)) {
                System.out.println("Nous sommes actuellement le " + moments.name().toLowerCase() + " ,il est actuellement " + moments.getHour() + " h, " + moments.getMessage());
            }
        }
    }
}
