package Introduction;
/**
 * Write a method that takes in a number as an argument. The method should 
 * return a boolean indicating whether or not the given number is prime.
 * 
 * A prime number is a number that is only divisible by two distinct numbers: 1 and itself
 * 
 * Assume the input number is a positive integer
 * @param args int number
 */

Public class isPrime{

    public static boolean isItPrime(int number){
        // The purpose of this function is to determine if the parameter is prime or not
        // The condition for a number to be prime is that it is divisible by 1 or by itself
        if(number < 2){
    return false;
  }
    for (int i=2; i <= Math.sqrt(number); i +=1){
      if (number % i ==0){
        return false;
      }
    }
    return true;

    }

    public static void main(String[] args) {
         
    }
}