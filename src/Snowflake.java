/** THE ENTIRE CLASS IS INSIDE A COMMENT RIGHT NOW. TO ENABLE THE CLASS, 
 * DELETE THESE LINE AND THE LAST ONE IN THE FILE.

class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
  

    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
    }
}

**/