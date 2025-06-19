package fr.strangeurlevrai.book.fruit;

//extends a partir de la SuperClass Fruit (hérite de la classe fruit)
//clic droit, quick fixe, implements method
//implements une interface
public class Apple extends Fruit implements PeelFruit {

    public Apple(){
        super("pomme");//cible le constructeur de la super class (name)
    }

    @Override
    public void taste() {
        System.out.println("La pomme a un gout plutot sucré");
        super.mian(); //super permet de récupèrer n'importe quoi dans la SuperClass
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }

    @Override
    public boolean isPeeled() {
        return false;
    }

    @Override
    public String getSkinType() {
        return "lisse";
    }
}