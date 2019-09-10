package lsp.solution.test;

import lsp.solution.Square;
import lsp.violation.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		rectangle.calculateArea();
		
		Square square = new Square(20);
		square.calculateArea();
	}
	
	
	

}
