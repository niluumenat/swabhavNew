package lsp.solution;

public class Rectangle implements IShape {
	private int width;
	private int height;

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

	@Override
	public int calculateArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
