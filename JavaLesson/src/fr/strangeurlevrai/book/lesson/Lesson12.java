package fr.strangeurlevrai.book.lesson;

import fr.strangeurlevrai.book.other.CustomTimer;

import java.util.Timer;

public class Lesson12 {

    public static void getLesson() {
        System.out.println("Douzième leçon lancé");

        System.out.println("Leçon : Les Chronomètre\n");
        System.out.println("Attention!!!\nCette class est relié à la class 'CustomTimer' dans le package other\n");

        //chronomètre
        Timer chrono = new Timer(); //crée le timer
        chrono.schedule(new CustomTimer(), 1000 , 1000 ); //lancer le timer

            /* Façon classique
            int time = 10; //temps de 10 s
            @Override
            public void run() {
                System.out.println("time : " + time); //va envoyer ce message chaque second

                if(time == 5){ //si le int time est a 0
                    System.out.println("Attention"); //Envoie ce message
                }

                if (time == 0){ //si le int time est a 0
                    cancel();//va arreter le chrono
                }
                time--; //enleve du temps
            }
        }, 1000, 1000 ); //Millisecond , 1 second = 1000 ms (delay , period)
        */
    }
}
