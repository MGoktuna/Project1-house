/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Killing and David J. Barnes
 * @version 2011.07.31
 * 
 * Current version written by Mark Goktuna
 * 9/21/15
 * SpaceTravel Picture
 */
public class Picture
{
    private Square window;
    private Square window2;
    private Circle moon;
    private Circle earth;
    private Circle star1;
    private Square sky;
    private Circle sun;
    private Circle star;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Square rocketBody1;
    private Square rocketBody2;
    private Square rocketBody3;
    private Triangle rocketNose;
    private Triangle thrusterRight;
    private Triangle thrusterLeft;
    private Triangle wingLeft;
    private Triangle wingRight;
    private Person astro;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
    
        sky = new Square();
        sky.moveHorizontal(-310);
        sky.moveVertical(-130);
        sky.changeSize(500);
        sky.changeColor("black");
        sky.makeVisible();
        
        moon = new Circle();
        moon.moveHorizontal(-120);
        moon.moveVertical(-70);
        moon.changeSize(40);
        moon.changeColor("white");
        moon.makeVisible();
        
        earth = new Circle();
        earth.moveHorizontal(-205);
        earth.moveVertical(-60);
        earth.changeSize(85);
        earth.changeColor("blue");
        earth.makeVisible();
        
        sun = new Circle();
        sun.moveHorizontal(195);
        sun.moveVertical(-50);
        sun.changeSize(70);
        sun.changeColor("yellow");
        sun.makeVisible();
       
        star = new Circle();
        star.moveHorizontal(-10);
        star.moveVertical(100);
        star.changeSize(5);
        star.changeColor("white");
        star.makeVisible();
        
        star2 = new Circle();
        star2.moveHorizontal(10);
        star2.moveVertical(85);
        star2.changeSize(5);
        star2.changeColor("white");
        star2.makeVisible();
        
        star3 = new Circle();
        star3.moveHorizontal(35);
        star3.moveVertical(95);
        star3.changeSize(5);
        star3.changeColor("white");
        star3.makeVisible();
        
        star4 = new Circle();
        star4.moveHorizontal(65);
        star4.moveVertical(120);
        star4.changeSize(5);
        star4.changeColor("white");
        star4.makeVisible();
        
        star5 = new Circle();
        star5.moveHorizontal(70);
        star5.moveVertical(160);
        star5.changeSize(5);
        star5.changeColor("white");
        star5.makeVisible();
        
        star6 = new Circle();
        star6.moveHorizontal(120);
        star6.moveVertical(165);
        star6.changeSize(5);
        star6.changeColor("white");
        star6.makeVisible();
        
        star7 = new Circle();
        star7.moveHorizontal(130);
        star7.moveVertical(120);
        star7.changeSize(5);
        star7.changeColor("white");
        star7.makeVisible();
        
        rocketNose = new Triangle();
        rocketNose.moveHorizontal(90);
        rocketNose.moveVertical(-90);
        rocketNose.changeSize(25, 25);
        rocketNose.changeColor("red");
        rocketNose.makeVisible();
        
        rocketBody1 = new Square();
        rocketBody1.moveHorizontal(-22);
        rocketBody1.moveVertical(-45);
        rocketBody1.changeSize(25);
        rocketBody1.changeColor("white");
        rocketBody1.makeVisible();
        
        rocketBody2 = new Square();
        rocketBody2.moveHorizontal(-22);
        rocketBody2.moveVertical(-25);
        rocketBody2.changeSize(25);
        rocketBody2.changeColor("white");
        rocketBody2.makeVisible();
        
        thrusterLeft = new Triangle();
        thrusterLeft.moveHorizontal(78);
        thrusterLeft.moveVertical(-4);
        thrusterLeft.changeSize(25, 20);
        thrusterLeft.changeColor("white");
        thrusterLeft.makeVisible();
        
        thrusterRight = new Triangle();
        thrusterRight.moveHorizontal(101);
        thrusterRight.moveVertical(-4);
        thrusterRight.changeSize(25, 20);
        thrusterRight.changeColor("white");
        thrusterRight.makeVisible();
        
        rocketBody3 = new Square();
        rocketBody3.moveHorizontal(-22);
        rocketBody3.moveVertical(-5);
        rocketBody3.changeSize(25);
        rocketBody3.changeColor("white");
        rocketBody3.makeVisible();
        
        wingLeft = new Triangle();
        wingLeft.moveHorizontal(78);
        wingLeft.moveVertical(-45);
        wingLeft.changeSize(20, 50);
        wingLeft.changeColor("white");
        wingLeft.makeVisible();
        
        wingRight = new Triangle();
        wingRight.moveHorizontal(103);
        wingRight.moveVertical(-45);
        wingRight.changeSize(20, 50);
        wingRight.changeColor("white");
        wingRight.makeVisible();
        
        window = new Square();
        window.moveHorizontal(-17);
        window.moveVertical(-40);
        window.changeSize(15);
        window.changeColor("black");
        window.makeVisible();
        
        window2 = new Square();
        window2.moveHorizontal(-17);
        window2.moveVertical(-25);
        window2.changeSize(15);
        window2.changeColor("black");
        window2.makeVisible();
        
        astro = new Person();
        astro.moveHorizontal(20);
        astro.moveVertical(-100);
        astro.changeSize(15,15);
        astro.changeColor("white");
        astro.makeVisible();
        
        /*wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();*/
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("white");
            earth.changeColor("black");
            moon.changeColor("black");
            sun.changeColor("black");
            star.changeColor("black");
            star.changeColor("black");
            star2.changeColor("black");
            star3.changeColor("black");
            star4.changeColor("black");
            star5.changeColor("black");
            star6.changeColor("black");
            star7.changeColor("black");
            rocketNose.changeColor("black");
            rocketBody1.changeColor("black");
            rocketBody2.changeColor("black");
            rocketBody3.changeColor("black");
            thrusterLeft.changeColor("black");
            thrusterRight.changeColor("black");
            wingRight.changeColor("black");
            wingLeft.changeColor("black");
            window.changeColor("white");
            window2.changeColor("white");
            astro.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("black");
            earth.changeColor("blue");
            moon.changeColor("white");
            sun.changeColor("yellow");
            star.changeColor("white");
            star2.changeColor("white");
            star3.changeColor("white");
            star4.changeColor("white");
            star5.changeColor("white");
            star6.changeColor("white");
            star7.changeColor("white");
            rocketNose.changeColor("red");
            rocketBody1.changeColor("white");
            rocketBody2.changeColor("white");
            rocketBody3.changeColor("white");
            thrusterLeft.changeColor("white");
            thrusterRight.changeColor("white");
            wingRight.changeColor("white");
            wingLeft.changeColor("white");
            window.changeColor("black");
            window2.changeColor("black");
            astro.changeColor("white");
        }
    }
}
