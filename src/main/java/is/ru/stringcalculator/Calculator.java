package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		
		else if (text.contains("//")){
			String delimiter = Character.toString(text.charAt(2));
			return sum(splitNumbers(text.substring(4), delimiter));
		}
		else if (text.contains(",")){
			return sum(splitNumbers(text, ","));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String delimiter){
		String comma = ",";
		String newline = "\n";
		numbers = numbers.replaceAll(delimiter, comma);
		numbers = numbers.replaceAll(newline, comma);
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}