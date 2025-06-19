package fr.strangeurlevrai.book.lesson;

import java.util.HashMap;
import java.util.Map;

public class Lesson10 {

    public static void getLesson() {
        System.out.println("Dixième leçon lancé");

        System.out.println("Leçon : Les HashMaps\n");

        //Hasmap stocker des valeur avec des clés
        //String = clé, Integer = contenu du coffre
        Map<String, Integer> ages = new HashMap<>();
        ages.put("StrangeurLeVrai", 16);//(clé, valeur)
        ages.put("Michel",55);
        ages.put("Bob", 27);

        System.out.println(ages.toString());
        System.out.println(ages.get("StrangeurLeVrai"));

        ages.remove("Michel");
        System.out.println(ages.toString());

        if(ages.containsKey(("StrangeurLeVrai"))){
            System.out.println("la clé existe bien");
        } else {
            System.out.println("La clé n'existe pas");
        }

        if(ages.containsValue(("27"))){
            System.out.println("la valeur existe bien");
        } else {
            System.out.println("La valeur n'existe pas");
        }

        int moyenne = 0;

        for (Map.Entry<String, Integer> element : ages.entrySet()){
            System.out.println("La clé est : " + element.getKey() + " , la valeur : " + element.getValue());
            moyenne += element.getValue();
        }

        moyenne = (moyenne /ages.size());
        System.out.println(moyenne);

        ages.clear();
        System.out.println(ages.toString());


    }
}
