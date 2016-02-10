/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class Book
{
	private String authorOrPublisher;
	private String genre;

	public Book()
	{
		this.setAuthorOrPublisher("Unknown");
		this.setGenre("Unknown");
	}

	public Book(String authorOrPublisher, String genre)
	{
		this.setAuthorOrPublisher(authorOrPublisher);
		this.setGenre(genre);
	}

	public void environmentLocation()
	{
		if (this.getGenre().equalsIgnoreCase("Mystery") || this.getGenre().equalsIgnoreCase("Fantasy"))
		{
			System.out.println(
					"The environment/setting might be comming from " + this.getAuthorOrPublisher() + " imagination");
		}
		else if (this.getGenre().equalsIgnoreCase("Biography") || this.getGenre().equalsIgnoreCase("Text book"))
		{
			System.out.println(
					"The environmnet used by " + this.getAuthorOrPublisher() + " is based on the real location");
		}
		else
		{
			System.out.println("Uknown location");
		}
	}

	public String getAuthorOrPublisher()
	{
		return this.authorOrPublisher;
	}

	public String getGenre()
	{
		return this.genre;
	}

	public void read()
	{
		System.out.println("I like to read " + this.getGenre() + " books");
	}

	public void setAuthorOrPublisher(String authorOrPublisher)
	{
		this.authorOrPublisher = authorOrPublisher;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Book information:\n");
		builder.append("\tAuthor or publisher: ");
		builder.append(this.authorOrPublisher);
		builder.append("\n\tgenre: ");
		builder.append(this.genre);
		return builder.toString();
	}

}
