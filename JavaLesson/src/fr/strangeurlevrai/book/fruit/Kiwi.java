package fr.strangeurlevrai.book.fruit;
//implements une interface
public class Kiwi extends Fruit implements PeelFruit {

    public Kiwi(String name) {
        super("Kiwi");
    }

    @Override
    public void taste() {
        System.out.println("le gout est plutot sucrée mian mian");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String getSkinType() {
        return "doux";
    }
}
