package tests;

import com.company.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

	Movie testMovie;

	@Before
	public void setUp() throws Exception {
		this.testMovie = new Movie(4, "Rambo", "Stallone", "1986", "Source media", 123);
	}

	@After
	public void tearDown() throws Exception {
		this.testMovie = null;
	}

	@Test
	public void toStringTest() {
		assertTrue(testMovie.toString().equals("Movie title: Rambo, Studio: Stallone, Release Date: 1986, Length(in min): 123"));
	}
}