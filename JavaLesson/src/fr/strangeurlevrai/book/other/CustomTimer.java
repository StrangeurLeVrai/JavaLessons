package fr.strangeurlevrai.book.other;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

        //Façon plus difficile
        int time = 10;
        //temps de 10 s
        @Override
        public void run() {
            System.out.println("time : " + time); //va envoyer ce message chaque second

            if(time == 5){ //si le int time est a 0
                System.out.println("Attention"); //Envoie ce message
            }

            if (time == 0){ //si le int time est a 0
                cancel();//va arreter le chrono
                Random r = new Random(); //Aléatoire
                int alea = r.nextInt(6 -1)+1; //entre 1 et 6 + sécurité
                System.out.println("Nombre aléatoire : " + alea ); //imprime lenombre aléatoire
            }
            time--; //enleve du temps


    }
}
