package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		
		atWork(new Robot());
		atWork(new Manager());
		
		atCafeteria(new Manager());
		atCafeteria(new Robot()); //Violation of LSP 
		//Solution is ISP
	}

	private static void atCafeteria(IWorker w) {
		System.out.println("At Cafeteria");
		w.startEat();
		w.stopEat();
		
	}

	private static void atWork(IWorker w) {
		System.out.println("At Workshop");
		w.startWork();
		w.stopWork();
		
		
	}
	
	

}
