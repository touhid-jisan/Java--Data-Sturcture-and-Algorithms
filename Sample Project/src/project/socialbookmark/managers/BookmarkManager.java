package project.socialbookmark.managers;

import project.socialbookmark.entities.Book;
import project.socialbookmark.entities.Movie;
import project.socialbookmark.entities.WebLink;

public class BookmarkManager {

	// Singleton
	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String profileURL, int releaseYear, String[] cast,
			String[] director, String genre, double imdbRating) {

		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileURL(profileURL);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirector(director);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);

		return movie;
	}

	public Book createBook(long id, String title, String profileURL, int publicationYear, String publisher,
			String[] author, String genre, double amazonRating) {
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setProfileURL(profileURL);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		
		return book;
	}
	
	public WebLink createWeblink(long id, String title, String profileURL, String url, String host ) {
	
		WebLink weblink = new WebLink(); 
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setProfileURL(profileURL);
		weblink.setUrl(url);
		weblink.setHost(host);
		
		return weblink;
	}
	
}
