package SecondHandShop;

public class Game extends Item{

    private String AgeRating;
    private boolean CrossPlay;
    private Platform Platform;

    public Game(String type, String name,
                double buyFor, double sellFor,
                String itemCondition, String manufacturersDate,
                String ageRating, boolean crossPlay,
                Platform platform)
    {
        super(type, name, buyFor, sellFor, itemCondition, manufacturersDate);
        setAgeRating(ageRating);
        setCrossPlay(crossPlay);
        setPlatform(platform);
    }

    public String getAgeRating() {
        return AgeRating;
    }

    public void setAgeRating(String ageRating) {
        AgeRating = ageRating;
    }

    public boolean isCrossPlay() {
        return CrossPlay;
    }

    public void setCrossPlay(boolean crossPlay) {
        CrossPlay = crossPlay;
    }

    public SecondHandShop.Platform getPlatform() {
        return Platform;
    }

    public void setPlatform(SecondHandShop.Platform platform) {
        Platform = platform;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAgeRating: " + AgeRating +
                "\nCrossPlay: " + CrossPlay +
                "\nPlatform: " + Platform;
    }
}
