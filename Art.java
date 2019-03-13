/**
 * This is the super class. All Art has an artist, a year it was created and a location that it is on display at. All
 * other classes will extend this one.
 */
public class Art {
    // the data is protected
    protected String artist;
    protected int creationYear;
    protected String displayLocation;

    /**
     * This is the customizable Art constructor.
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     */
    public Art(String artist, int creationYear, String displayLocation) {
        this.artist = artist;
        this.creationYear = creationYear;
        this.displayLocation = displayLocation;
    }

    /**
     * This is the default Art constructor.
     */
    public Art() {
        this.artist = "Michelangelo";
        this.creationYear = 1483;
        this.displayLocation = "Vatican City";
    }

    /**
     * This prints out what makes up the Art object.
     * @return String
     */
    @Override
    public String toString() {
        return "Art{" +
                "artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets and returns the artist name.
     * @return String
     */
    public String getArtist() {
        return artist;
    }

    /**
     * This sets the artist name to whatever the user would like.
     * @param artist String
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * This gets the year the piece was created and returns it.
     * @return int
     */
    public int getCreationYear() {
        return creationYear;
    }

    /**
     * This sets the year the piece was created in to whatever the user would like and returns it.
     * @param creationYear int
     */
    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    /**
     * This gets the name of the location the piece is displayed at and returns it to the user.
     * @return String
     */
    public String getDisplayLocation() {
        return displayLocation;
    }

    /**
     * This sets the name of the loacation the piece is displayed at to whatever the user would like.
     * @param displayLocation String
     */
    public void setDisplayLocation(String displayLocation) {
        this.displayLocation = displayLocation;
    }

    /**
     * This prints out a message that "creates" the art piece.
     * @return String
     */
    public String createArt(){
        return "This is a piece of art!";
    }





}