public class Machine {

    // attributter - tilstand
    protected boolean isOn;

    public void power() {
        this.isOn = !this.isOn;
    }

    /*public boolean getIsOn(){
        return this.isOn;
    }*/

    @Override
    public String toString() {
        return "Machine{" +
                "isOn=" + isOn +
                '}';
    }

    // metoder


}
