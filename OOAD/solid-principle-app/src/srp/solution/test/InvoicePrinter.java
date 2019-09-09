package srp.solution.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import srp.solution.Invoice;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice) {
		System.out.println(invoice.getId() + "  " + invoice.getName() + "  " + invoice.getCost() + "  "
				+ invoice.getDiscountPercentage());
	}

	public void printHtmlInvoice(Invoice invoice) throws IOException {
		OutputStream file = new FileOutputStream("Resources/Output.html");
		PrintStream printhtml = new PrintStream(file);

		String htmlheader = "<html><head>";
		htmlheader += "<title> HTML </title>";
		String style = "<style>table, th, td { border: 1px solid black;}</style></head><body>";
		String htmltable = "<table style = ' width = 100% ' >";
		String tabletitle = "<tr><th>Id</th> <th>Name</th> <th>Cost</th> </tr>";
		String[] data = new String[3];
		data[0] ="<tr><td>" + invoice.getId() + "</td>" ;
		data[1]= "<td>" + invoice.getName() + "</td>" ;
		data[2] =  "<td>"+ invoice.getCost() + "</td></tr>";
		String htmlfooter = "</table></body></html>";

		printhtml.println(htmlheader);
		printhtml.println(style);
		printhtml.println(htmltable);
		printhtml.println(tabletitle);
		printhtml.println(data[0] + data[1] + data[2]);
		printhtml.append(htmlfooter);

	}

}
