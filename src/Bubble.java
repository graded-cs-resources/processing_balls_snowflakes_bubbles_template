import processing.core.PApplet;

class Bubble {

    private PApplet s;
    private float radius = 20;
    private float x = 100;
    private float y = 100;
    private float xSpeed = (float)0.5;
    private float ySpeed = -2;
    private int fillColor;
    private int strokeColor;

    /** Empty constructor to keep the defaults. Only sets up our link. */
    public Bubble(PApplet ourSketch) {
        s = ourSketch;
        fillColor = s.color(255,50);
        strokeColor = s.color(255);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Bubble(PApplet ourSketch, 
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
        fillColor = s.color(255,50);
        strokeColor = s.color(255);
    }

    // accessors for the radius, diameter, x, and y values 
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

    public void draw() {
        s.stroke(strokeColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
