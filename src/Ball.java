class Ball {

    /*
     * In Processing, the Sketch works a lot like the World in the turtles. You can't
     * draw a ball without knowing which sketch to draw it on, so you always need to
     * specify the sketch for a Ball object.
     */

    private Sketch s;
    private float radius = 20;
    private float x = 100;
    private float y = 100;
    private float xSpeed = 2;
    private float ySpeed = -1;
    private int fillColor;
    private int borderColor;

    /** Empty constructor to keep the defaults. Only sets up our link. */
    public Ball(Sketch sketch) {
        s = sketch;
        fillColor = s.color(255, 100, 100);
        borderColor = s.color(0, 0, 0);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Ball(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    // Accessors (getters) go here

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

    // mutator (setter) for colors only

    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }

    /**
     * Draws the ball on the given sketch
     */
    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius * 2);
    }
    /**
     * Moves the ball so that the next time it draws it will be in a different place
     */
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius || x < radius) {
            xSpeed = -xSpeed;
        }
        if (y > s.height - radius || y < radius) {
            ySpeed = -ySpeed;
        }
    }

}