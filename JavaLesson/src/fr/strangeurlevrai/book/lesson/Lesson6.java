package fr.strangeurlevrai.book.lesson;

import fr.strangeurlevrai.book.other.Player;

public class Lesson6 {
    public static void getLesson() {
        System.out.println("Sixième leçon lancé");

        System.out.println("Leçon : Les Objets\n");
        System.out.println("Attention!!!\nCette class est relié à la class 'Player' dans le package other\n");

        //crée un premier joueur = new instance de la classe (Plus def de ces attributs)
        Player player1 = new Player("StrangeurLeVrai", 20.0, 300.0);
        System.out.println(player1.getName());
        System.out.println("Vie : " + player1.getHealth());

        //crée un deuxième joueur = new instance de la classe (Plus def de ces attributs)
        Player player2 = new Player("Shain", 15.0, 450.0);
        player2.setName("Shain_off");//change son nom
        System.out.println(player2.getName());

        System.out.println("Vie : " + player2.getHealth());
        player2.damage(player1.getAttack()); //player 2 prend des dégat, car le joueur 1 l'attaque
        System.out.println("Vie : " + player2.getHealth());
    }
}
