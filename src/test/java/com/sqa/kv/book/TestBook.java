/**
 *
 */
package com.sqa.kv.book;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author kvoitau
 *
 */
public class TestBook
{

	@Ignore
	public void testBiography()
	{
		Biography[] books = new Biography[] { new Biography(),
				new Biography("Einstein", "biography", "USA", true, "Einstein", true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].giveBackgroundStory();
		}
	}

	@Ignore
	public void testBook()
	{
		Book[] books = new Book[] { new Book(), new Fiction(), new NonFiction(),
				new Fiction("Tolkien", "Fantasy", true, true), new NonFiction("Pearson", "Text book", "USA", true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].read();
			books[i].environmentLocation();
		}
	}

	@Ignore
	public void testFantasy()
	{
		Fantasy[] books = new Fantasy[] { new Fantasy(), new Fantasy("Tolkien", "fantasy", true, true, true, true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].castMagic();
			books[i].battle();
		}
	}

	@Ignore
	public void testFiction()
	{
		Fiction[] books = new Fiction[] { new Fiction(), new Fiction("Tolkien", "Fantasy", true, true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].scienceFiction();
		}
	}

	@Ignore
	public void testMystery()
	{
		Mystery[] books = new Mystery[] { new Mystery(),
				new Mystery("Sherlock Holmes", "Mystery", true, true, true, true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].decipherPuzzle();
			books[i].solvePuzzle();
		}
	}

	@Ignore
	public void testNonFiction()
	{
		NonFiction[] books = new NonFiction[] { new NonFiction(), new NonFiction("Pearson", "Text book", "USA", true) };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].sources();
		}
	}

	@Test
	public void testTextBook()
	{
		TextBook[] books = new TextBook[] { new TextBook(),
				new TextBook("Pearson", "textbook", "USA", true, true, "Math") };
		for (int i = 0; i < books.length; i++)
		{
			System.out.println("------Book " + (i + 1) + " ------");
			System.out.println(books[i]);
			books[i].examPrep();
			books[i].projectPrep();
		}
	}
}
