package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot started working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}

}
