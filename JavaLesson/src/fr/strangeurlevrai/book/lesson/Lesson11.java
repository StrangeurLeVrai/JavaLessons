package fr.strangeurlevrai.book.lesson;

import fr.strangeurlevrai.book.other.NoMoneyException;

public class Lesson11 {

    public static void getLesson() {
        System.out.println("Onzième leçon lancé");

        System.out.println("Leçon : Les Exceptions\n");
        System.out.println("Attention!!!\nCette class est relié à la class 'NoMoneyException' dans le package other\n");

        int[] numbers = { 4, 7, 9, 1};
        int calcul = 5 + 1;

        try {
            System.out.println(numbers[4]);
            calcul = calcul / 0;
        } catch(ArrayIndexOutOfBoundsException | ArithmeticException e ){//erreur dit pas l'IDE
            e.printStackTrace();
            System.out.println("l'erreur est ici");
        } finally {
            System.out.println("Finalement la vie est belle");
        }

        double balance = 500;
        double price = 550;
        try {
            buy(balance, price);
        } catch (NoMoneyException e) {
            e.printStackTrace();
        }
    }

    private static void buy(double balance, double price) throws NoMoneyException {

        double b = balance - price;

        if(b<0){
            throw new NoMoneyException();
        }
        System.out.println(b);

    }
}
