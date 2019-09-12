package isp.solution;

public class Manager implements IWorkEat{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("manager is starting his work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("manager stopped working ");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("manager is eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("manager stops eating");
	}

}
