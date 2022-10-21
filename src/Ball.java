import processing.core.PApplet;

class Ball {

    /*
     * Because the Ball class is not itself a Processing sketch,
     * it needs a link to our sketch to be able to use special processing
     * features like drawing pictures and creating colors. 
     * That's why the PApplet s variable exists. All processing features
     * can be used by using s.name(), for example, s.color() or s.circle()
     */

    private PApplet s;
    private float radius = 20;
    private float x = 100;
    private float y = 100;
    private float xSpeed = 2;
    private float ySpeed = -1;
    private int fillColor;
    private int strokeColor;

    /** Empty constructor to keep the defaults. Only sets up our link. */
    public Ball(PApplet ourSketch) {
        s = ourSketch;
        fillColor = s.color(100,100,100);
        strokeColor = s.color(0,0,0);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Ball(PApplet ourSketch, 
                float initRadius, 
                float initX, 
                float initY, 
                float initXSpeed, 
                float initYSpeed) 
    {
        s = ourSketch;
        radius = initRadius;
        x = initX;
        y = initY;
        xSpeed = initXSpeed;
        ySpeed = initYSpeed;
        fillColor = s.color(100,100,100);
        strokeColor = s.color(0,0,0);
    }

    /** accessors for the radius, diameter, x, and y values **/
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setColors(int fill, int stroke) {
        strokeColor = stroke;
        fillColor = fill;
    }

    public void draw() {
        s.stroke(strokeColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius || x < radius) {
            xSpeed = -xSpeed ;
        }
        if (y > s.height - radius || y < radius) {
            ySpeed = -ySpeed;
        }
    }

}