package srp.violation;

public class Invoice {
	private static int id;
	private String name;
	private double cost;
	private float discountPercentage;
	private final float GST = 0.18f;

	static {
		id = 1000;
	}

	public Invoice(String name, double cost, float discountPercentage) {
		id = id + 1;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public double calculateDiscount() {
		double discountCost = 0;
		discountCost = discountPercentage * cost;
		return discountCost;
	}

	public double calculateGST() {
		double gst = 0;
		gst = GST * cost;
		return gst;
	}
	
	public double calculateTotalCost(){
		double total=0;
		total = calculateDiscount() + calculateGST();
		return total;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public static int getId() {
		return id;
	} 
	
	public void printInvoice(){
		System.out.println(getId()+"  " + getName()+"  " + getCost()+"  " + getDiscountPercentage() );
	}

	

}
