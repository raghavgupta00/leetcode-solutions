class Solution {
	/*
	(Kinda) Naive solution. A helper method is used to check whether each
	element of the array has an even number of digits or not.
	Running time is O(m * n), where m = number of digits of the largest number,
	n = size of the array
	*/
	public boolean hasEvenDigits(int num)
	{
		int numDigits = 0;
		while(num != 0)
		{
			num = num / 10;
			numDigits++;
		}
		return numDigits % 2 == 0;
	}

	public int findNumbers(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(hasEvenDigits(nums[i]))
			{
				count++;
			}
		}
		return count;
	}

	/*
	Mathematically elegant solution. Uses the property that the floor of
	the logarithm base 10 of any number plus 1 equals the number of digits of
	that number.
	*/
	public int findNumbers(int[] nums)
	{
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if( ( Math.floor( Math.log10(nums[i]) + 1) % 2 ) == 0 )
			{
				count++;
			}
		}
		return count;
	}

}