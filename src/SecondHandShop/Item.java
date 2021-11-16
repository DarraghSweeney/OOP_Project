package SecondHandShop;

import java.util.GregorianCalendar;

public class Item {

    private String Type;
    private static int ItemID;
    private String Name;
    private double BuyFor;
    private double SellFor;
    private String ItemCondition;

    public Item(String type, String name, double buyFor, double sellFor, String itemCondition) {
        setType(type);
        setName(name);
        setBuyFor(buyFor);
        setSellFor(sellFor);
        setItemCondition(itemCondition);
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public static int getItemID() {
        return ItemID;
    }

    public static void setItemID(int itemID) {
        ItemID = itemID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBuyFor() {
        return BuyFor;
    }

    public void setBuyFor(double buyFor) {
        BuyFor = buyFor;
    }

    public double getSellFor() {
        return SellFor;
    }

    public void setSellFor(double sellFor) {
        SellFor = sellFor;
    }

    public String getItemCondition() {
        return ItemCondition;
    }

    public void setItemCondition(String itemCondition) {
        ItemCondition = itemCondition;
    }

    @Override
    public String toString() {
        return  "Type: " + Type +
                "\nName: " + Name +
                "\nBuy for: " + BuyFor +
                "\nSell for: " + SellFor +
                "\nItem condition: " + ItemCondition;
    }
}
