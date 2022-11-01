import processing.core.PApplet;


public class Sketch extends PApplet {

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;

    private Snowflake sf1;
    private Snowflake sf2;
    private Snowflake sf3;
    private Snowflake sf4;
    

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
        ball2 = new Ball(this,20,50,50,-2,1);
        ball3 = new Ball(this,30,150,170,-4,-2);
        ball4 = new Ball(this,40,350,40,2,4);
        ball2.setColors(randomColor(),randomColor());
        ball3.setColors(randomColor(),randomColor());
        ball4.setColors(randomColor(),randomColor());
        
        bubble1 = new Bubble(this);
        bubble2 = new Bubble(this,20,400,100,0,-2);
        bubble3 = new Bubble(this, 50, 300, 100, -1, -1);
        bubble4 = new Bubble(this, 10,  230, 10, 0, -2);

        sf1 = new Snowflake(this);
        sf2 = new Snowflake(this,20, 200, 100, 1, 2);
        sf3 = new Snowflake(this, 10, 30, 400, -2, 2);
        sf4 = new Snowflake(this, 15, 250, 250, 2, 1);
    }


    /**
     * This method runs over and over and over, approximately 60 times per second!
     */
    public void draw() {
        background(180,180,255);
        
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();

        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();

        sf1.draw();
        sf1.move();
        sf2.draw();
        sf2.move();
        sf3.draw();
        sf3.move();
        sf4.draw();
        sf4.move();
    }

    /** All processing sketches have to use this main method */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }


    private int randomColor() {
        return color(
            random(0,255),
            random(0,255),
            random(0,255)
        );
    }
}
