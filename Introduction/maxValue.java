package Introduction;

/**
 *  Method maxValue, that takes in an array of numbers as an argument. 
 *  The method should return the largest number in the array.
 *  Solved without any built-in array.
 * 
*/

public class maxValue{
    public static double maxNumber(double[] numbers){

        // Set the first number as the largest number
        // use an if statement to see if the first is greater or bigger  than the second
        // then set the largest number as the greater between the two numbers
        // traverse through the entire array
        double max =Double.NEGATIVE_INFINITY;
        for(double num: numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }





    public static void main(String[] args) {

        // Regression Tests
        double[] numbers1 = {4,7,2,8,10,9};
        
    }
}