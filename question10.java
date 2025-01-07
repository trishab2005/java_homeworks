//author trisha 


class question10 {
    public static void main(String[] args) {
        Properties(5);                     //Main method
    }

     static void Properties(int number) {
        if (Prime(number)) {                      //Method used for checking prime and odd
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        if (Odd(number)) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is not an odd number");
        }
    }

    static boolean Prime(int num) {
        if (num <= 1) {             //Method for Checking prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean Odd(int num) {
         if(num%2!=0){            //Method for checking odd
			 
		 }
		 return true;
	}
}