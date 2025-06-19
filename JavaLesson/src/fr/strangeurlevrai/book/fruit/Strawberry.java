package fr.strangeurlevrai.book.fruit;

public class Strawberry extends Fruit{

    public Strawberry(String name) {
        super("fraise");
    }

    @Override
    public void taste() {
        System.out.println("le gout est plutot sucrée");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
