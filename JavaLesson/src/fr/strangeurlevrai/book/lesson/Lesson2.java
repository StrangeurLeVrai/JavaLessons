package fr.strangeurlevrai.book.lesson;

public class Lesson2 {

    public static void getLesson() {
        System.out.println("Deuxième leçon lancé");

        System.out.println("Leçon : Les Conditions\n");

        // = affectation , == comparaison
        int money = 2000;
        int age = 16;
        int year = 3;

        int argent = 1000;
        int pricephone = 800;
        //variable true or false
        boolean hasPhone = true;

        //condition avec if else
        if(money == 2000 && money != 2100){ //== égale ,!= pas égale, >= supérieur, <= inférieur , && rajouter une vérification/condition
            System.out.println("les deux valeurs sont bien les mêmes");
        } else {
            System.out.println("les deux valeur ne sont plus les mêmes");
        }

        //condition if else/if else
        if(age >= 18){
            System.out.println("la personne est majeur");
        } else if( age <= 10) {
            System.out.println("La personne est mineur et très jeune");
        } else {
            System.out.println("La personne est mineur");
        }

        //condition switch (boucle)
        switch(year){
            //dans le cas 1 ( une année)
            case 1:
                System.out.println("Un peu court une année");
                //casser la boucle
                break;
            case 2:
                System.out.println("deux années bon choix");
                break;
            case 3:
                System.out.println("Trois bonnes années");
                break;
            //si aucun des cas est faits (Message par défauts)
            default: System.out.println("Pas trop d'avis sur ce nombre d'anné");
        }

        if(money >= pricephone && !hasPhone ){ //! devant un mot = négation
            System.out.println("Tu peux acheter le téléphone");
        } else {
            System.out.println("Tu ne peux pas acheter le téléphone");
        }
    }
}
