import Company.Employee;

import java.util.Arrays;
import java.util.List;

//import static DoNotLookYet.Answers.getUniqueCompanies;
//import static DoNotLookYet.Answers.isEven;
//import static DoNotLookYet.Answers.concat;
//import static DoNotLookYet.Answers.helloworld;
//import static DoNotLookYet.Answers.streamFilterMapForEachTest;
//import static DoNotLookYet.Answers.testFilter;
//import static DoNotLookYet.Answers.testVarargs;

public class Main
{

	/** A few practice problem below to hopefully help with lambda expression and functional interfaces
	 	UNCOMMENT THE IF ELSE TO TEST YOUR FUNCTIONS **/




	/** WRITE YOUR STATIC FUNCTION HERE **/





	/** Static function end **/

	public static void main(String[] args) throws Exception
	{


		/**  1.0
		 * Can you write a Functional interface that takes an int and returns if isEven?
		 * Below should print false
		 *
		 */

//		if(Boolean.TRUE.equals(isEven.apply(999))) {
//			throw (new Exception(getErrorMessage(1)));
//		}
//		else{
//			System.out.println(getCompletedMessage(1));
//		}









		/** ============================================================================= */
		/** ============================================================================= */
		/** ============================================================================= */











		/**  2.0
		 * Write a function interface called concat that takes a string and an array of characters,
		 * upper case the string,
		 * concatenate all the characters
		 * concatenate the string and the concatenated list
		 * return the new string
		 * Should return HELLO, world
		 */


//		if(!concat.apply("hello, ", List.of('w', 'o', 'r', 'l', 'd')).equals("HELLO, world")) {
//			throw (new Exception(getErrorMessage(2)));
//		}
//		else {
//			System.out.println(getCompletedMessage(2));
//		}



		/**###########################################################################################

		/** java.util.function has many functional interfaces that takes one or two object and returns an object */

		/**
		 * some have predefined return objects to make it simple for developers.
		 * Predicate takes an objects and returns a boolean. We will see this in filters
		 *
		 * Other takes a certain primitive object like int and returns an object of preference
		 * IntFunction needs to specify the return object but always takes an int and return the object specified

		/**########################################################################################## */



		/** 3.0
		 * use IntFunction that takes a number and return Hello, world! up to the number specified where h is 1.
		 * 3.1 if 3 is specified, it should return Hel
		 * 3.2 if the user specify a negative number, return "-1"
		 * 3.3 if the user specifies a number longer than the characters available add ! until the number is reached
		 */

//		if(!helloworld.apply(3).equals("Hel"))
//		{
//			throw (new Exception(getErrorMessage(3.1)));
//		}
//		else {
//			System.out.println(getCompletedMessage(3.1));
//		}
//
//		if(!helloworld.apply(-1).equals("-1"))
//		{
//			throw (new Exception(getErrorMessage(3.2)));
//		}
//		else {
//			System.out.println(getCompletedMessage(3.2));
//		}
//
//		if(!helloworld.apply(20).equals("Hello, world!!!!!!!!!!!!!!!!!!!!!"))
//		{
//			throw (new Exception(getErrorMessage(3.3)));
//		}
//		else {
//			System.out.println(getCompletedMessage(3.3));
//		}










		/** ============================================================================= */
		/** ============================================================================= */
		/** ============================================================================= */












		/** 4.0
		 * Given this array of integers, write a function called testFilter that
		 * filter out the odd numbers using isEven from the previous example
		 */

//		final List<Integer> filtered = testFilter(Arrays.asList(1, 2, 2, 32, 3, 23, 23, 31, 231, 5234, 63745));
//
//		if(Arrays.equals(expected.toArray(), filtered.toArray()))
//		{
//			System.out.println(getCompletedMessage(4));
//		}
//		else
//		{
//			throw (new Exception(getErrorMessage(4)));
//		}









		/** ============================================================================= */
		/** ============================================================================= */
		/** ============================================================================= */










		/** 5.0
		 * using the stream, filter, map and foreach function, remove all the words shorter or equal to 3 characters,
		 * convert the rest to upper case and return it out with a function called streamFilterMapForEachTest
		 */

//		final List<String> manipulatedString = streamFilterMapForEachTest(
//				List.of("moon", "sun", "planet", "eye", "s", "jupiter", "saturn", "andromida", "neptune", "pluto", "a"));
//
//		if(Arrays.equals(expectedList.toArray(), manipulatedString.toArray()))
//		{
//			System.out.println(getCompletedMessage(5));
//		}
//		else
//		{
//			throw (new Exception(getErrorMessage(5)));
//		}







		/** ============================================================================= */
		/** ============================================================================= */
		/** ============================================================================= */











		/** 6.0
		 * Write a static function that return a list of unique companies and print it out
		 */
//		List<Employee> employees = List.of(
//				new Employee("Bob", sap),
//				new Employee("Joe", apple),
//				new Employee("Joe", microsoft),
//				new Employee("Joe", microsoft),
//				new Employee("Joe", amazon),
//				new Employee("Joe", apple),
//				new Employee("Bob", sap),
//				new Employee("Joe", apple),
//				new Employee("Joe", amazon),
//				new Employee("Bob", sap),
//				new Employee("Joe", apple),
//				new Employee("Joe", sap),
//				new Employee("Joe", amazon),
//				new Employee("Joe", apple),
//				new Employee("Joe", microsoft));
//
//		final List<String> uniqueCompanies = getUniqueCompanies(employees);
//
//		if(Arrays.equals(expectedUniqueCompanies.toArray(), uniqueCompanies.toArray()))
//		{
//			System.out.println(getCompletedMessage(6));
//		}
//		else
//		{
//			throw (new Exception(getErrorMessage(5)));
//		}






		/** ============================================================================= */
		/** ============================================================================= */
		/** ============================================================================= */








		/** 7.0 bonus
		 * write a static function called testVarargs
		 * that takes a string and a list of integers using only primitive type parameters
		 * Using stream, add each of the int in the list and print it out
		 * Should print "The sum is 21"
		 * Can you call the Functional interface implemented earlier?
		 */

//		final String theSumIsString = testVarargs("The sum is ", 1, 2, 3, 4, 5, 6);
//
//
//		if(theSumIsString.equals(expectedString))
//		{
//			System.out.println(getCompletedMessage(7));
//		}
//		else
//		{
//			throw (new Exception(getErrorMessage(7)));
//		}

	}

	/**
	 * or write your function down here
	 */



















	/**#################
	  HELPER FUNCTIONS
	 #################*/

	static String sap = "SAP"; static String apple = "Apple"; static String microsoft = "Microsoft"; static String amazon = "Amazon";

	private static String getErrorMessage(double number)
	{
		return "The answer given doesn't seem to be correct for "+number+"\n"
				+ "Can you please try again";
	}

	private static String getCompletedMessage(double number)
	{
		return "Done "+number;
	}
	final static List<Integer> expected = List.of(2, 2, 32, 5234);
	final static List<String> expectedList = List.of("MOON", "PLANET", "JUPITER", "SATURN", "ANDROMIDA", "NEPTUNE", "PLUTO");

	final static List<String> expectedUniqueCompanies = List.of(sap, apple, microsoft, amazon);
	final static String expectedString = "The sum is 21";

}


