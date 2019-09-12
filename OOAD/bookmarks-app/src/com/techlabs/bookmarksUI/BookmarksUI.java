package com.techlabs.bookmarksUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import com.techlabs.bookmarks.Bookmark;
import com.techlabs.bookmarks.Bookmarks;
import com.techlabs.bookmarks.BookmarksManager;

public class BookmarksUI {
	private final int ADD = 1;
	private final int VIEW = 2;
	private final int EXIT = 3;

	Bookmarks bookmarks;
	BookmarksManager manager = new BookmarksManager();
	Scanner sc = new Scanner(System.in);

	public void bookmarkUI() throws ClassNotFoundException, IOException {
		int choice = 8;
		while (choice != 6) {
			System.out.println("1. Add Bookmark");
			System.out.println("2. View All Bookmarks ");
			System.out.println("3. Exit ");
			System.out.println("Choose: ");
			choice = sc.nextInt();
			switch (choice) {
			case ADD: {
				addBookmark();
				break;
			}
			case VIEW: {
				try {
					viewBookmarks();
				} catch (URISyntaxException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

	private void viewBookmarks() throws ClassNotFoundException, IOException, URISyntaxException, InterruptedException {
		for (Bookmark bookmarks : manager.getUrls()) {
			System.out.println(bookmarks);
		}
		Thread.sleep(3000);
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
		}
		Desktop.getDesktop()
				.browse(new URI("file:///C:/swabhavRepository/OOAD/bookmarks-app/Resources/Bookmarks.html"));

	}

	private void addBookmark() throws MalformedURLException {
		System.out.println("Enter the Url: ");
		String url = sc.next();
		System.out.println("Enter the description: ");
		String description = sc.next();
		Bookmark bookmark = new Bookmark(url, description);
		manager.addUrl(bookmark);

	}

}
