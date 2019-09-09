package srp.violation.test;

import srp.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice= new Invoice("Nilam", 100, 0.2f);
		invoice.printInvoice();
		
	}

}
