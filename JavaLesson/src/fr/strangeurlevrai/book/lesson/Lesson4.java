package fr.strangeurlevrai.book.lesson;

public class Lesson4 {

    public static void getLesson() {
        System.out.println("Quatrième leçon lancé");

        System.out.println("Leçon : Les Boucles\n");

        //boucle for
        for(int i = 0; i <= 100; i++){ //( Valeur de départ, Valeur "d'arrêt"; Modification de la valeur)
            System.out.println("Ceci est le tour de boucle numero " + i);
        }

        //boucle foreach (pour chaque élément)
        String[] names = new String[]{"David", "Francis","Florien", "Lou","CLément"};
        for (String str: names) { //str va faire chacun des élément du tableau de la variable
            System.out.println(str);
        }

        int[] notes = {7, 8 , 12,2 };
        int calcul = 0;

        for(int note : notes){
            calcul = calcul + note;
        }
        System.out.println("la moyenne de la personne est de " + calcul /notes.length);

        //while (Tant que)
        int i = 0;

        while(i != 7){ //pour une boucle qui s'arrete jamais true , for(;;) = boucle infini
            i++;
            System.out.println("fromage :" + i);
        }

        //do while
        boolean hasPhone = true;
        do{
            System.out.println("fromage de chèvres");
        } while(!hasPhone); //continue tant qu'il na pas de téléphone
    }
}
