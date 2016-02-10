/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class Biography extends NonFiction
{
	private String historicalFigure;
	private boolean writtenByDescribedPerson;

	public Biography()
	{
		super();
		this.setHistoricalFigure("Unknown");
		this.setWrittenByDescribedPerson(false);
	}

	public Biography(String authorOrPublisher, String genre, String region, boolean isReliableSource,
			String historicalFigure, boolean writtenByDescribedPerson)
	{
		super(authorOrPublisher, genre, region, isReliableSource);
		this.setHistoricalFigure(historicalFigure);
		this.setWrittenByDescribedPerson(writtenByDescribedPerson);
	}

	public String getHistoricalFigure()
	{
		return this.historicalFigure;
	}

	public void giveBackgroundStory()
	{
		if (!(this.getHistoricalFigure().equalsIgnoreCase("Unknown")))
		{
			System.out.println("The Person was a prominent scientist born in Europe and then immigrated to the USA");
		}
		else
		{
			System.out.println("No background description found.");
		}
	}

	public boolean isWrittenByDescribedPerson()
	{
		return this.writtenByDescribedPerson;
	}

	public void setHistoricalFigure(String historicalFigure)
	{
		this.historicalFigure = historicalFigure;
	}

	public void setWrittenByDescribedPerson(boolean writtenByDescribedPerson)
	{
		this.writtenByDescribedPerson = writtenByDescribedPerson;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nBiography: ");
		builder.append("\n\tWhat's the name od described person? ");
		builder.append(this.historicalFigure);
		builder.append("\n\tDoes the book was written by the same person? ");
		builder.append(this.writtenByDescribedPerson);
		return builder.toString();
	}
}
