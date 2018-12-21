package tests;

import com.company.model.Music;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicTest {

	Music testMusic;

	@Before
	public void setUp() throws Exception {
		this.testMusic = new Music(5, "Song of Caged Bird", "Stirling", "2017", "mediasource", 328);
	}

	@After
	public void tearDown() throws Exception {
		this.testMusic = null;
	}

	@Test
	public void toStringTest() {
		assertTrue(testMusic.toString().equals("Song title: Song of Caged Bird, Author: Stirling, Release Date: 2017, Length(in sec): 328"));
	}
}