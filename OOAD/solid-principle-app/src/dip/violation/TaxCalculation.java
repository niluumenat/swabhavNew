package dip.violation;

public class TaxCalculation {
	private LogType log;

	public TaxCalculation(LogType log) {
		this.log = log;
	}

	public int calculate(int rate, int amount) {
		int r = -1;
		try {
			r = rate / amount;

		} catch (Exception ex) {
			String message=ex.getMessage();
			if(log==log.XML){
				XmlLogger xmlLogger= new XmlLogger();
				xmlLogger.Log(message);
			}else if(log==log.TXT){
				TxtLogger txtLogger = new TxtLogger();
				txtLogger.Log(message);
			}
		}
		return r;

	}

}
