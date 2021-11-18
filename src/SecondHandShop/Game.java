package SecondHandShop;

public class Game extends Item{

    private String AgeRating;
    private boolean CrossPlay;
    private Platform Platform;
    private String ReleaseDate;

    public Game(String type, String name,
                double buyFor, double sellFor,
                String itemCondition, String manufacturersDate,
                String ageRating, boolean crossPlay,
                Platform platform, String releaseDate)
    {
        super(type, name, buyFor, itemCondition);
        setAgeRating(ageRating);
        setCrossPlay(crossPlay);
        setPlatform(platform);
        setReleaseDate(releaseDate);
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

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge rating: " + AgeRating +
                "\nCross-Play: " + CrossPlay +
                "\nPlatform: " + Platform.getType() +
                "\nRelease date: " + getReleaseDate();
    }
}
