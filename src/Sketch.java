import processing.core.PApplet;


public class Sketch extends PApplet {

    private Ball ball1;

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
        ball1 = new Ball(this);
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     */
    public void draw() {
        background(180,180,255);
        ball1.draw();
        ball1.move();
    }

    /** All processing sketches have to use this main method */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
