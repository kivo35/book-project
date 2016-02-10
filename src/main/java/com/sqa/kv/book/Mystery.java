/**
 *
 */
package com.sqa.kv.book;

/**
 * @author kvoitau
 *
 */
public class Mystery extends Fiction
{
	private boolean detective;
	private boolean puzzle;

	public Mystery()
	{
		super();
		this.setDetective(false);
		this.setPuzzle(false);
	}

	public Mystery(String authorOrPublisher, String genre, boolean hasImaginaryWorld, boolean hasDifferentRace,
			boolean detective, boolean puzzle)
	{
		super(authorOrPublisher, genre, hasImaginaryWorld, hasDifferentRace);
		this.setDetective(detective);
		this.setPuzzle(puzzle);
	}

	public void decipherPuzzle()
	{
		if (this.isDetective() == true && this.isPuzzle() == true)
		{
			System.out.println("The puzzle was deciphered!");
		}
		else
		{
			System.out.println("The puzzle can't be deciphered!");
		}
	}

	public boolean isDetective()
	{
		return this.detective;
	}

	public boolean isPuzzle()
	{
		return this.puzzle;
	}

	public void setDetective(boolean detective)
	{
		this.detective = detective;
	}

	public void setPuzzle(boolean puzzle)
	{
		this.puzzle = puzzle;
	}

	public void solvePuzzle()
	{
		if (this.isDetective() == true)
		{
			System.out.println("Sherlock Holmes just solved the puzzle!");
		}
		else
		{
			System.out.println("Sherlock Holmes didn't solve the puzzle!");
		}
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nMystery: ");
		builder.append("\n\tDoes book has detective? ");
		builder.append(this.detective);
		builder.append("\n\tDoes book has puzzle? ");
		builder.append(this.puzzle);
		return builder.toString();
	}
}
