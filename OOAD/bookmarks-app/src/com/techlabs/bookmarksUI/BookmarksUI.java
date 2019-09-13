package com.techlabs.bookmarksUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import com.techlabs.bookmarks.Bookmark;
import com.techlabs.bookmarks.BookmarksManager;

public class BookmarksUI {
	private final int ADD = 1;
	private final int VIEW = 2;
	private final int EXPORT = 3;
	private final int EXIT = 4;

	BookmarksManager manager = new BookmarksManager();
	Scanner sc = new Scanner(System.in);

	public void bookmarkUI() throws ClassNotFoundException, IOException, InterruptedException, URISyntaxException {
		int choice = 8;
		while (choice != 6) {
			System.out.println("1. Add Bookmark");
			System.out.println("2. View All Bookmarks ");
			System.out.println("3. Export to html file ");
			System.out.println("4. Exit ");
			System.out.println("Choose: ");
			choice = sc.nextInt();
			switch (choice) {
			case ADD: {
				addBookmark();
				break;
			}
			case VIEW: {
				viewBookmarks();
				break;
			}
			case EXPORT: {
				export();
				break;
			}
			case EXIT: {
				System.exit(0);
			}
			default:
				System.out.println("Error");
			}
		}

	}

	private void export() throws IOException, InterruptedException, URISyntaxException {
		manager.export();
		Thread.sleep(3000);
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
		}
		Desktop.getDesktop()
				.browse(new URI("file:///C:/swabhavRepository/OOAD/bookmarks-app/Resources/Bookmarks.html"));
	}

	private void viewBookmarks() throws ClassNotFoundException, IOException {
		for (Bookmark bookmarks : manager.getUrls()) {
			System.out.println("*"+bookmarks.getUrl());
			System.out.println( bookmarks.getDescription());
		}
	}

	private void addBookmark() throws MalformedURLException {
		System.out.println("Enter the Url: ");
		String url = sc.next();
		System.out.println("Enter the description: ");
		String description = sc.next();
		Bookmark bookmark = new Bookmark();
		bookmark.setUrl(url);
		bookmark.setDescription(description);
		manager.addUrl(bookmark);
	}

}
