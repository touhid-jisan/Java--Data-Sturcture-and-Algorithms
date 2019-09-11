package project.socialbookmark;

import project.socialbookmark.constants.Gender;
import project.socialbookmark.constants.UserType;
import project.socialbookmark.entities.Bookmark;
import project.socialbookmark.entities.User;
import project.socialbookmark.entities.UserBookmark;
import project.socialbookmark.managers.BookmarkManager;
import project.socialbookmark.managers.UserManager;

public class DataStore {
	private static final int USER_BOOKMARK_LIMIT = 5;
	private static final int BOOKMARK_COUNT_PER_TYPE = 5;
	private static final int BOOKMARKS_TYPE_COUNT = 3;
	private static final int TOTAL_USER_COUNT = 5;

	private static User[] users = new User[TOTAL_USER_COUNT]; // can have 5 users

	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARKS_TYPE_COUNT][BOOKMARK_COUNT_PER_TYPE]; // 3 types and
																											// each type
																											// canhave 5
																											// bookmarks
	private static UserBookmark[] userBookemarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT]; // 5 users

	public static User[] getUsers() {
		return users;
	}	

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}

	private static void loadUsers() {
		users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "Masd",
				Gender.MALE, UserType.USER);

		users[1] = UserManager.getInstance().createUser(1001, "user0@semanticsquare.com", "test", "abc", "sa",
				Gender.MALE, UserType.USER);

		users[2] = UserManager.getInstance().createUser(1002, "user0@semanticsquare.com", "test", "bas", "asfsf",
				Gender.MALE, UserType.USER);

		users[3] = UserManager.getInstance().createUser(1003, "user0@semanticsquare.com", "test", "dbd", "F",
				Gender.MALE, UserType.USER);

		users[4] = UserManager.getInstance().createUser(1004, "user0@semanticsquare.com", "test", "adb", "afsf",
				Gender.MALE, UserType.USER);
	}

	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 2", "",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		bookmarks[0][1] = BookmarkManager.getInstance().createWeblink(2011,
				"THow do I import a pre-existing Java project into Eclipse and get up and running?", "",
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
				"http://www.stackoverflow.com	unknown");
		bookmarks[0][2] = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 2", "",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		bookmarks[0][3] = BookmarkManager.getInstance().createWeblink(2011,
				"THow do I import a pre-existing Java project into Eclipse and get up and running?", "",
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
				"http://www.stackoverflow.com	unknown");
		bookmarks[0][4] = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 2", "",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");

	}

	private static void loadMovies() {
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten1" }, new String[] { "Orson Welles1" }, "Classics", 8.5);
		bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles2", "Joseph Cotten2" }, new String[] { "Orson Welles2" }, "Classics", 6.5);
		bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles3", "Joseph Cotten3" }, new String[] { "Orson Welles3" }, "Classics", 7.5);
		bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles4", "Joseph Cotten4" }, new String[] { "Orson Welles4" }, "Classics", 8.5);
		bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles5", "Joseph Cotten5" }, new String[] { "Orson Welles5" }, "Classics", 3.5);

	}

	private static void loadBooks() {
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000, "Walden1", "", 1854, "Wilder Publications1",
				new String[] { "Henry David Thoreau1" }, "Philosophy", 1.3);
		bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001, "Walden2", "", 1855, "Wilder Publications2",
				new String[] { "Henry David Thoreau2" }, "Philosophy", 2.3);
		bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002, "Walden3", "", 1856, "Wilder Publications3",
				new String[] { "Henry David Thoreau3" }, "Philosophy", 3.3);
		bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003, "Walden4", "", 1857, "Wilder Publications4",
				new String[] { "Henry David Thoreau4" }, "Philosophy", 4.3);
		bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004, "Walden5", "", 1858, "Wilder Publications5",
				new String[] { "Henry David Thoreau5" }, "Philosophy", 5.3);
	}

}
