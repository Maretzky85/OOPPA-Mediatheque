package tests;

import com.company.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

	Book testBook;

	@Before
	public void setUp() throws Exception {
		this.testBook = new Book(2, "Moby Dick", "Dick author", "1956", "media source page", 436);
	}

	@After
	public void tearDown() throws Exception {
		this.testBook = null;
	}

	@Test
	public void toStringTest() {
		assertTrue(testBook.toString().equals("Book title: Moby Dick, Publisher: Dick author, Release Date: 1956, Pages: 436"));
	}
}