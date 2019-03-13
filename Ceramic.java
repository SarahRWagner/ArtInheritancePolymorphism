
/**
 * This is a child class of Art. It has all the values of Art, however it has additional values that make
 * up the Ceramic object.
 */
public class Ceramic extends Art{

    private String clayType; // All ceramic work has a type of clay
    private String glaze; // Ceramic work has a glaze on it

    /**
     * This is the customizable Ceramic constructor, it also pulls the values from the Art class.
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param clayType String
     * @param glaze String
     */
    public Ceramic(String artist, int creationYear, String displayLocation, String clayType, String glaze) {
        super(artist, creationYear, displayLocation);
        this.clayType = clayType;
        this.glaze = glaze;
    }

    /**
     * This prints out what makes up a Ceramic object
     * @return String
     */
    @Override
    public String toString() {
        return "Ceramic{" +
                "clayType='" + clayType + '\'' +
                ", glaze='" + glaze + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets the type of clay and returns it
     * @return String
     */
    public String getClayType() {
        return clayType;
    }

    /**
     * This sets the clay type to whatever the user wishes.
     * @param clayType String
     */
    public void setClayType(String clayType) {
        this.clayType = clayType;
    }

    /**
     * This gets the glaze and returns it to the user.
     * @return String
     */
    public String getGlaze() {
        return glaze;
    }

    /**
     * This sets the glaze to whatever the user wishes.
     * @param glaze String
     */
    public void setGlaze(String glaze) {
        this.glaze = glaze;
    }

    /**
     * This prints out a message that "creates" the ceramic art piece.
     * @return String
     */
    public String createArt(){
        return "This is a piece of ceramic art!";
    }

}