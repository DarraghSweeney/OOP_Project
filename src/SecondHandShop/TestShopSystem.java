package SecondHandShop;

public class TestShopSystem {
    public static void main(String[] args) {

        Platform p1 = new Platform("Xbox One","Microsoft");
        Game g1 = new Game("Game","Red Dead Redemption",5.99,9.99, "Excellent","2009","PG13",true, p1);

        System.out.println(g1);
    }
}
