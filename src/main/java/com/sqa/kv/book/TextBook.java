/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class TextBook extends NonFiction
{
	private boolean usedToStudyForSat;
	private String subject;

	public TextBook()
	{
		super();
		this.setUsedToStudyForSat(false);
		this.setSubject("Unknown");
	}

	public TextBook(String authorOrPublisher, String genre, String region, boolean isReliableSource,
			boolean usedToStudyForSat, String subject)
	{
		super(authorOrPublisher, genre, region, isReliableSource);
		this.setUsedToStudyForSat(usedToStudyForSat);
		this.setSubject(subject);
	}

	public void examPrep()
	{
		System.out.println("Hope you studied for the exam. Good luck!");
	}

	public String getSubject()
	{
		return this.subject;
	}

	public boolean isUsedToStudyForSat()
	{
		return this.usedToStudyForSat;
	}

	public void projectPrep()
	{
		if (this.isUsedToStudyForSat() == true)
		{
			System.out.println("You can use same material used for SAT exam to prepare for your final project");
		}
		else
		{
			System.out.println("Use any available material to prepare for the final exam.");
		}
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public void setUsedToStudyForSat(boolean usedToStudyForSat)
	{
		this.usedToStudyForSat = usedToStudyForSat;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nText book: ");
		builder.append("\n\tWas textbook used to sudy for SAT exam? ");
		builder.append(this.usedToStudyForSat);
		builder.append("\n\tWhat was the subject? ");
		builder.append(this.subject);
		return builder.toString();
	}
}
