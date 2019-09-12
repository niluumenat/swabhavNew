package com.techlabs.bookmarks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BookmarksManager {
	List<Bookmark> list = new ArrayList<Bookmark>();
	Bookmarks bookmarks = new Bookmarks();
	
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
		this.bookmarks = bookmarks;
	}

	private void store(List<Bookmark> list2) throws IOException{
		ArrayList<Bookmark> urls = (ArrayList<Bookmark>) list2;
		try {
			FileOutputStream fs = new FileOutputStream("Resources/Bookmark.txt");
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
			File f = new File("Resources/Bookmark.txt");
			if (!f.exists()) {
				f.createNewFile();
				list = new ArrayList<>();
			}	
			FileInputStream file = new FileInputStream(f);
			ObjectInputStream os = new ObjectInputStream(file);
			list =  (List<Bookmark>) os.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<Bookmark>) list;
	}
	
	public List<Bookmark> getUrls() throws ClassNotFoundException, IOException {
		File file = new File("Resources/Bookmark.txt");
		if (file.length() == 0) {
			ArrayList<Bookmark> urls = retrieve();
			list.addAll(urls);
		}
		return list;
	}
	
	public void addUrl(Bookmark bookmark ) throws MalformedURLException {
		//URL url2 = new URL(url);
		list.add(bookmark);
		try {
			store(list);
			bookmarks.addBookmark(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
