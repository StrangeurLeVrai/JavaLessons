package fr.strangeurlevrai.book.lesson;

import fr.strangeurlevrai.book.fruit.Apple;
import fr.strangeurlevrai.book.fruit.PeelFruit;
import fr.strangeurlevrai.book.fruit.PineApple;

public class Lesson7 {

    public static void getLesson() {
        System.out.println("Septième leçon lancé");

        System.out.println("Leçon : L'héritage et l'interface\n");
        System.out.println("Attention!!!\nCette class est relié au package fruit\n");

        Apple a = new Apple(); //crée une instance de apple
        a.taste();
        a.mian();

        PineApple pen = new PineApple(); //crée une instance de pineapple
        pen.taste();
        pen.mian();

        if(!(a instanceof PeelFruit)){  //pomme n'a pas une instance de peelFruit
            PeelFruit fruit = pen;
            fruit.getSkinType(); //on peut tous obtenir de l'ananas
        }
    }
}
