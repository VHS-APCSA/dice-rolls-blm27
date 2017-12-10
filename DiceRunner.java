public class DiceRunner 
{
	public static void main(String[] args)
	{
		/*
		 * Make an instance of the DiceRolls class.
		 * Roll two dice 100 times and then print out
		 * the resulting histogram.
		 */
		DiceRolls test = new DiceRolls();
		for(int r = 0; r < 100; r++)
		{
			test.roll();
		}

		System.out.println(test.histogram());
	}
}
