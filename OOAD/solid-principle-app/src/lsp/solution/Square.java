package lsp.solution;

public class Square implements IShape {
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	public int getSide() {
		return side;
	}
	
	
	
	
	

}
