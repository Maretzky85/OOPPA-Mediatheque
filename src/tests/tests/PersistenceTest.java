package tests;

import com.company.model.MediaItem;
import com.company.model.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PersistenceTest {
	Persistence persistence;

	@Before
	public void setUp() throws Exception {
		persistence = new Persistence();
		assertTrue(persistence.getData().size() == 0);
	}

	@Test
	public void importData() {
//		persistence.importData();
//		persistence.addNewRecord(new MediaItem
//				(MediaType.MOVIE,
//						1,
//						"TitleOfMovie",
//						"SuperDuperAuthor",
//						"2157",
//						"adres",
//						123));
//		assertTrue(persistence.getData().size() > 0);
	}

	@Test
	public void addNewRecord() {
		int currentSize = persistence.getData().size();
//		persistence.addNewRecord(new MediaItem
//				(MediaType.MOVIE,
//				2,
//				"TitleOfMovie",
//				"SuperDuperAuthor",
//				"2157",
//				"adres",
//				123));
//		System.out.println(persistence.getData().size());
//		assertTrue("received: "+persistence.getData().size(),persistence.getData().size() == currentSize+1);
	}

	@Test
	public void removeRecord() {
//		System.out.println(persistence.getData().size());
//		int currentSize = persistence.getData().size();
//		persistence.addNewRecord(new MediaItem
//				(MediaType.MOVIE,
//						3,
//						"TitleOfMovie",
//						"SuperDuperAuthor",
//						"2157",
//						"adres",
//						123));
//		persistence.removeRecord(3);
//		int sizeAfterDelete = persistence.getData().size();
//		assertTrue("received: "+sizeAfterDelete,currentSize > sizeAfterDelete);
	}

	@Test
	public void saveData() {
	}

	@Test
	public void editData() {
	}

	@After
	public void tearDown() throws Exception {
		persistence = null;
	}
}