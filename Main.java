/**
 * @author Sarah Wagner
 * @version 1.0
 * This is the driver class to test out inheritance and polymorphism.
 */

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        /*I took Shavil's version of polymorphism with anime and plugged in my objects and classes
        This shows polymorphism. It as has "art" object on one side and then whatever type of art it is on the other. */
        Art sculpture = new HotGlass("Chihuly", 2001, "Tacoma, Washington", "borosilicate", "Clear", 2000, "industrial" );
        Art figure = new Ceramic("Brett Kern", 2019, "Mifflin, PA", "Sedona Red", "red");
        Art painting = new Digital("Jon Dunham", 2016, "Lincoln, UK", "stylus", "digital canvas", "Photoshop", "Wacom");

        //Place all the different objects in the same list
        ArrayList<Art> artCollection  = new ArrayList<Art>();
        artCollection.add(sculpture);
        artCollection.add(figure);
        artCollection.add(painting);


        //Run through the list and show how each object is different, even though they are all "art" objects.
        for (int i =0; i < artCollection.size(); i++){
            System.out.println(artCollection.get(i));
            System.out.println(artCollection.get(i).createArt()  + "\n" );
        }
    }
}