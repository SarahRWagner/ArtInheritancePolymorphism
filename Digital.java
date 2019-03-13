/**
 * This is a child class of Painting and grandchild of Art. It has all the values of Art, and all the values of Painting, but
 * also has the values that make up Digital.
 */
public class Digital extends Painting {

    private String drawingProgram; // Digital paintings have a program that creates them
    private String tabletType; // Digital paintings have a tablet type they're drawn on

    /**
     * This is the customizable Digital constructor, it pulls the Art and Painting values as well
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param brushType String
     * @param medium String
     * @param drawingProgram String
     * @param tabletType String
     */
    public Digital(String artist, int creationYear, String displayLocation, String brushType, String medium, String drawingProgram, String tabletType) {
        super(artist, creationYear, displayLocation, brushType, medium);
        this.drawingProgram = drawingProgram;
        this.tabletType = tabletType;
    }

    /**
     * This prints out what makes up a Digital object
     * @return String
     */
    @Override
    public String toString() {
        return "Digital{" +
                "drawingProgram='" + drawingProgram + '\'' +
                ", tabletType='" + tabletType + '\'' +
                ", brushType='" + brushType + '\'' +
                ", medium='" + medium + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets the drawing program and returns it to the user.
     * @return
     */
    public String getDrawingProgram() {
        return drawingProgram;
    }

    /**
     * This sets the drawing program to whatever the user wishes.
     * @param drawingProgram
     */
    public void setDrawingProgram(String drawingProgram) {
        this.drawingProgram = drawingProgram;
    }

    /**
     * This gets the type of tablet and returns it to the user.
     * @return
     */
    public String getTabletType() {
        return tabletType;
    }

    /**
     * This sets the tablet type to whatever the user wishes.
     * @param tabletType
     */
    public void setTabletType(String tabletType) {
        this.tabletType = tabletType;
    }

    /**
     * This prints out a message that "creats" a digital painting.
     */
    public String createArt(){
        return "This is a digital painting!";
    }
}
