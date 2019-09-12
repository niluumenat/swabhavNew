package isp.solution.test;

import isp.solution.IEatable;
import isp.solution.IWorkable;
import isp.solution.Manager;
import isp.solution.Robot;


public class WorkerTest {

	public static void main(String[] args) {
		atWork(new Manager());
		atWork(new Robot());
		
		atCafeteria(new Manager());
		
	}

	private static void atCafeteria(IEatable w) {
		System.out.println("At Cafeteria");
		w.startEat();
		w.stopEat();
		
	}

	private static void atWork(IWorkable w) {
		System.out.println("At Workshop");
		w.startWork();
		w.stopWork();

	}

}
