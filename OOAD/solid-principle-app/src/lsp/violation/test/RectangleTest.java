package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class RectangleTest {

	public static void main(String[] args) {
		shouldNOtChangeHeight_IfWidthModify(new Rectangle(5,10));
		shouldNOtChangeHeight_IfWidthModify(new Square(20));

	}
	
	private static void shouldNOtChangeHeight_IfWidthModify(Rectangle r){
		int before = r.getHeight();
		
		r.setWidth(r.getWidth()+10);
		
		int after = r.getHeight();
		
		System.out.println(before);
		System.out.println(after);
		System.out.println(before==after);
	}

}
