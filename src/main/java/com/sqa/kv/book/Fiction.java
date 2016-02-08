/**
 *
 */
package com.sqa.kv.book;

import com.sqa.kv.util.helper.RequestInput;

/**
 * @author kvoitau
 *
 */
public class Fiction extends Book
{
	private boolean hasImaginaryWorld;
	private boolean hasDifferentRace;

	public Fiction()
	{
		super();
		this.setHasDifferentRace(false);
		this.setHasImaginaryWorld(false);
	}

	public Fiction(String authorOrPublisher, String genre, boolean hasImaginaryWorld, boolean hasDifferentRace)
	{
		super(authorOrPublisher, genre);
		this.setHasDifferentRace(hasDifferentRace);
		this.setHasImaginaryWorld(hasImaginaryWorld);
	}

	public boolean isHasDifferentRace()
	{
		return this.hasDifferentRace;
	}

	public boolean isHasImaginaryWorld()
	{
		return this.hasImaginaryWorld;
	}

	public boolean scienceFiction()
	{
		boolean sFiction = RequestInput.getBoolean("Is it a Science Fiction book? ");
		return sFiction;
	}

	public void setHasDifferentRace(boolean hasDifferentRace)
	{
		this.hasDifferentRace = hasDifferentRace;
	}

	public void setHasImaginaryWorld(boolean hasImaginaryWorld)
	{
		this.hasImaginaryWorld = hasImaginaryWorld;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nFiction: ");
		builder.append("\thas imaginary world? ");
		builder.append(this.hasImaginaryWorld);
		builder.append("\n\t\thas differnt race? ");
		builder.append(this.hasDifferentRace);
		return builder.toString();
	}
}
