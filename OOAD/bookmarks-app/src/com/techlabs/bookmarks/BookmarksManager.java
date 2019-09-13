package com.techlabs.bookmarks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookmarksManager {
	List<Bookmark> list = new ArrayList<Bookmark>();
	//Bookmark bookmarks = new Bookmark();
	HtmlWriter writer = new HtmlWriter();

	public BookmarksManager() {
		super();
		try {
			this.list = retrieve();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this.bookmarks = bookmarks;
	}

	private void store(List<Bookmark> list2) throws IOException {
		ArrayList<Bookmark> urls = (ArrayList<Bookmark>) list2;
		try {
			FileOutputStream fs = new FileOutputStream("Resources/Bookmarks.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(urls);
			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ArrayList<Bookmark> retrieve() throws IOException, ClassNotFoundException {
		try {
			File f = new File("Resources/Bookmarks.txt");
			if (!f.exists()) {
				f.createNewFile();
				list = new ArrayList<Bookmark>();
			}
			FileInputStream file = new FileInputStream(f);
			ObjectInputStream os = new ObjectInputStream(file);
			list = (List<Bookmark>) os.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<Bookmark>) list;
	}

	public List<Bookmark> getUrls() throws ClassNotFoundException, IOException {
		File file = new File("Resources/Bookmarks.txt");
		if (file.length() == 0) {
			ArrayList<Bookmark> urls = retrieve();
			list.addAll(urls);
		}
		return list;
	}

	public void addUrl(Bookmark bookmark) {
		list.add(bookmark);
		try {
			store(list);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void export() throws IOException{
		writer.addBookmarkToHtml(list); 
	}

}
