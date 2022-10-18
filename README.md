# Balls, Bubbles, and Snowflakes

The included template provides a fully working program that generates a single `Ball` object called `ball1`, and the hook to animate the ball. In this assignment you will expand upon this project to add more balls, in addition to finishing the creation of two more classes, `Bubble` and `Snowflake`.

Before you start, read [SETUP.md](SETUP.md) and make sure your development environment is working!

## Project Requirements

1. Have four balls of different sizes and colors bouncing around the screen
2. Have four bubbles of different sizes rising toward the top of the screen and reappearing at the bottom
3. Have four snowflakes of different sizes falling toward the bottom of the screen and reappearing at the top.
4. Complete a design document, template available on google classroom, that documents and explains the work.
   
**What it should look like**

![what it should look like](Animation2.gif)

You should approach the project in the following order:

1) Read the `Ball.java` file to understand how the `Ball `class works and all of the methods you have to interact with it.
   
2) In `Sketch.java` add code to create and draw four different balls, all with different sizes and colors, by using the `Ball` class appropriately.
   
3) Go to `Bubble.java`, remove the comment that surrounds the entire class to enable it, and complete the class. There are hints in the comments, and since bubbles are pretty similar to balls, you should be able to use the `Ball` class to help you with this process.
   
4) In `Sketch.java`, add the code to get your four bubbles working.
   
5) Open `Snowflake.java`, remove the comment that surrounds the entire class to enable it, and complete the class. This one is much less complete, with only the `draw()` method provided. You will need to figure out the rest of the class yourself, again using `Ball` and `Bubble` to help you out.

6) In `Sketch.java`, add code to get your four snowflakes working.
   
7) Go to Google Classroom and complete the design documentation for the base level project.

Once you have completed all of these tasks, you have created a project that can earn a proficient.

In order to extend into Accomplished/Exemplary land, you will need to add your own spin on things, AND document your extensions in the design document. Some suggestions:   

1) Use random numbers to generate your balls, bubbles, and/or snowflakes rather than picking the sizes manually. The processing `random()` method can help with this, feel free to search that up in the Processing Reference. There are other ways to create random numbers in java too, but the one provided by Processing is probably the easiest!
2) Read about java arrays and use arrays to hold your four (or more!) snowflakes, bubbles, and balls rather than individual variables.
3) Make it so if you hover your mouse pointer over a ball or bubble or snowflake, it does not move. The built in processing variables `mouseX` and `mouseY` can help with this - again, feel free to search that up in the Processing Reference.
4) Make it so that when you press a key on the keyboard, the balls change color, either to random colors or alternating between a list of options. The `keyPressed()` method, added to your main `Sketch.java`, can help with this. Again, search in the Processing Reference.
   
5) Add a new class that lets something else be created on the screen that you then create and animate in addition to the included objects.
   
6) Introduce collision detection, so that if balls run into each other they bounce off of each other.
   
7) Come up with your own thing. This is often the best choice, as it demonstrates ingenuity! Exploring Examples or the Reference on the processing website can help you come up with ideas!

## A note about academic honesty

I will be looking for clear evidence that anything you add from this list, or on your own, you figured out yourself. That doesn't mean you can't search things on the internet, because that is part of learning, but it DOES mean you should not be talking about these extension ideas with other students, or teachers, or parents, or tutors. You can talk to me, since I can provide hints without giving away too much. This is part of academic honesty. In order for any of these project extensions to help your grade, you will need to be able to tell me how they worked and how you figured out how to do it. If I suspect that these rules have not been followed, and that any work on this project is not your own, you will earn a maximum grade of a Proficient and the traditional consequences of academic dishonesty may follow, including an eventual refusal, on my part, to write a letter of recommendation for you.
