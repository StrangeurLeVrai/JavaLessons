package fr.strangeurlevrai.book.lesson;

public class Lesson5 {

    public static void getLesson() {
        System.out.println("Cinquième leçon lancé");

        System.out.println("Leçon : Les Fonctions\n");

        //appelle la fonction a s'executer
        sendMessage("test", 9);//avec méthode, sa va dire test 9
        sendMessage("fromage", 17);//fromage 17

        int money = 850;
        int pricephone = 800;
        boolean hasPhone = false;

        sendMessage("La différence est de : " + getResultat(money, pricephone,hasPhone), 9);
    }
    //private = accessible que dans cette classe, public = accessible a tous les classes, protected = accessible a cette classe et a celle qu'il l'utilise
    //static = désigné un accés directe (pas le droit de le faire tous le temps) ,
    //Variable pour le types de données retourné, void pour dire qu'on ne retourne a rien/dans le vide
    private static int getCalcul(){
        return 5; //vu que c'est un entier on retourne 5, mais si boolean par exemple sa ne marche pas


    }

    private static void sendMessage(String message, int number){
        System.out.println(number +"Ceci est un petit message dans la console : " + message );
    }


    private static int getResultat(int money, int pricephone, boolean hasPhone){
        if(money >= pricephone && !hasPhone){
            System.out.println("Tu peux acheter ce téléphone");
        } else {
            System.out.println("Tu ne peux pas acheter ce téléphone");
        }

        return money - pricephone;
    }
}
