package lsp.violation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setWidth(int width) {
		this.width = this.height =width;
	}

	@Override
	public void setHeight(int height) {
		this.height = this.width = height;
	}
	
	

}
