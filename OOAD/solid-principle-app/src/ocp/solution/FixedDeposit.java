package ocp.solution;


public class FixedDeposit {
	private String name;
	private double principle;
	private int duration;
	private IFestival festival;

	public FixedDeposit(String name, double principle, int duration,IFestival festival) {
		this.festival = festival;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
	}
	
	public double calculateSimpleInterest(){
		
		double simpleinterest= 0;
		simpleinterest = principle* festival.getRate()*duration;
		return simpleinterest;
	
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public IFestival getFestival() {
		return festival;
	}
	
	

}
