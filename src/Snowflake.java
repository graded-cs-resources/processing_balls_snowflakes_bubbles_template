/** THE ENTIRE CLASS IS INSIDE A COMMENT RIGHT NOW. TO ENABLE THE CLASS, 
 * DELETE THESE LINE AND THE LAST ONE IN THE FILE.

class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
  

    public void draw() {
        line(x+radius,y,x-radius,y);
        line(x,y+radius,x,y-radius);
        line(x+radius*.707,y+radius*.707,x-radius*.707,y-radius*.707);
        line(x+radius*.707,y-radius*.707,x-radius*.707,y+radius*.707);
    }
}

**/