package SecondHandShop;

import java.util.GregorianCalendar;

public class Platform {

    private String Type;
    private String Manufacturer;

    public Platform(String type,
                    String manufacturer)
    {
        setType(type);
        setManufacturer(manufacturer);
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
