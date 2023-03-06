import Company.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import static DoNotLookYet.Answers.getUniqueCompanies;
import static DoNotLookYet.Answers.isEven;
import static DoNotLookYet.Answers.concat;
import static DoNotLookYet.Answers.streamFilterMapForEachTest;
import static DoNotLookYet.Answers.testFilter;
import static DoNotLookYet.Answers.testVarargs;

public class Main
{
	public static void main(String[] args)
	{

		/**
		 * Can you write a Functional interface that takes an int and returns if isEven?
		 * Below should print false
		 *
		 */
		System.out.println(isEven.apply(999));



		/**
		 * Write a function interface called concat that takes a string and an array of characters,
		 * upper case the string,
		 * concatenate all the characters
		 * concatenate the string and the concatenated list
		 * return the new string
		 * Should print HELLO, world
		 */

		System.out.println(concat.apply("hello, ", List.of('w', 'o', 'r', 'l', 'd')));



		/**###########################################################################################

		/**** java.util.function has many functional interfaces that can be used in the future if needed ****/

		/**##########################################################################################



		/**
		 * Given this array of integers, write a function called testFilter that
		 * filter out the odd numbers using isEven from the previous example
		 */
		testFilter(Arrays.asList(1, 2, 2, 32, 3, 23, 23, 31, 231, 5234, 63745 ));


		/**
		 * using the stream, filter, map and foreach function, remove all the words shorter or equal to 3 characters,
		 * convert the rest to upper case and print it out with a function called streamFilterMapForEachTest
		 * Should print:
		 * MOON
		 * PLANET
		 * JUPITER
		 * SATURN
		 * ANDROMIDA
		 * NEPTUNE
		 * PLUTO
		 */

		streamFilterMapForEachTest(List.of("moon", "sun", "planet", "eye", "s", "jupiter", "saturn", "andromida", "neptune", "pluto", "a"));

		/**
		 * Write a static function that return a list of unique companies and print it out
		 * Should print
		 * SAP
		 * Apple
		 * Microsoft
		 * Amazon
		 */

		String sap = "SAP"; String apple = "Apple"; String microsoft = "Microsoft"; String amazon = "Amazon";
		List<Employee> employees = List.of(
				new Employee("Bob", sap),
				new Employee("Joe", apple),
				new Employee("Joe", microsoft),
				new Employee("Joe", microsoft),
				new Employee("Joe", amazon),
				new Employee("Joe", apple),
				new Employee("Bob", sap),
				new Employee("Joe", apple),
				new Employee("Joe", amazon),
				new Employee("Bob", sap),
				new Employee("Joe", apple),
				new Employee("Joe", sap),
				new Employee("Joe", amazon),
				new Employee("Joe", apple),
				new Employee("Joe", microsoft));

		getUniqueCompanies(employees).forEach(System.out::println);




		/**
		 * write a static function called testVarargs
		 * that takes a string and a list of integers using only primitive type parameters
		 * Using stream, add each of the int in the list and print it out
		 * Should print "The sum is 21"
		 * Can you call the Functional interface implemented earlier?
		 */
		testVarargs("The sum is ", 1, 2, 3, 4, 5, 6);



	}

}


