package SecondHandShop;

import javax.swing.*;

public class TestShopSystem {
    public static void main(String[] args) {

        Platform p1 = new Platform("Xbox One","Microsoft");
        Platform p2 = new Platform("Xbox 360","Microsoft");
        Platform p3 = new Platform("Playstation 3","Microsoft");
        Platform p4 = new Platform("Playstation 4","Microsoft");
        Platform p5 = new Platform("Nintendo Switch","Microsoft");
        Platform p6 = new Platform("Nintendo Wii","Microsoft");

       //Game g1 = new Game("Game","Red Dead Redemption",5.99,9.99, "Excellent","2009","PG13",true, p1, "2009");

        //System.out.println(g1);

       // Device d1 = new Device("PC","Alienware",500,549.99,"Good","40 KwH",true);

       // Device d2 = new Device("Console","PS4",500,549.99,"Good","40 KwH",true);

      //  Device d3 = new Device("Tablet","Apple IPad 4",15,30,"Poor","40 KwH",true);

       // Device d4 = new Device("Phone","Samsung Galaxy S3 mini",30,80.99,"Great","12 KwH",false);

        ShopGui s1 = new ShopGui();

    }
}
