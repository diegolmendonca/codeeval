public class Main {
    public static void main (String[] args)  {
    	for(int i = 999; i>=3; i -= 2){
    		
    		if(isPalindrome(i) && isPrime(i)){
    			System.out.println(i);
    			return;
    		}
    	}
    	
    }

	private static boolean isPrime(int number) {
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

	private static boolean isPalindrome(int number) {
		String value = Integer.toString(number);
		return value.equals(new StringBuffer(value).reverse().toString());
	}
    

}
