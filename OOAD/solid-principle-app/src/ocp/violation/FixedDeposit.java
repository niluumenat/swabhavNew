package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(String name, double principle, int duration, FestivalType festival) {
		super();
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest(){
		double simpleinterest= 0;
		if(festival==festival.HOLI){
			simpleinterest = principle*duration*0.08;
		}else if(festival == festival.NEW_YEAR){
			simpleinterest = principle*duration*0.09;
		}else if(festival == festival.NORMAL){
			simpleinterest = principle*duration*0.07;
		}
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

	public FestivalType getFestival() {
		return festival;
	}
	
	

}
