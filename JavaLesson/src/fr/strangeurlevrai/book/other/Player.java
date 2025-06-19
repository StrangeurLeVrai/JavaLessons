package fr.strangeurlevrai.book.other;

public class Player {

    //les attributs de l'objets en privéee
    private String name;
    private double health;
    private double attack;

    //à configure a chaque fois qu'on crée un nouveau
   public Player(String name, double attack, double health){
        this.name  = name; //le nom donné
        this.attack = attack; //l'attaque donné
        this.health = health;//la vie donné
   }

   public void damage(double damage){
       this.health -= damage;
       System.out.println(name + " viens de subir " + damage + " de dégats");
   }

   //clic droit , show a quick fixe, Create a getter and setter (Crée des méthodes)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //clic droit , show a quick fixe, Create a getter and setter (Crée des méthodes)
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    //clic droit , show a quick fixe, Create a getter and setter (Crée des méthodes)
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
}
