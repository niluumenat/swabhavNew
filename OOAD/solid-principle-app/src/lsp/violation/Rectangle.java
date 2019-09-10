package lsp.violation;

public class Rectangle {
	protected int width;
	protected int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea(){
		int area =0;
		area = width* height;
		return area;
		
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	

}
