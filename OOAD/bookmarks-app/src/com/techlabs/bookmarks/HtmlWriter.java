package com.techlabs.bookmarks;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class HtmlWriter {

	public void addBookmarkToHtml(List<Bookmark> list) throws IOException {
		OutputStream file = new FileOutputStream("Resources/Bookmarks.html");
		PrintStream printhtml = new PrintStream(file);
		String htmlheader = "<html><head>";
		htmlheader += "<title> Bookmarks </title>";
		String style = "</head><body>";
		String heading = "<h1>Bookmarks</h1> <h3>Bookmarks bar</h3>";

		String htmlfooter = "</table></body></html>";

		printhtml.println(htmlheader);
		printhtml.println(style);
		printhtml.println(heading);
		int i = 0;
		while (i < list.size()) {
			String link = "<a href= " + list.get(i).getUrl() + ">" +list.get(i).getDescription() + " </a><br>";
			printhtml.println(link);
			
			i++;	
		}
		printhtml.append(htmlfooter);

	}

	

}
