import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
import acm.util.*;
public class RandomCircles extends GraphicsProgram {
	
	private static final int MINIMUM_CIRCLE_RADIUS = 5;
	private static final int MAXIMUM_CIRCLE_RADIUS = 50;
	
	private static RandomGenerator randomizer = new RandomGenerator();
	
	public void run() {
		
		generateCircle(10);
	}
	private void generateCircle(int count) {
		
		for(int i = 0; i < count; i++) {
			
//			print("Circle number " + (i + 1) + ". ");
			makeCircle();	
		}	
	}
	private void makeCircle() {
		
		int randomDiameter = randomizer.nextInt(MINIMUM_CIRCLE_RADIUS, MAXIMUM_CIRCLE_RADIUS) * 2;
		int randomXPos = randomizer.nextInt(0, getWidth() - randomDiameter);
		int randomYPos = randomizer.nextInt(0, getHeight() - randomDiameter);
		GOval circle = new GOval(randomXPos, randomYPos, randomDiameter, randomDiameter);
//		print("Location: " + randomXPos + " x " + randomYPos + ". Radius: " + randomDiameter / 2 + "px. ");
		colorize(circle);
		add(circle);
	}
	private GOval colorize(GOval circle) {
		
		circle.setFilled(true);
		Color randomColor = randomizer.nextColor();
		circle.setColor(randomColor);
		circle.setFillColor(randomColor);
//		println("Color: " + randomColor + ".");
		return circle;
	}
}