package fr.strangeurlevrai.book.fruit;
//extends a partir de la SuperClass Fruit (hérite de la classe fruit) 1/2
//implements une interface
//clic droit, quick fixe, implements method
public class PineApple extends Fruit implements PeelFruit {
    private boolean peeled = false;

    public PineApple(){
        super("Ananas");//cible le constructeur de la super class (name)
    }
    @Override
    public void taste() {
        System.out.println("L'ananas a un gout un peu acide");
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "piquante";
    }
}
