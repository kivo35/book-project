/**
 *
 */
package com.sqa.kv.book;

import org.junit.Test;

/**
 * @author kvoitau
 *
 */
public class TestBook extends Fiction
{

	@Test
	public void test()
	{
		Book[] books = new Book[] { new Book(), new Fiction(), new NonFiction(),
				new Fiction("Tolkien", "Fantasy", true, true), new NonFiction("Pearson", "Text book", "USA", true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].read();
			books[i].environmentLocation();
			scienceFiction();
		}
	}
}
