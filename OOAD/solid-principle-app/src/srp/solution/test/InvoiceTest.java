package srp.solution.test;

import java.io.IOException;

import srp.solution.Invoice;

public class InvoiceTest {

	public static void main(String[] args) throws IOException {
		Invoice invoice=new Invoice("Nilam", 100, 0.2f);
		
		InvoicePrinter printer = new InvoicePrinter();
		printer.printInvoice(invoice);
		printer.printHtmlInvoice(invoice);
		
		Invoice invoice2=new Invoice("Heta", 200, 0.5f);
		
		printer.printInvoice(invoice2);
		printer.printHtmlInvoice(invoice2);
		
		
	}

}
