import processing.core.PApplet;

/**
 * This class defines the Processing Sketch It extends PApplet, which is a
 * special processing class to represent the sketches
 * 
 * https://processing.org/reference/ is a helpful site to help you better
 * understad the built-in processing functions
 * 
 * If you need to see specifically how it works in java, the more technical 
 * documentation is at http://processing.github.io/processing-javadocs/core/ 
 */
public class Sketch extends PApplet {

    /**
     * This method runs at the very beginning and defines the settings of the
     * sketch. Only certain methods are allowed in here!
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * This method runs after settings, and initializes your code. You can put
     * whatever you want in here, but it only runs once at the beginning!
     */
    public void setup() {
        // paint the background
        background(200,100,100);
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     */
    public void draw() {
        // draw a ball where the mouse is
        circle(mouseX, mouseY, 50);
    }

    /** All processing sketches have to use this main method */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
