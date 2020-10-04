import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.event.*;

/*	Let's draw some lines! This uses acm.jar, so make sure you have that. This project should come with it.
	If you don't, here is the url: https://cs.stanford.edu/people/eroberts/jtf/
*/
public class DrawingLines extends GraphicsProgram {

	private GLine newLine;
	public void run() {
		// This will listen to any mouse event. We will override the methods we want to manipulate.
		addMouseListeners();
	}
	public void mousePressed(MouseEvent mouse) {
		// This makes the start of the line. Its end position will follow the mouse until it's no longer pressed.
		newLine = new GLine(mouse.getX(), mouse.getY(), mouse.getX(), mouse.getY());
		add(newLine);
	}
	public void mouseDragged(MouseEvent mouse) {
		
		newLine.setEndPoint(mouse.getX(), mouse.getY());
	}
}