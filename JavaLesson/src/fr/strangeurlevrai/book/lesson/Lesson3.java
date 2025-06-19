package fr.strangeurlevrai.book.lesson;

public class Lesson3 {

    public static void getLesson() {
        System.out.println("Troisième leçon lancé");

        System.out.println("Leçon : Les Tableaux\n");

        //crée un tableau
        String[] names = new String[]{"David", "Francis","Florien", "Lou","CLément"};//new String[]  Optionnal in recent version
        System.out.println(names[0]); // le 1 est le 0, Le 2 est le 1 , ...

        if(names[0] == names[1]){ //equals = meme ,  equalsIgnoreCase = meme malgré minuscule et majuscule
            System.out.println("même chose");
        } else {
            System.out.println("pas la même chose");
        }

        int[] numbers = {12,7,19};
        System.out.println(numbers.length);
        int calcul = (numbers[0] + numbers[1] * numbers[2])/numbers.length; //.length comptent combien de valeur
        System.out.println(calcul);

        //crée un tableau dans un tableau int
        int[][] nombres ={
                {5,7,8},
                {3,2,1},
                {9,4,2}
        };
        System.out.println(nombres[0][2] + " <---" );

        //Tableau a deux variable a chaine de caractère
        //variable Normal
        String pseudoss = "StrangeurLeVrai,Shain,Kintarrro,EragonFab";
        //Variable qui va couper la variable normal
        String[] pseudos = pseudoss.split(","); //.split()  couper la chaine de caractères grâce au symbole entre parenthèse
        System.out.println(pseudos.length + " pseudos ," + pseudos[0]);

    }
}
