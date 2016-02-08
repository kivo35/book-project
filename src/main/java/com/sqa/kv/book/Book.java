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

	public Book(String authorOrPublisher, String genre)
	{
		super();
		this.authorOrPublisher = authorOrPublisher;
		this.genre = genre;
	}

	public void environmentLocation()
	{
		if (this.genre.equalsIgnoreCase("Mystery") || this.genre.equalsIgnoreCase("Fantasy"))
		{
			System.out.println(
					"The environment/setting might be comming from " + this.getAuthorOrPublisher() + " imagination");
		}
		else if (this.genre.equalsIgnoreCase("Biography") || this.genre.equalsIgnoreCase("Textbook"))
		{
			System.out.println(
					"The environmnet used by " + this.getAuthorOrPublisher() + " is based on the real locaton");
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
		System.out.println("I like to read" + this.getGenre() + " books");
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
		builder.append("Book information: ");
		builder.append("\tAuthor or publisher: ");
		builder.append(this.authorOrPublisher);
		builder.append("\tgenre: ");
		builder.append(this.genre);
		return builder.toString();
	}

}
