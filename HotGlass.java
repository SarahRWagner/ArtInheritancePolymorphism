/**
 * This is a child class of Glass and grandchild of Art. It has all the values of Art, and all the values of Glass, but
 * also has the values that make up HotGlass.
 */
public class HotGlass extends Glass{

    private double furnaceTemp; // Hot glass art has a furnace temp that melts the glass down
    private String blowPipeSize; // Hot glass uses blow pipes to make vases and such, they have different sizes

    /**
     * This is the customizable HotGlass constructor, it pulls the Art and Glass class values
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param typeOfGlass String
     * @param opacity String
     * @param furnaceTemp double
     * @param blowPipeSize String
     */
    public HotGlass(String artist, int creationYear, String displayLocation, String typeOfGlass, String opacity, double furnaceTemp, String blowPipeSize) {
        super(artist, creationYear, displayLocation, typeOfGlass, opacity);
        this.furnaceTemp = furnaceTemp;
        this.blowPipeSize = blowPipeSize;
    }

    /**
     * This prints out what makes up a HotGlass object
     * @return String
     */
    @Override
    public String toString() {
        return "HotGlass{" +
                "furnaceTemp=" + furnaceTemp +
                ", blowPipeSize='" + blowPipeSize + '\'' +
                ", typeOfGlass='" + typeOfGlass + '\'' +
                ", opacity='" + opacity + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets the furnace temp and returns it to the user.
     * @return double
     */
    public double getFurnaceTemp() {
        return furnaceTemp;
    }

    /**
     * This sets the furnace temp to whatever the user would like.
     * @param furnaceTemp double
     */
    public void setFurnaceTemp(double furnaceTemp) {
        this.furnaceTemp = furnaceTemp;
    }

    /**
     * This gets the size of the blowpipe and returns it to the user.
     * @return String
     */
    public String getBlowPipeSize() {
        return blowPipeSize;
    }

    /**
     * This sets the size of the blowpipe to whatever the user would like.
     * @param blowPipeSize String
     */
    public void setBlowPipeSize(String blowPipeSize) {
        this.blowPipeSize = blowPipeSize;
    }

    /**
     * This prints out a message that "creates" the hot glass art.
     * @return String
     */
    public String createArt(){
        return "This is a piece of hot glass art!";
    }
}