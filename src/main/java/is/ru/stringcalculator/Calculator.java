package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		else if(text.contains(",") || (text.contains("|\n"))){
				return sum(splitNumbers(text));
		}
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
 	    int currentNumber = 0;
        for(String number : numbers){
		    currentNumber = toInt(number);
		    if (currentNumber <= 1000){
		    	total += currentNumber;
		    }
		}

		return total;
    }

}








