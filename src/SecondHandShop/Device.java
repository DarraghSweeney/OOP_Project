package SecondHandShop;

public class Device extends Item{

    private String Battery;
    private boolean ChargerAndCable;

    public Device(String type, String name, double buyFor, double sellFor, String itemCondition, String battery, boolean chargerAndCable) {
        super(type, name, buyFor,  itemCondition);
        setBattery(battery);
        setChargerAndCable(chargerAndCable);
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public boolean isChargerAndCable() {
        return ChargerAndCable;
    }

    public void setChargerAndCable(boolean chargerAndCable) {
        ChargerAndCable = chargerAndCable;
    }

    @Override
    public String toString() {

        String CableOrCharger = "";

        if(getType() == "Phone" || getType() == "Laptop" || getType() == "IPad")
            CableOrCharger = "\nCharger: ";

        else if(getType() == "PC" || getType() == "Console" || getType() == "TV")
            CableOrCharger = "\nCable: ";

        else
            CableOrCharger = "\nCable or Charger: ";

        return super.toString() +
                "\nBattery: " + Battery +
                 CableOrCharger + ChargerAndCable +
                "\n\n";
    }
}
