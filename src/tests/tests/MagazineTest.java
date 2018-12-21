package tests;

import com.company.model.Magazine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagazineTest {

	Magazine testMagazine;

	@Before
	public void setUp() throws Exception {
		this.testMagazine = new Magazine(3, "CD-Action", "CD-project", "2222", "source link", 120);
	}

	@After
	public void tearDown() throws Exception {
		this.testMagazine = null;
	}

	@Test
	public void toStringTest() {
		assertTrue(testMagazine.toString().equals("Magazine title: CD-Action, Publisher: CD-project, Release Date: 2222, Pages: 120"));
	}
}