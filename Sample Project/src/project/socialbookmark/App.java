package project.socialbookmark;

import project.socialbookmark.entities.Bookmark;
import project.socialbookmark.entities.User;
import project.socialbookmark.managers.UserManager;

public class App {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("Lodaing Data....");
		DataStore.loadData();
		
	}

	public static void main(String[] args) {
		loadData();
	}

}
