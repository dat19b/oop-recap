package Interfaces;

public class Radio implements IButton {
    @Override
    public void volume() {
        System.out.println("Vol but");
    }

    @Override
    public void freq() {
        System.out.println("Freq but");
    }
}
