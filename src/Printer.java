public class Printer extends Machine {

    private PaperTray paperTray;

    public Printer(PaperTray paperTray){
        //this.paperTray = new PaperTray();// composition
        this.paperTray = paperTray;  // dependency injection - aggregation
        this.paperTray.load(3);
    }


    public void print(String text, int amount){
                if(!isOn){
                    System.out.println("Turn printer on please");
                } else {

                        for (int i = 1; i <= amount; i++) {
                            if (paperTray.display() == 0){
                                System.out.println("Pleas load more paper");
                            } else {
                            System.out.println(text);
                            paperTray.usePaper();
                        }
                    }
                }







    }

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + isOn +
                '}';
    }
}
