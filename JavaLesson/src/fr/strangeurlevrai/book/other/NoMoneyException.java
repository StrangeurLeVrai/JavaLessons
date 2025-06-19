package fr.strangeurlevrai.book.other;

public class NoMoneyException extends Exception {

    private  static final long serialVersionUID = 1L;

    public NoMoneyException(){
        super("Attention la balance ne peut être négative");
    }
}
