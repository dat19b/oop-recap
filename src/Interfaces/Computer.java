package Interfaces;

public class Computer implements IButton {
    @Override
    public void volume() {
        System.out.println("Comp vol");
    }

    @Override
    public void freq() {
        System.out.println("Comp freq");
    }
}
