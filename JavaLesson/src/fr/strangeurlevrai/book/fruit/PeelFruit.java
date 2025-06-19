package fr.strangeurlevrai.book.fruit;
//sert juste a crée des méthodes
public interface PeelFruit {

    //peut que crée des méthode abstrait (abstratc non obligé car lors de la compilation, il met automatiquement en abstract)
    public abstract boolean isPeeled(); //si oui ou non, sa peau a été enlevé

    public abstract String getSkinType();//qu'elle type de peu , il a

}
