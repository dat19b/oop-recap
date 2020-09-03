public class Machine {

    // attributter - tilstand
    private boolean isOn;

    public void power() {
        this.isOn = !this.isOn;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "isOn=" + isOn +
                '}';
    }

    // metoder


}
