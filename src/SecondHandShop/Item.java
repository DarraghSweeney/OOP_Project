package SecondHandShop;

import java.util.GregorianCalendar;

public class Item {

    private String Type;
    private static int ItemID;
    private String Name;
    private double BuyFor;
    private double SellFor;
    private String ItemCondition;

    public Item(String type, String name, double buyFor, String itemCondition) {
        setType(type);
        setName(name);
        setBuyFor(buyFor);
        setItemCondition(itemCondition);
    }

    public String getType() {

        if (Type == "Console")
        {

        }
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

        Double Interest;

        SellFor = BuyFor;

        if (getBuyFor() <= 9.99)
            Interest = 0.5;

        else if(getBuyFor() <= 29.99 && getBuyFor() >= 10)
            Interest = 0.25;

        else if(getBuyFor() <= 50 && getBuyFor() >= 30)
            Interest = 0.15;

        else Interest = 0.10;

        SellFor += getBuyFor() * Interest;

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
                "\nSell for: " + String.format("%.2f",getSellFor()) +
                "\nItem condition: " + ItemCondition;
    }
}
