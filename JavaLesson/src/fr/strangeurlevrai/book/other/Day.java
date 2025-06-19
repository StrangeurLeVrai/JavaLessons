package fr.strangeurlevrai.book.other;
//permet de faire valeur écrite invariable (des constante)
public enum Day {

    //avec les parenthèse ont peu mettre des valeur en plus dedans
    MATIN(8,"Il est l'heure de se lever"),
    MIDI(12,"A table"),
    APRESMIDI(15,"L'heure de se poser"),
    SOIR(22,"Bonne nuit"),
    NUIT(2, "Fais de beau rêve");

    private int hour;
    private String message;

    Day(int hour, String message){//donc le chiffre dans la parenthèse est un int représentant l'heure (1er paramètre), et message en plus (2eme paramètre
        this.hour = hour;//cette heure = heure du day
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public int getHour(){ //obtenir l'heure
        return hour;
    }

}
