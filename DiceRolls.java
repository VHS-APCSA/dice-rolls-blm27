
public class DiceRolls 
{
	private int[] tally;
	/**
	 * Initialize tally as an int[] array that contains
	 * 11 spots to hold tallies for the 11 possible outcomes
	 * when rolling two six-sided dice.
	 */
	public DiceRolls()
	{
		tally = new int[11];
	}
	/**
	 * This method should roll two six-sided dice using the 
	 * Die class and tally the result in the array.
	 * That is, if the dice come up with a 3 and a 6 then the
	 * 7th spot in the array should be increased by 1. Why 7th spot?
	 * Because the smallest roll of two dice is 2 and that tally
	 * goes in the 0th index of the array.
	 */
	public void roll()
	{
		tally[Die.die(6) + Die.die(6) - 2]++;
	}
	/**
	 * Generate a String histogram of your results.
	 * @return A String that is a histogram of the dice roll tallies
	 * made using asterisks with the tally for each roll included
	 * at the beginning. An example of a histogram for two 2-sided die
	 * is shown below. The tally array would be [5, 11, 4].
	 * 
	 * 5	*****
	 * 11	***********
	 * 4	****
	 */
	public String histogram()
	{
		String res = "";
		for(int roll = 0; roll < tally.length; roll++)
		{
			res += tally[roll] + "\t";
			for(int tal = 0; tal < tally[roll]; tal++)
			{
				res += "*" ;
			}
			res += "\n";
		}

		return res;
	}
}
