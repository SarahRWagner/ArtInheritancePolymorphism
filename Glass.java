/**
 * This is a child class of Art. It has all the values of Art, however it has additional values that make
 * up the Glass object.
 */
public class Glass extends Art{

    protected String typeOfGlass; // Glass art is made up of different types of glass
    protected String opacity; // Glass art can have different opacity, some clear, some cloudy etc.

    /**
     * This is the customizable Glass constructor, it also pulls the values from it's parent class down.
     * @param artist String
     * @param creationYear int
     * @param displayLocation String
     * @param typeOfGlass String
     * @param opacity Strin
     */
    public Glass(String artist, int creationYear, String displayLocation, String typeOfGlass, String opacity) {
        super(artist, creationYear, displayLocation);
        this.typeOfGlass = typeOfGlass;
        this.opacity = opacity;
    }

    /**
     * This is the default constructor for just Glass
     */
    public Glass(){
        this.typeOfGlass = "borosilicate";
        this.opacity = "clear";
    }

    /**
     * This prints out what makes up a Glass object
     * @return String
     */
    @Override
    public String toString() {
        return "Glass{" +
                "typeOfGlass='" + typeOfGlass + '\'' +
                ", opacity='" + opacity + '\'' +
                ", artist='" + artist + '\'' +
                ", creationYear=" + creationYear +
                ", displayLocation='" + displayLocation + '\'' +
                '}';
    }

    /**
     * This gets and returns the type of glass.
     * @return String
     */
    public String getTypeOfGlass() {
        return typeOfGlass;
    }

    /**
     * This sets the type of glass to whatever the user would like.
     * @param typeOfGlass String
     */
    public void setTypeOfGlass(String typeOfGlass) {
        this.typeOfGlass = typeOfGlass;
    }

    /**
     * This gets the opacity of the piece and returns it.
     * @return String
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * This sets the opacity of the piece to whatever the user would like.
     * @param opacity String
     */
    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }

    /**
     * This prints out a message that "creates" the glass art piece.
     * @return String
     */
    public String createArt(){
        return "This is a piece of glass art!";
    }



}