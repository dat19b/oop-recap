public class PaperTray {

    private int paper;

    public boolean usePaper(){

        this.paper--;

        return true;
    }

    public void load(int paper){
        this.paper = this.paper + paper;
    }

    public int display(){
        return this.paper;
    }

}
