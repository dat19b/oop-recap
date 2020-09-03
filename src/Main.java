import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PaperTray paperTray = new PaperTray();
        Printer p = new Printer(paperTray);
        p.power();
        p.print("Hello dat19b", 5);
        System.out.println(p.toString());

        List<Printer> printers = new ArrayList<>();
        printers.add(new IncJet(paperTray));
        printers.add(new IncJet(paperTray));
        printers.add(new LaserPrint(paperTray));
        printers.add(new Printer(paperTray));

        for (Printer pr : printers) {
            pr.print("jsldfjkl", 7);
        }

    }


}
