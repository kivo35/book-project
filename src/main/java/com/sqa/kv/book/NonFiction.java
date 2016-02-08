/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class NonFiction extends Book
{
	private String region;
	private boolean isReliableSource;

	public NonFiction()
	{
		super();
		this.setRegion("Unknown");
		this.setReliableSource(false);
	}

	public NonFiction(String authorOrPublisher, String genre, String region, boolean isReliableSource)
	{
		super(authorOrPublisher, genre);
		this.region = region;
		this.isReliableSource = isReliableSource;
	}

	public String getRegion()
	{
		return this.region;
	}

	public boolean isReliableSource()
	{
		return this.isReliableSource;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public void setReliableSource(boolean isReliableSource)
	{
		this.isReliableSource = isReliableSource;
	}

	public void sources()
	{
		if (this.isReliableSource() == true)
		{
			System.out.println("The book's reliable source can be found on the internet");
		}
		else
		{
			System.out.println("The book doesn't has a relaible source");
		}
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nNon Fiction: ");
		builder.append("\t based on reliable source:  ");
		builder.append(this.isReliableSource);
		builder.append("\n\t\tthe region described in the book: ");
		builder.append(this.region);
		return builder.toString();
	}
}
