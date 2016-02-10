/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class Fantasy extends Fiction
{
	private boolean Elves;
	private boolean middleAges;

	public Fantasy()
	{
		super();
		this.setElves(false);
		this.setMiddleAges(false);
	}

	public Fantasy(String authorOrPublisher, String genre, boolean hasImaginaryWorld, boolean hasDifferentRace,
			boolean Elves, boolean middleAges)
	{
		super(authorOrPublisher, genre, hasImaginaryWorld, hasDifferentRace);
		this.setElves(Elves);
		this.setMiddleAges(middleAges);
	}

	public void battle()
	{
		if (this.isElves() == true)
		{
			System.out.println("They're always ready for battle!");
		}
		else
		{
			System.out.println("They're no one to battle.");
		}
	}

	public void castMagic()
	{
		if (this.isElves() == true)
		{
			System.out.println("The High Elves' Lord is casting a devastating spell!");
		}
		else
		{
			System.out.println("There's no magic in this land.");
		}
	}

	public boolean isElves()
	{
		return this.Elves;
	}

	public boolean isMiddleAges()
	{
		return this.middleAges;
	}

	public void setElves(boolean elves)
	{
		this.Elves = elves;
	}

	public void setMiddleAges(boolean middleAges)
	{
		this.middleAges = middleAges;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nFantasy: ");
		builder.append("\n\tDoes book has Elves? ");
		builder.append(this.Elves);
		builder.append("\n\tDoes the book setting happens in Middle ages? ");
		builder.append(this.middleAges);
		return builder.toString();
	}
}
