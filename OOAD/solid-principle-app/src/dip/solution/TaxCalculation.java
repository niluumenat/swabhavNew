package dip.solution;

public class TaxCalculation {
	private ILogger logger;

	public TaxCalculation(ILogger logger) {
		this.logger = logger;
	}

	public int calculate(int rate, int amount) {
		int r = -1;
		try {
			r = rate / amount;

		} catch (Exception ex) {
			String message = ex.getMessage();
			logger.log(message);
		}
		return r;

	}

}
