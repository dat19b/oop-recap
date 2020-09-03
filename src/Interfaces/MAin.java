package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class MAin {
    public static void main(String[] args) {
        IButton radio = new Radio();
        IButton comp = new Computer();

        List<IButton> iButtons = new ArrayList<>();
        iButtons.add(radio);
        iButtons.add(comp);

        for (IButton b : iButtons) {
            b.freq();
            b.volume();
        }
    }
}
