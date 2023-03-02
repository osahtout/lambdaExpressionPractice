import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args)
	{
//		System.out.println("Hello world!");

		/**
		 * Can you write a public static Functional interface that takes an int and returns if isEven?
		 * Below should print false
		 *
		 */
		System.out.println(isEven.apply(999));

		/**** java.util.function has many functional interfaces that can be used in the future if needed ****/



		/**
		 * Given this array of integers, filter out the odd numbers using lambda expressions
		 * Can you write it without using the same call as before?
		 *
		 */
		testFilter(Arrays.asList(1, 2, 2, 32, 3, 23, 23, 31, 231, 5234, 63745 ));


		/**
		 * using the stream, filter, map and foreach function, remove all the words shorter or equal to 3 characters,
		 * convert the rest to upper case and print it out
		 * Should print:
		 * MOON
		 * PLANET
		 * JUPITER
		 * SATURN
		 * ANDROMIDA
		 * NEPTUNE
		 * PLUTO
		 */

		List<String> stringList = List.of("moon", "sun", "planet", "eye", "s", "jupiter", "saturn", "andromida", "neptune", "pluto", "a");

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

	public static List<String> getUniqueCompanies(List<Employee> employees)
	{
		return employees.stream().map(employee -> employee.getCompany()).distinct().collect(Collectors.toList());
	}

	public static void streamFilterMapForEachTest(List<String> list)
	{
		list.stream()
				.filter(string -> string.length() > 3)
				.map(string -> string.toUpperCase())
				.forEach(string -> System.out.println(string));

	}

	public static List<Integer> testFilter(List<Integer> list)
	{
		return list.stream().filter(n -> isEven.apply(n)).collect(Collectors.toList());
	}

	public static void testVarargs(String string, int... a)
	{
		System.out.println(string + Arrays.stream(a).sum());
	}

	public static Function<Integer, Boolean> isEven = (number) -> number % 2 == 0;

	//java.util.function

}


