package fr.strangeurlevrai.book.lesson;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Lesson13 {

    public static void getLesson() {
        System.out.println("Treizième leçon lancé");

        System.out.println("Leçon : Les fichiers\n");

        File folder =new File("C://Users//jderet/Desktop/IntellIJ JD/Programme/dossier1/"); // crée un dossier (dossier1)
        File file = new File("C://Users//jderet/Desktop/IntellIJ JD/Programme/doc.txt"); //le chemin allant jusqu'au dossie/nomfichier.extension
        File html = new File("C://Users//jderet/Desktop/IntellIJ JD/Programme/test.html"); //le chemin allant jusqu'au dossie/nomfichier.extension

        if(!folder.exists()){ //si le dossier n'existe pas
            folder.mkdir(); //crée le dossier
        }

        List<String> htmlLines = Arrays.asList("<html>","<head>","<title>Mon titre</title>","</head>","<body>","<p> Salut les gens c'est strangeur !</p>","</body>","</html>"); //tableau qui va être utiliser plus tard

        if(!file.exists()){ //si le fichier n'existe pas
            try {
                file.createNewFile(); // le crée
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter writer = new FileWriter(file); //writer pour écrire dans file
                BufferedWriter bw = new BufferedWriter(writer);//bw qui sert d'instance a writer
                bw.write("Salut les gens c'est Strangeurlevrai !"); //écrit
                bw.newLine();//sauté une ligne
                bw.write("comment ça va ?"); //écrit sur la ligne
                bw.newLine();//sauté une ligne
                bw.write("Test !"); //écrit sur la ligne
                bw.close();//fermer le buffer
                writer.close();//ferme l'écriveur

                for (String htmls : htmlLines) { //va écrire dans le fichier html
                    bw.write(htmls);
                    bw.newLine();
                    System.out.println();
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(html), "UTF-8"));
                String line = reader.readLine();

                while (line != null) ;
                {
                    System.out.println(line);
                    line = reader.readLine();
                }

                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
