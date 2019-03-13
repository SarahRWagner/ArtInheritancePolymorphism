
/**
 * This is a child class of Art. It has all the values of Art, however it has addtioanl values that
 * make up the Painting object.
 */
public class Painting extends Art{

    protected String brushType; // Paintings have a brush type
    protected String medium; // Painting have a medium they are painted on

    /**
     * This is the customizable Painting constructor, it also pulls values from the Art class.
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param brushType String
     * @param medium String
     */
    public Painting(String artist, int creationYear, String displayLocation, String brushType, String medium) {
        super(artist, creationYear, displayLocation);
        this.brushType = brushType;
        this.medium = medium;
    }

    /**
     * This is the default Painting constructor.
     */
    public Painting() {
        this.brushType = "Boar Bristle";
        this.medium = "Canvas";
    }

    /**
     * This prints out what makes up a Painting object
     * @return String
     */
    @Override
    public String toString() {
        return "Painting{" +
                "brushType='" + brushType + '\'' +
                ", medium='" + medium + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }


    /**
     * This gets the brush type and returns it to the user.
     * @return String
     */
    public String getBrushType() {
        return brushType;
    }

    /**
     * This sets the brush type to whatever the user wishes.
     * @param brushType String
     */
    public void setBrushType(String brushType) {
        this.brushType = brushType;
    }

    /**
     * This gets the medium type and returns it to the user.
     * @return String
     */
    public String getMedium() {
        return medium;
    }

    /**
     * This sets the medium type to whatever the user wishes.
     * @param medium String
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }


    /**
     * This prints out a message that "creates" the painting.
     * @return String
     */
    public String createArt(){
        return "This is a painting!";
    }

}