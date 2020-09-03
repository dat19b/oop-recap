public class IncJet extends Printer {

    public IncJet(PaperTray paperTray) {
        super(paperTray);
    }

    @Override
    public void print(String text, int amount) {

        System.out.println("I am an Inkjet");
    }
}
