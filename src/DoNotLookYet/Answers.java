package DoNotLookYet;

import Company.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Answers
{
	public static List<String> getUniqueCompanies(List<Employee> employees)
	{
		return employees.stream().map(employee -> employee.getCompany()).distinct().collect(Collectors.toList());
	}

	public static List<String> streamFilterMapForEachTest(List<String> list)
	{
		return list.stream()
				.filter(string -> string.length() > 3)
				.map(string -> string.toUpperCase())
				.collect(Collectors.toList());

	}

	public static List<Integer> testFilter(List<Integer> list)
	{
		return list.stream().filter(n -> isEven.apply(n)).collect(Collectors.toList());
	}

	public static String testVarargs(String string, int... a)
	{
		return (string + Arrays.stream(a).sum());
	}

	public static Function<Integer, Boolean> isEven = (number) -> number % 2 == 0;


	public static BiFunction<String, List<Character>, String> concat = (string, chars) -> helperFunction(string, chars);

	private static String helperFunction(String string, List<Character> chars)
	{
		String upperCase = string.toUpperCase();
		StringBuilder sb = new StringBuilder();

		sb.append(upperCase);

		for ( Character ch: chars)
		{
			sb.append(ch);
		}

		return sb.toString();
	}


	public static IntFunction<String> helloworld = (number) -> {

		if(number < 0)
		{
			return "-1";
		}

		String thestring = "Hello, world!";
		if(number <= thestring.length())
		{
			return thestring.substring(0, number);
		}

		if(number > thestring.length())
		{
			StringBuilder sb = new StringBuilder();
			sb.append(thestring);
			for (int i = 0; i < number; i++)
			{
				sb.append("!");
			}
			return sb.toString();
		}

		return "-1";
	};
}
