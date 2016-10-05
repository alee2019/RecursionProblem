/**
 *Andrew Lee
 *This is my recursion file, that is able to take in a number and print 0 to that number (both 
 *inclusive). How it does this is described below.
 */

public class RecursionProblem
{
  /**
	* This is the main method that the java interpreter calls. 
	* @param args This is a command line argument
	*/
	public static void main(String[] args)
	{
		printNum(10);
	}	
	
	/**
	*This method prints the integers from 0 to n both inclusive, on separate lines
	*using recursion. It does this by continuously calling itself over (hence the printNum(n-1),
	*until n eventually becomes 0. When n becomes 0, 0 will be printed and now that the function
	*isn't being called anymore, it will begin to print n as it works its way back up. This
	*is why 0 is printed first, and then the rest all the way up to n.
	*@param n The largest integer printed on screen.
	*/
	public static void printNum(int n)
	{
		if(n == 0)
			System.out.println(n);
		else
		{
			printNum(n-1);
			System.out.println(n);
		}
	}
}