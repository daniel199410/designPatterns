package structural.composite.src;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class test {
	
	@Test
	public void shouldGetATree() {
		final String expectedStructure =
				"d1\n" + 
				" d1f1\n" + 
				" d2\n" + 
				"  d2f1\n" + 
				"  d2f2\n" + 
				" d3\n" + 
				"  d3f1\n" + 
				" d4\n" + 
				"  d4f1\n" + 
				"  d5\n" + 
				"   d5f1\n" +
				" d1f2\n"+
				"";
		Directory d2 = new Directory("d2", Arrays.asList(new File("d2f1"), new File("d2f2")));
		Directory d3 = new Directory("d3", Collections.singletonList(new File("d3f1")));
		Directory d5 = new Directory("d5", Collections.singletonList(new File("d5f1")));
		Directory d4 = new Directory("d4", Arrays.asList(new File("d4f1"), d5));
		Directory d1 = new Directory("d1", Arrays.asList(new File("d1f1"), d2, d3, d4, new File("d1f2")));
		assertEquals(expectedStructure, d1.ls(0));
	}
	
	@Test
	public void shouldGetASingleFile() {
		File f = new File("abc");
		assertEquals("abc\n", f.ls(0));
	}
	
	@Test
	public void shouldGetADirectoryWithOnlyFiles() {
		Directory d1 = new Directory("d1", Arrays.asList(
				new File("d1f1"),
				new File("d1f2"),
				new File("d1f3"))
		);
		assertEquals("d1\n d1f1\n d1f2\n d1f3\n", d1.ls(0));
	}
}
