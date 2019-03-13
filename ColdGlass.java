/**
 * This is a child class of Glass and grandchild of Art. It has all the values of Art, and all the values of Glass, but
 * also has the values that make up ColdGlass.
 */
public class ColdGlass extends Glass{

    private double slumpTemp; // Cold sheets of glass are melted and slumped in a kiln to make shapes, the kiln needs a temp
    private String glueType; // Most cold glass pieces need a type of glue to hold them together, some you put on before the kiln, some after

    /**
     * This is the customizable ColdGlass constructor, it pulls the Art and Glass values
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param typeOfGlass String
     * @param opacity String
     * @param slumpTemp double
     * @param glueType String
     */
    public ColdGlass(String artist, int creationYear, String displayLocation, String typeOfGlass, String opacity, double slumpTemp, String glueType) {
        super(artist, creationYear, displayLocation, typeOfGlass, opacity);
        this.slumpTemp = slumpTemp;
        this.glueType = glueType;
    }

    /**
     * This prints out what makes up a ColdGlass object
     * @return String
     */
    @Override
    public String toString() {
        return "ColdGlass{" +
                "slumpTemp=" + slumpTemp +
                ", glueType='" + glueType + '\'' +
                ", typeOfGlass='" + typeOfGlass + '\'' +
                ", opacity='" + opacity + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets the slump temperature and returns it to the user.
     * @return double
     */
    public double getSlumpTemp() {
        return slumpTemp;
    }

    /**
     * This sets the slump temp to whatever the user wishes.
     * @param slumpTemp double
     */
    public void setSlumpTemp(double slumpTemp) {
        this.slumpTemp = slumpTemp;
    }

    /**
     * This gets the type of glue and returns it the user.
     * @return String
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * This sets the type of glue to whatever the user wishes.
     * @param glueType String
     */
    public void setGlueType(String glueType) {
        this.glueType = glueType;
    }

    /**
     * This prints out a message that "creates" the cold glass object.
     * @return String
     */
    public String createArt(){
        return "This is a piece of cold glass art!";
    }

}