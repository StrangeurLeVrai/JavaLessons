package fr.strangeurlevrai.book.fruit;
//Superclass réuinnisant les points communs l'héritage donc

//abstract obligatoire (abstract permet de redefinir les choix)
public abstract class Fruit {

    private String name;

    public Fruit(String name){
        this.name = name;
    }

    //sans les abstract, y a pas de méthodes (méthode permet de définir chaqu'un des objets)
    public abstract void taste();//savoir son goûts

    public abstract int getSize();//savoir sa taille

    public abstract boolean hasSeed(); //Si il a des graines ou nom

    //méthode accessible a l'ensemble de fruit sans la redéfinir
    public void mian(){
        System.out.println("Miamn, manger 5 fruits et légume par jour / Nom du fruits : " + getName());
    }

    public String getName(){
        return name;
    }
}
